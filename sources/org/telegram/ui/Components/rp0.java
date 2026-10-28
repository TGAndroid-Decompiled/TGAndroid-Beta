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
public final class rp0 extends Drawable {
    public final boolean f32298a;
    public final Runnable f32299b;
    public final Paint f32300c = new Paint(1);
    public final Paint d;
    public yj0 e;
    public final Path f32301f;
    public final r11 f32302g;
    public final Path h;
    public final Path f32303i;
    public boolean f32304j;
    public int f32305k;
    public final h6 f32306l;
    public final h6 f32307m;
    public final h6 f32308n;
    public final h6 f32309o;
    public final fi.k f32310p;
    public boolean f32311q;
    public final RectF f32312r;
    public final RectF f32313s;
    public float f32314t;
    public long f32315u;
    public float v;
    public boolean f32316w;
    public final np0 f32317x;

    public rp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f32301f = path;
        this.f32302g = new r11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f32303i = path3;
        this.f32305k = 1;
        this.f32312r = new RectF();
        this.f32313s = new RectF();
        this.f32317x = new np0(this, 1);
        this.f32299b = runnable;
        this.f32298a = z10;
        ds dsVar = ds.h;
        h6 h6Var = new h6(runnable, 360L, dsVar, 0);
        this.f32306l = h6Var;
        h6Var.d(0.0f, true);
        this.f32307m = new h6(runnable, 320L, dsVar, 0);
        this.f32308n = new h6(runnable, 200L, dsVar, 0);
        h6 h6Var2 = new h6(runnable, 360L, dsVar, 0);
        this.f32309o = h6Var2;
        h6Var2.d(0.0f, true);
        fi.k kVar = new fi.k(runnable);
        this.f32310p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, dsVar);
        kVar.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        kVar.u(-1);
        kVar.f32142b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f32311q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f32304j && this.f32306l.f28864c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f32304j = z10;
        this.f32299b.run();
        yj0 yj0Var = this.e;
        if (yj0Var != null && this.f32311q) {
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
            fi.k kVar = this.f32310p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f32305k = i10;
        if (!z10) {
            this.f32307m.d(i10, true);
        }
        this.f32299b.run();
        if (this.f32311q && Math.abs(f7) > 3.0f && !this.f32316w) {
            this.f32316w = true;
            AndroidUtilities.runOnUIThread(this.f32317x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f32310p.c() + AndroidUtilities.dp(46.0f);
        float e = this.f32306l.e(this.f32304j);
        float d = this.f32307m.d(this.f32305k, false);
        if (e > 0.0f) {
            float d10 = this.f32308n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f32315u)) / 1000.0f);
            this.f32315u = currentTimeMillis;
            this.f32314t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f32314t;
            this.f32299b.run();
            float f7 = c10 / 2.0f;
            this.f32312r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f32298a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f32312r.centerX(), this.f32312r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f32312r);
            this.f32300c.setColor(org.telegram.ui.ActionBar.y6.o1(f10, -16777216));
            RectF rectF = this.f32312r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f32312r.height() / 2.0f, this.f32300c);
            this.f32310p.p(this.f32312r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f32312r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f32312r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin(this.f32314t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin((this.f32314t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            fi.k kVar = this.f32310p;
            kVar.B = (int) (e * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f32312r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f32312r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin(this.f32314t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f32303i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin((this.f32314t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f32303i, this.d);
            canvas.restore();
            canvas.restore();
            h6 h6Var = this.f32309o;
            if (this.f32311q && this.f32304j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = h6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.e == null) {
                    yj0 yj0Var = new yj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = yj0Var;
                    yj0Var.J(true);
                    this.e.setCallback(new bh.u0(this, 6));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f32302g.f32090c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f32313s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f32312r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f32312r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f32313s.centerX(), this.f32313s.top);
                this.f32300c.setColor(org.telegram.ui.ActionBar.y6.o1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f32313s.centerX(), this.f32313s.top);
                canvas.drawPath(this.f32301f, this.f32300c);
                canvas.restore();
                canvas.drawRoundRect(this.f32313s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f32300c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f32313s.left), ((int) this.f32313s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f32313s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f32313s.centerY()));
                this.e.setAlpha((int) (255.0f * e10));
                if (!this.e.f35080k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f32302g.c(this.f32313s.left + AndroidUtilities.dp(39.0f), this.f32313s.centerY(), e10, -1, canvas);
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
