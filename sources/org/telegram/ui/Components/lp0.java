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
public final class lp0 extends Drawable {
    public final boolean f28388a;
    public final Runnable f28389b;
    public final Paint f28390c = new Paint(1);
    public final Paint d;
    public yj0 e;
    public final Path f28391f;
    public final i11 f28392g;
    public final Path h;
    public final Path f28393i;
    public boolean f28394j;
    public int f28395k;
    public final f6 f28396l;
    public final f6 f28397m;
    public final f6 f28398n;
    public final f6 f28399o;
    public final ei.k f28400p;
    public boolean f28401q;
    public final RectF f28402r;
    public final RectF f28403s;
    public float f28404t;
    public long f28405u;
    public float v;
    public boolean f28406w;
    public final yb0 f28407x;

    public lp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f28391f = path;
        this.f28392g = new i11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f28393i = path3;
        this.f28395k = 1;
        this.f28402r = new RectF();
        this.f28403s = new RectF();
        this.f28407x = new yb0(this, 28);
        this.f28389b = runnable;
        this.f28388a = z10;
        bs bsVar = bs.h;
        f6 f6Var = new f6(runnable, 360L, bsVar, 0);
        this.f28396l = f6Var;
        f6Var.d(0.0f, true);
        this.f28397m = new f6(runnable, 320L, bsVar, 0);
        this.f28398n = new f6(runnable, 200L, bsVar, 0);
        f6 f6Var2 = new f6(runnable, 360L, bsVar, 0);
        this.f28399o = f6Var2;
        f6Var2.d(0.0f, true);
        ei.k kVar = new ei.k(runnable);
        this.f28400p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, bsVar);
        kVar.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        kVar.u(-1);
        kVar.f29437b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f28401q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f28394j && this.f28396l.f26180c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f28394j = z10;
        this.f28389b.run();
        yj0 yj0Var = this.e;
        if (yj0Var != null && this.f28401q) {
            if (z10) {
                yj0Var.H(false);
            } else {
                yj0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            ei.k kVar = this.f28400p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f28395k = i10;
        if (!z10) {
            this.f28397m.d(i10, true);
        }
        this.f28389b.run();
        if (this.f28401q && Math.abs(f7) > 3.0f && !this.f28406w) {
            this.f28406w = true;
            AndroidUtilities.runOnUIThread(this.f28407x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f28400p.c() + AndroidUtilities.dp(46.0f);
        float e = this.f28396l.e(this.f28394j);
        float d = this.f28397m.d(this.f28395k, false);
        if (e > 0.0f) {
            float d10 = this.f28398n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f28405u)) / 1000.0f);
            this.f28405u = currentTimeMillis;
            this.f28404t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f28404t;
            this.f28389b.run();
            float f7 = c10 / 2.0f;
            this.f28402r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f28388a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f28402r.centerX(), this.f28402r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f28402r);
            this.f28390c.setColor(org.telegram.ui.ActionBar.k6.o1(f10, -16777216));
            RectF rectF = this.f28402r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f28402r.height() / 2.0f, this.f28390c);
            this.f28400p.p(this.f28402r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f28402r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f28402r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.o1(((((((float) Math.sin(this.f28404t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.o1(((((((float) Math.sin((this.f28404t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            ei.k kVar = this.f28400p;
            kVar.B = (int) (e * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f28402r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f28402r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.o1(((((((float) Math.sin(this.f28404t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f28393i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.o1(((((((float) Math.sin((this.f28404t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f28393i, this.d);
            canvas.restore();
            canvas.restore();
            f6 f6Var = this.f28399o;
            if (this.f28401q && this.f28394j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = f6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    yj0 yj0Var = new yj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = yj0Var;
                    yj0Var.J(true);
                    this.e.setCallback(new ah.f1(this, 5));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f28392g.f27164c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f28403s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f28402r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f28402r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f28403s.centerX(), this.f28403s.top);
                this.f28390c.setColor(org.telegram.ui.ActionBar.k6.o1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f28403s.centerX(), this.f28403s.top);
                canvas.drawPath(this.f28391f, this.f28390c);
                canvas.restore();
                canvas.drawRoundRect(this.f28403s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f28390c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f28403s.left), ((int) this.f28403s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f28403s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f28403s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f32946k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f28392g.c(this.f28403s.left + AndroidUtilities.dp(39.0f), this.f28403s.centerY(), e7, -1, canvas);
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
