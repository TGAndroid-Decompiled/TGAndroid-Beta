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
    public final boolean f32154a;
    public final Runnable f32155b;
    public final Paint f32156c = new Paint(1);
    public final Paint d;
    public fk0 f32157e;
    public final Path f32158f;
    public final r11 f32159g;
    public final Path h;
    public final Path f32160i;
    public boolean f32161j;
    public int f32162k;
    public final g6 f32163l;
    public final g6 f32164m;
    public final g6 f32165n;
    public final g6 f32166o;
    public final up0 f32167p;
    public boolean f32168q;
    public final RectF f32169r;
    public final RectF f32170s;
    public float f32171t;
    public long f32172u;
    public float v;
    public boolean f32173w;
    public final cd0 f32174x;

    public vp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f32158f = path;
        this.f32159g = new r11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f32160i = path3;
        this.f32162k = 1;
        this.f32169r = new RectF();
        this.f32170s = new RectF();
        this.f32174x = new cd0(this, 28);
        this.f32155b = runnable;
        this.f32154a = z10;
        js jsVar = js.h;
        g6 g6Var = new g6(runnable, 360L, jsVar, 0);
        this.f32163l = g6Var;
        g6Var.d(0.0f, true);
        this.f32164m = new g6(runnable, 320L, jsVar, 0);
        this.f32165n = new g6(runnable, 200L, jsVar, 0);
        g6 g6Var2 = new g6(runnable, 360L, jsVar, 0);
        this.f32166o = g6Var2;
        g6Var2.d(0.0f, true);
        up0 up0Var = new up0(runnable);
        this.f32167p = up0Var;
        up0Var.A = 0.3f;
        up0Var.m(0.4f, 650L, 1.6f, jsVar);
        up0Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        up0Var.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        up0Var.u(-1);
        up0Var.f29712b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f32168q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f32161j && this.f32163l.f26303c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f32161j = z10;
        this.f32155b.run();
        fk0 fk0Var = this.f32157e;
        if (fk0Var != null && this.f32168q) {
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
            up0 up0Var = this.f32167p;
            up0Var.a();
            up0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f32162k = i10;
        if (!z10) {
            this.f32164m.d(i10, true);
        }
        this.f32155b.run();
        if (this.f32168q && Math.abs(f7) > 3.0f && !this.f32173w) {
            this.f32173w = true;
            AndroidUtilities.runOnUIThread(this.f32174x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f32167p.c() + AndroidUtilities.dp(46.0f);
        float e7 = this.f32163l.e(this.f32161j);
        float d = this.f32164m.d(this.f32162k, false);
        if (e7 > 0.0f) {
            float d10 = this.f32165n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f32172u)) / 1000.0f);
            this.f32172u = currentTimeMillis;
            this.f32171t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f32171t;
            this.f32155b.run();
            float f7 = c10 / 2.0f;
            this.f32169r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f32154a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f32169r.centerX(), this.f32169r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f32169r);
            this.f32156c.setColor(org.telegram.ui.ActionBar.h6.m1(f10, -16777216));
            RectF rectF = this.f32169r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f32169r.height() / 2.0f, this.f32156c);
            this.f32167p.p(this.f32169r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f32169r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f32169r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f32171t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f32171t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            up0 up0Var = this.f32167p;
            up0Var.B = (int) (e7 * 255.0f);
            up0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f32169r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f32169r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin(this.f32171t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f32160i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.h6.m1(((((((float) Math.sin((this.f32171t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f32160i, this.d);
            canvas.restore();
            canvas.restore();
            g6 g6Var = this.f32166o;
            if (this.f32168q && this.f32161j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f32157e == null) {
                    fk0 fk0Var = new fk0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f32157e = fk0Var;
                    fk0Var.J(true);
                    this.f32157e.setCallback(new i.f(this, 3));
                    this.f32157e.K(1);
                    this.f32157e.start();
                }
                float dp = this.f32159g.f29988c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f32170s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f32169r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f32169r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f32170s.centerX(), this.f32170s.top);
                this.f32156c.setColor(org.telegram.ui.ActionBar.h6.m1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f32170s.centerX(), this.f32170s.top);
                canvas.drawPath(this.f32158f, this.f32156c);
                canvas.restore();
                canvas.drawRoundRect(this.f32170s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f32156c);
                this.f32157e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f32170s.left), ((int) this.f32170s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f32170s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f32170s.centerY()));
                this.f32157e.setAlpha((int) (255.0f * e10));
                if (!this.f32157e.f26115k0) {
                    this.f32157e.H(true);
                }
                this.f32157e.draw(canvas);
                this.f32159g.c(this.f32170s.left + AndroidUtilities.dp(39.0f), this.f32170s.centerY(), e10, -1, canvas);
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
