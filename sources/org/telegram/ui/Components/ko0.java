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
public final class ko0 extends Drawable {
    public final boolean f27888a;
    public final Runnable f27889b;
    public final Paint f27890c = new Paint(1);
    public final Paint d;
    public xi0 f27891e;
    public final Path f27892f;
    public final f01 f27893g;
    public final Path h;
    public final Path f27894i;
    public boolean f27895j;
    public int f27896k;
    public final e6 f27897l;
    public final e6 f27898m;
    public final e6 f27899n;
    public final e6 f27900o;
    public final jo0 f27901p;
    public boolean f27902q;
    public final RectF f27903r;
    public final RectF f27904s;
    public float f27905t;
    public long f27906u;
    public float v;
    public boolean f27907w;
    public final cc0 f27908x;

    public ko0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f27892f = path;
        this.f27893g = new f01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f27894i = path3;
        this.f27896k = 1;
        this.f27903r = new RectF();
        this.f27904s = new RectF();
        this.f27908x = new cc0(this, 27);
        this.f27889b = runnable;
        this.f27888a = z10;
        pr prVar = pr.h;
        e6 e6Var = new e6(runnable, 360L, prVar, 0);
        this.f27897l = e6Var;
        e6Var.d(0.0f, true);
        this.f27898m = new e6(runnable, 320L, prVar, 0);
        this.f27899n = new e6(runnable, 200L, prVar, 0);
        e6 e6Var2 = new e6(runnable, 360L, prVar, 0);
        this.f27900o = e6Var2;
        e6Var2.d(0.0f, true);
        jo0 jo0Var = new jo0(runnable);
        this.f27901p = jo0Var;
        jo0Var.v = 0.3f;
        jo0Var.f29329u = 0.4f;
        jo0Var.f29326r = 650L;
        jo0Var.f29328t = 1.6f;
        jo0Var.f29327s = prVar;
        jo0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        jo0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        jo0Var.r(-1);
        jo0Var.f29312b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f27902q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f27895j && this.f27897l.f25592c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f27895j = z10;
        this.f27889b.run();
        xi0 xi0Var = this.f27891e;
        if (xi0Var != null && this.f27902q) {
            if (z10) {
                xi0Var.F(false);
            } else {
                xi0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            jo0 jo0Var = this.f27901p;
            jo0Var.b();
            jo0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f27896k = i10;
        if (!z10) {
            this.f27898m.d(i10, true);
        }
        this.f27889b.run();
        if (this.f27902q && Math.abs(f7) > 3.0f && !this.f27907w) {
            this.f27907w = true;
            AndroidUtilities.runOnUIThread(this.f27908x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f27901p.d() + AndroidUtilities.dp(46.0f);
        float e7 = this.f27897l.e(this.f27895j);
        float d10 = this.f27898m.d(this.f27896k, false);
        if (e7 > 0.0f) {
            float d11 = this.f27899n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f27906u)) / 1000.0f);
            this.f27906u = currentTimeMillis;
            this.f27905t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f27905t;
            this.f27889b.run();
            float f7 = d / 2.0f;
            this.f27903r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f27888a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f27903r.centerX(), this.f27903r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f27903r);
            this.f27890c.setColor(org.telegram.ui.ActionBar.j6.l1(f10, -16777216));
            RectF rectF = this.f27903r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f27903r.height() / 2.0f, this.f27890c);
            this.f27901p.m(this.f27903r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f27903r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f27903r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27905t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27905t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            jo0 jo0Var = this.f27901p;
            jo0Var.f29330w = (int) (e7 * 255.0f);
            jo0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f27903r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f27903r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27905t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
            canvas.drawPath(this.f27894i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27905t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e7, -1));
            canvas.drawPath(this.f27894i, this.d);
            canvas.restore();
            canvas.restore();
            e6 e6Var = this.f27900o;
            if (this.f27902q && this.f27895j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = e6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f27891e == null) {
                    xi0 xi0Var = new xi0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f27891e = xi0Var;
                    xi0Var.H(true);
                    this.f27891e.setCallback(new ah.g1(this, 4));
                    this.f27891e.I(1);
                    this.f27891e.start();
                }
                float dp = this.f27893g.f25874c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f27904s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f27903r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f27903r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f27904s.centerX(), this.f27904s.top);
                this.f27890c.setColor(org.telegram.ui.ActionBar.j6.l1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f27904s.centerX(), this.f27904s.top);
                canvas.drawPath(this.f27892f, this.f27890c);
                canvas.restore();
                canvas.drawRoundRect(this.f27904s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f27890c);
                this.f27891e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f27904s.left), ((int) this.f27904s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f27904s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f27904s.centerY()));
                this.f27891e.setAlpha((int) (255.0f * e10));
                if (!this.f27891e.f32593l0) {
                    this.f27891e.F(true);
                }
                this.f27891e.draw(canvas);
                this.f27893g.c(this.f27904s.left + AndroidUtilities.dp(39.0f), this.f27904s.centerY(), e10, -1, canvas);
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
