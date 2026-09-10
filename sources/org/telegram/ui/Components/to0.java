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
public final class to0 extends Drawable {
    public final boolean f27442a;
    public final Runnable f27443b;
    public final Paint f27444c = new Paint(1);
    public final Paint d;
    public hj0 e;
    public final Path f27445f;
    public final t01 f27446g;
    public final Path h;
    public final Path f27447i;
    public boolean f27448j;
    public int f27449k;
    public final d6 f27450l;
    public final d6 f27451m;
    public final d6 f27452n;
    public final d6 f27453o;
    public final so0 f27454p;
    public boolean f27455q;
    public final RectF f27456r;
    public final RectF f27457s;
    public float f27458t;
    public long f27459u;
    public float v;
    public boolean f27460w;
    public final kc0 f27461x;

    public to0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f27445f = path;
        this.f27446g = new t01(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f27447i = path3;
        this.f27449k = 1;
        this.f27456r = new RectF();
        this.f27457s = new RectF();
        this.f27461x = new kc0(this, 27);
        this.f27443b = runnable;
        this.f27442a = z10;
        wr wrVar = wr.h;
        d6 d6Var = new d6(runnable, 360L, wrVar, 0);
        this.f27450l = d6Var;
        d6Var.d(0.0f, true);
        this.f27451m = new d6(runnable, 320L, wrVar, 0);
        this.f27452n = new d6(runnable, 200L, wrVar, 0);
        d6 d6Var2 = new d6(runnable, 360L, wrVar, 0);
        this.f27453o = d6Var2;
        d6Var2.d(0.0f, true);
        so0 so0Var = new so0(runnable);
        this.f27454p = so0Var;
        so0Var.v = 0.3f;
        so0Var.f25441u = 0.4f;
        so0Var.f25438r = 650L;
        so0Var.f25440t = 1.6f;
        so0Var.f25439s = wrVar;
        so0Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        so0Var.t(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        so0Var.r(-1);
        so0Var.f25425b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f27455q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : false;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f27448j && this.f27450l.f22295c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f27448j = z10;
        this.f27443b.run();
        hj0 hj0Var = this.e;
        if (hj0Var != null && this.f27455q) {
            if (z10) {
                hj0Var.H(false);
            } else {
                hj0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            so0 so0Var = this.f27454p;
            so0Var.b();
            so0Var.q(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f27449k = i10;
        if (!z10) {
            this.f27451m.d(i10, true);
        }
        this.f27443b.run();
        if (this.f27455q && Math.abs(f7) > 3.0f && !this.f27460w) {
            this.f27460w = true;
            AndroidUtilities.runOnUIThread(this.f27461x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float d = this.f27454p.d() + AndroidUtilities.dp(46.0f);
        float e = this.f27450l.e(this.f27448j);
        float d10 = this.f27451m.d(this.f27449k, false);
        if (e > 0.0f) {
            float d11 = this.f27452n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f27459u)) / 1000.0f);
            this.f27459u = currentTimeMillis;
            this.f27458t = (Math.min(d11, 4.0f) * 1.5f * min) + this.f27458t;
            this.f27443b.run();
            float f7 = d / 2.0f;
            this.f27456r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f27442a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f27456r.centerX(), this.f27456r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f27456r);
            this.f27444c.setColor(org.telegram.ui.ActionBar.j6.l1(f10, -16777216));
            RectF rectF = this.f27456r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f27456r.height() / 2.0f, this.f27444c);
            this.f27454p.m(this.f27456r);
            canvas.save();
            float f12 = -d10;
            canvas.translate(((this.f27456r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f27456r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27458t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27458t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d10, 0.0f);
            so0 so0Var = this.f27454p;
            so0Var.f25442w = (int) (e * 255.0f);
            so0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d10)) * AndroidUtilities.dp(30.0f)) + ((this.f27456r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f27456r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin(this.f27458t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f27447i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.l1(((((((float) Math.sin((this.f27458t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d10) * e, -1));
            canvas.drawPath(this.f27447i, this.d);
            canvas.restore();
            canvas.restore();
            d6 d6Var = this.f27453o;
            if (this.f27455q && this.f27448j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = d6Var.e(z10);
            if (e7 > 0.0f) {
                if (this.e == null) {
                    hj0 hj0Var = new hj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = hj0Var;
                    hj0Var.J(true);
                    this.e.setCallback(new hi.s0(this, 3));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f27446g.f27247c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f27457s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f27456r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f27456r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e7) + 0.75f;
                canvas.scale(f14, f14, this.f27457s.centerX(), this.f27457s.top);
                this.f27444c.setColor(org.telegram.ui.ActionBar.j6.l1(e7 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f27457s.centerX(), this.f27457s.top);
                canvas.drawPath(this.f27445f, this.f27444c);
                canvas.restore();
                canvas.drawRoundRect(this.f27457s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f27444c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f27457s.left), ((int) this.f27457s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f27457s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f27457s.centerY()));
                this.e.setAlpha((int) (255.0f * e7));
                if (!this.e.f23660l0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f27446g.c(this.f27457s.left + AndroidUtilities.dp(39.0f), this.f27457s.centerY(), e7, -1, canvas);
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
