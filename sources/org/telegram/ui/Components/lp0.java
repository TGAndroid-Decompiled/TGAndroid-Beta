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
    public final boolean f27079a;
    public final Runnable f27080b;
    public final Paint f27081c = new Paint(1);
    public final Paint d;
    public yj0 e;
    public final Path f27082f;
    public final h11 f27083g;
    public final Path h;
    public final Path f27084i;
    public boolean f27085j;
    public int f27086k;
    public final g6 f27087l;
    public final g6 f27088m;
    public final g6 f27089n;
    public final g6 f27090o;
    public final kp0 f27091p;
    public boolean f27092q;
    public final RectF f27093r;
    public final RectF f27094s;
    public float f27095t;
    public long f27096u;
    public float v;
    public boolean f27097w;
    public final yc0 f27098x;

    public lp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f27082f = path;
        this.f27083g = new h11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f27084i = path3;
        this.f27086k = 1;
        this.f27093r = new RectF();
        this.f27094s = new RectF();
        this.f27098x = new yc0(this, 28);
        this.f27080b = runnable;
        this.f27079a = z10;
        es esVar = es.h;
        g6 g6Var = new g6(runnable, 360L, esVar, 0);
        this.f27087l = g6Var;
        g6Var.d(0.0f, true);
        this.f27088m = new g6(runnable, 320L, esVar, 0);
        this.f27089n = new g6(runnable, 200L, esVar, 0);
        g6 g6Var2 = new g6(runnable, 360L, esVar, 0);
        this.f27090o = g6Var2;
        g6Var2.d(0.0f, true);
        kp0 kp0Var = new kp0(runnable);
        this.f27091p = kp0Var;
        kp0Var.A = 0.3f;
        kp0Var.m(0.4f, 650L, 1.6f, esVar);
        kp0Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kp0Var.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        kp0Var.u(-1);
        kp0Var.f28748b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f27092q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f27085j && this.f27087l.f25190c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f27085j = z10;
        this.f27080b.run();
        yj0 yj0Var = this.e;
        if (yj0Var != null && this.f27092q) {
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
            kp0 kp0Var = this.f27091p;
            kp0Var.a();
            kp0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f27086k = i10;
        if (!z10) {
            this.f27088m.d(i10, true);
        }
        this.f27080b.run();
        if (this.f27092q && Math.abs(f7) > 3.0f && !this.f27097w) {
            this.f27097w = true;
            AndroidUtilities.runOnUIThread(this.f27098x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f27091p.c() + AndroidUtilities.dp(46.0f);
        float e = this.f27087l.e(this.f27085j);
        float d = this.f27088m.d(this.f27086k, false);
        if (e > 0.0f) {
            float d10 = this.f27089n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f27096u)) / 1000.0f);
            this.f27096u = currentTimeMillis;
            this.f27095t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f27095t;
            this.f27080b.run();
            float f7 = c10 / 2.0f;
            this.f27093r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f27079a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f27093r.centerX(), this.f27093r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f27093r);
            this.f27081c.setColor(org.telegram.ui.ActionBar.g6.m1(f10, -16777216));
            RectF rectF = this.f27093r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f27093r.height() / 2.0f, this.f27081c);
            this.f27091p.p(this.f27093r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f27093r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f27093r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.g6.m1(((((((float) Math.sin(this.f27095t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.g6.m1(((((((float) Math.sin((this.f27095t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            kp0 kp0Var = this.f27091p;
            kp0Var.B = (int) (e * 255.0f);
            kp0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f27093r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f27093r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.g6.m1(((((((float) Math.sin(this.f27095t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f27084i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.g6.m1(((((((float) Math.sin((this.f27095t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f27084i, this.d);
            canvas.restore();
            canvas.restore();
            g6 g6Var = this.f27090o;
            if (this.f27092q && this.f27085j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = g6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    yj0 yj0Var = new yj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = yj0Var;
                    yj0Var.J(true);
                    this.e.setCallback(new ah.f1(this, 4));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f27083g.f25473c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f27094s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f27093r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f27093r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f27094s.centerX(), this.f27094s.top);
                this.f27081c.setColor(org.telegram.ui.ActionBar.g6.m1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f27094s.centerX(), this.f27094s.top);
                canvas.drawPath(this.f27082f, this.f27081c);
                canvas.restore();
                canvas.drawRoundRect(this.f27094s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f27081c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f27094s.left), ((int) this.f27094s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f27094s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f27094s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f31615k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f27083g.c(this.f27094s.left + AndroidUtilities.dp(39.0f), this.f27094s.centerY(), e7, -1, canvas);
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
