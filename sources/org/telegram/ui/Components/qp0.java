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
public final class qp0 extends Drawable {
    public final boolean f31975a;
    public final Runnable f31976b;
    public final Paint f31977c = new Paint(1);
    public final Paint d;
    public xj0 e;
    public final Path f31978f;
    public final q11 f31979g;
    public final Path h;
    public final Path f31980i;
    public boolean f31981j;
    public int f31982k;
    public final h6 f31983l;
    public final h6 f31984m;
    public final h6 f31985n;
    public final h6 f31986o;
    public final fi.k f31987p;
    public boolean f31988q;
    public final RectF f31989r;
    public final RectF f31990s;
    public float f31991t;
    public long f31992u;
    public float v;
    public boolean f31993w;
    public final mp0 f31994x;

    public qp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f31978f = path;
        this.f31979g = new q11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f31980i = path3;
        this.f31982k = 1;
        this.f31989r = new RectF();
        this.f31990s = new RectF();
        this.f31994x = new mp0(this, 1);
        this.f31976b = runnable;
        this.f31975a = z10;
        ds dsVar = ds.h;
        h6 h6Var = new h6(runnable, 360L, dsVar, 0);
        this.f31983l = h6Var;
        h6Var.d(0.0f, true);
        this.f31984m = new h6(runnable, 320L, dsVar, 0);
        this.f31985n = new h6(runnable, 200L, dsVar, 0);
        h6 h6Var2 = new h6(runnable, 360L, dsVar, 0);
        this.f31986o = h6Var2;
        h6Var2.d(0.0f, true);
        fi.k kVar = new fi.k(runnable);
        this.f31987p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, dsVar);
        kVar.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        kVar.u(-1);
        kVar.f32119b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f31988q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f31981j && this.f31983l.f28809c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f31981j = z10;
        this.f31976b.run();
        xj0 xj0Var = this.e;
        if (xj0Var != null && this.f31988q) {
            if (z10) {
                xj0Var.H(false);
            } else {
                xj0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            fi.k kVar = this.f31987p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f31982k = i10;
        if (!z10) {
            this.f31984m.d(i10, true);
        }
        this.f31976b.run();
        if (this.f31988q && Math.abs(f7) > 3.0f && !this.f31993w) {
            this.f31993w = true;
            AndroidUtilities.runOnUIThread(this.f31994x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f31987p.c() + AndroidUtilities.dp(46.0f);
        float e = this.f31983l.e(this.f31981j);
        float d = this.f31984m.d(this.f31982k, false);
        if (e > 0.0f) {
            float d10 = this.f31985n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f31992u)) / 1000.0f);
            this.f31992u = currentTimeMillis;
            this.f31991t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f31991t;
            this.f31976b.run();
            float f7 = c10 / 2.0f;
            this.f31989r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f31975a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f31989r.centerX(), this.f31989r.top);
            canvas.translate(0.0f, (1.0f - e) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f31989r);
            this.f31977c.setColor(org.telegram.ui.ActionBar.y6.o1(f10, -16777216));
            RectF rectF = this.f31989r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f31989r.height() / 2.0f, this.f31977c);
            this.f31987p.p(this.f31989r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f31989r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f31989r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin(this.f31991t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin((this.f31991t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            fi.k kVar = this.f31987p;
            kVar.B = (int) (e * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f31989r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f31989r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin(this.f31991t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f31980i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.y6.o1(((((((float) Math.sin((this.f31991t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e, -1));
            canvas.drawPath(this.f31980i, this.d);
            canvas.restore();
            canvas.restore();
            h6 h6Var = this.f31986o;
            if (this.f31988q && this.f31981j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = h6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.e == null) {
                    xj0 xj0Var = new xj0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.e = xj0Var;
                    xj0Var.J(true);
                    this.e.setCallback(new bh.u0(this, 6));
                    this.e.K(1);
                    this.e.start();
                }
                float dp = this.f31979g.f31788c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f31990s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f31989r;
                float height = (rectF3.height() * e) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f31989r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f31990s.centerX(), this.f31990s.top);
                this.f31977c.setColor(org.telegram.ui.ActionBar.y6.o1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f31990s.centerX(), this.f31990s.top);
                canvas.drawPath(this.f31978f, this.f31977c);
                canvas.restore();
                canvas.drawRoundRect(this.f31990s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f31977c);
                this.e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f31990s.left), ((int) this.f31990s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f31990s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f31990s.centerY()));
                this.e.setAlpha((int) (255.0f * e10));
                if (!this.e.f34746k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f31979g.c(this.f31990s.left + AndroidUtilities.dp(39.0f), this.f31990s.centerY(), e10, -1, canvas);
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
