package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class lo0 extends Drawable {
    public final boolean f25934a;
    public final Runnable f25935b;
    public final Paint f25936c = new Paint(1);
    public final Paint d;
    public yi0 e;
    public final Path f25937f;
    public final h01 f25938g;
    public final Path h;
    public final Path f25939i;
    public boolean f25940j;
    public int f25941k;
    public final c6 f25942l;
    public final c6 f25943m;
    public final c6 f25944n;
    public final c6 f25945o;
    public final ko0 f25946p;
    public boolean f25947q;
    public final RectF f25948r;
    public final RectF f25949s;
    public float f25950t;
    public long f25951u;
    public float v;
    public boolean f25952w;
    public final bc0 f25953x;

    public lo0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f25937f = path;
        this.f25938g = new h01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f25939i = path3;
        this.f25941k = 1;
        this.f25948r = new RectF();
        this.f25949s = new RectF();
        this.f25953x = new bc0(this, 27);
        this.f25935b = runnable;
        this.f25934a = z10;
        qr qrVar = qr.h;
        c6 c6Var = new c6(runnable, 360L, qrVar, 0);
        this.f25942l = c6Var;
        c6Var.d(0.0f, true);
        this.f25943m = new c6(runnable, 320L, qrVar, 0);
        this.f25944n = new c6(runnable, 200L, qrVar, 0);
        c6 c6Var2 = new c6(runnable, 360L, qrVar, 0);
        this.f25945o = c6Var2;
        c6Var2.d(0.0f, true);
        ko0 ko0Var = new ko0(runnable);
        this.f25946p = ko0Var;
        ko0Var.v = 0.3f;
        ko0Var.f26083u = 0.4f;
        ko0Var.f26080r = 650L;
        ko0Var.f26082t = 1.6f;
        ko0Var.f26081s = qrVar;
        ko0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        ko0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        ko0Var.r(-1);
        ko0Var.f26067b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f25947q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f25940j && this.f25942l.f22937c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f25940j = z10;
        this.f25935b.run();
        yi0 yi0Var = this.e;
        if (yi0Var != null && this.f25947q) {
            if (z10) {
                yi0Var.H(false);
            } else {
                yi0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            ko0 ko0Var = this.f25946p;
            ko0Var.b();
            ko0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f25941k = i10;
        if (!z10) {
            this.f25943m.d(i10, true);
        }
        this.f25935b.run();
        if (this.f25947q && Math.abs(f7) > 3.0f && !this.f25952w) {
            this.f25952w = true;
            AndroidUtilities.runOnUIThread(this.f25953x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f25946p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f25942l.e(this.f25940j);
        float d10 = this.f25943m.d(this.f25941k, false);
        if (e > 0.0f) {
            float d11 = this.f25944n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f25951u)) / 1000.0f);
            this.f25951u = currentTimeMillis;
            this.f25950t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f25950t;
            this.f25935b.run();
            float f7 = d / 2.0f;
            this.f25948r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f25934a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f25948r.centerX(), this.f25948r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f25948r);
            this.f25936c.setColor(org.telegram.ui.ActionBar.j6.l1(f10, -16777216));
            RectF rectF = this.f25948r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f25948r.height() / 2.0f, this.f25936c);
            this.f25946p.m(this.f25948r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f25948r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f25948r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f25950t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f25950t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            ko0 ko0Var = this.f25946p;
            ko0Var.f26084w = (int) (e * 255.0f);
            ko0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f25948r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f25948r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f25950t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f25939i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f25950t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f25939i, this.d);
            canvas.restore();
            canvas.restore();
            c6 c6Var = this.f25945o;
            if (this.f25947q && this.f25940j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = c6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    yi0 yi0Var = new yi0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = yi0Var;
                    yi0Var.J(true);
                    this.e.setCallback(new ah.d(this, 4));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f25938g.f24439c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f25949s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f25948r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f25948r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f25949s.centerX(), this.f25949s.top);
                this.f25936c.setColor(org.telegram.ui.ActionBar.j6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f25949s.centerX(), this.f25949s.top);
                canvas.drawPath(this.f25937f, this.f25936c);
                canvas.restore();
                canvas.drawRoundRect(this.f25949s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f25936c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f25949s.left), ((int) this.f25949s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f25949s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f25949s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f30233l0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f25938g.c(this.f25949s.left + AndroidUtilities.dp(39.0f), this.f25949s.centerY(), e7, -1, canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
