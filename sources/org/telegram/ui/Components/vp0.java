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
public final class vp0 extends Drawable {
    public final boolean f32139a;
    public final Runnable f32140b;
    public final Paint f32141c = new Paint(1);
    public final Paint d;
    public fk0 f32142e;
    public final Path f32143f;
    public final r11 f32144g;
    public final Path h;
    public final Path f32145i;
    public boolean f32146j;
    public int f32147k;
    public final g6 f32148l;
    public final g6 f32149m;
    public final g6 f32150n;
    public final g6 f32151o;
    public final up0 f32152p;
    public boolean f32153q;
    public final RectF f32154r;
    public final RectF f32155s;
    public float f32156t;
    public long f32157u;
    public float v;
    public boolean f32158w;
    public final cd0 f32159x;

    public vp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f32143f = path;
        this.f32144g = new r11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f32145i = path3;
        this.f32147k = 1;
        this.f32154r = new RectF();
        this.f32155s = new RectF();
        this.f32159x = new cd0(this, 28);
        this.f32140b = runnable;
        this.f32139a = z10;
        js jsVar = js.h;
        g6 g6Var = new g6(runnable, 360L, jsVar, 0);
        this.f32148l = g6Var;
        g6Var.d(0.0f, true);
        this.f32149m = new g6(runnable, 320L, jsVar, 0);
        this.f32150n = new g6(runnable, 200L, jsVar, 0);
        g6 g6Var2 = new g6(runnable, 360L, jsVar, 0);
        this.f32151o = g6Var2;
        g6Var2.d(0.0f, true);
        up0 up0Var = new up0(runnable);
        this.f32152p = up0Var;
        up0Var.A = 0.3f;
        up0Var.m(0.4f, 650L, 1.6f, jsVar);
        up0Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        up0Var.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        up0Var.u(-1);
        up0Var.f29690b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f32153q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f32146j && this.f32148l.f26301c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f32146j = z10;
        this.f32140b.run();
        fk0 fk0Var = this.f32142e;
        if (fk0Var != null && this.f32153q) {
            if (z10) {
                fk0Var.H(false);
            } else {
                fk0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            up0 up0Var = this.f32152p;
            up0Var.a();
            up0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f32147k = i10;
        if (!z10) {
            this.f32149m.d(i10, true);
        }
        this.f32140b.run();
        if (this.f32153q && Math.abs(f7) > 3.0f && !this.f32158w) {
            this.f32158w = true;
            AndroidUtilities.runOnUIThread(this.f32159x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f32152p.c() + AndroidUtilities.dp(46.0f);
        float e7 = this.f32148l.e(this.f32146j);
        float d = this.f32149m.d(this.f32147k, false);
        if (e7 > 0.0f) {
            float d10 = this.f32150n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f32157u)) / 1000.0f);
            this.f32157u = currentTimeMillis;
            this.f32156t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f32156t;
            this.f32140b.run();
            float f7 = c10 / 2.0f;
            this.f32154r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f32139a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f32154r.centerX(), this.f32154r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f32154r);
            this.f32141c.setColor(org.telegram.ui.ActionBar.h6.m1(f10, -16777216));
            RectF rectF = this.f32154r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f32154r.height() / 2.0f, this.f32141c);
            this.f32152p.p(this.f32154r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f32154r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f32154r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f32156t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f32156t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            up0 up0Var = this.f32152p;
            up0Var.B = (int) (e7 * 255.0f);
            up0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f32154r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f32154r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f32156t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f32145i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f32156t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f32145i, this.d);
            canvas.restore();
            canvas.restore();
            g6 g6Var = this.f32151o;
            if (this.f32153q && this.f32146j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f32142e == null) {
                    fk0 fk0Var = new fk0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f32142e = fk0Var;
                    fk0Var.J(true);
                    this.f32142e.setCallback(new i.f(this, 3));
                    this.f32142e.K(1);
                    this.f32142e.start();
                }
                float dp = this.f32144g.f29989c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f32155s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f32154r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f32154r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f32155s.centerX(), this.f32155s.top);
                this.f32141c.setColor(org.telegram.ui.ActionBar.h6.m1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f32155s.centerX(), this.f32155s.top);
                canvas.drawPath(this.f32143f, this.f32141c);
                canvas.restore();
                canvas.drawRoundRect(this.f32155s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f32141c);
                this.f32142e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f32155s.left), ((int) this.f32155s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f32155s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f32155s.centerY()));
                this.f32142e.setAlpha((int) (255.0f * e10));
                if (!this.f32142e.f26117k0) {
                    this.f32142e.H(true);
                }
                this.f32142e.draw(canvas);
                this.f32144g.c(this.f32155s.left + AndroidUtilities.dp(39.0f), this.f32155s.centerY(), e10, -1, canvas);
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
