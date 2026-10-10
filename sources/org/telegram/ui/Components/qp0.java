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
    public final boolean f30242a;
    public final Runnable f30243b;
    public final Paint f30244c = new Paint(1);
    public final Paint d;
    public dk0 f30245e;
    public final Path f30246f;
    public final m11 f30247g;
    public final Path h;
    public final Path f30248i;
    public boolean f30249j;
    public int f30250k;
    public final g6 f30251l;
    public final g6 f30252m;
    public final g6 f30253n;
    public final g6 f30254o;
    public final pp0 f30255p;
    public boolean f30256q;
    public final RectF f30257r;
    public final RectF f30258s;
    public float f30259t;
    public long f30260u;
    public float v;
    public boolean f30261w;
    public final cd0 f30262x;

    public qp0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30246f = path;
        this.f30247g = new m11(LocaleController.getString(R.string.SeekSpeedHint), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30248i = path3;
        this.f30250k = 1;
        this.f30257r = new RectF();
        this.f30258s = new RectF();
        this.f30262x = new cd0(this, 27);
        this.f30243b = runnable;
        this.f30242a = z10;
        is isVar = is.h;
        g6 g6Var = new g6(runnable, 360L, isVar, 0);
        this.f30251l = g6Var;
        g6Var.d(0.0f, true);
        this.f30252m = new g6(runnable, 320L, isVar, 0);
        this.f30253n = new g6(runnable, 200L, isVar, 0);
        g6 g6Var2 = new g6(runnable, 360L, isVar, 0);
        this.f30254o = g6Var2;
        g6Var2.d(0.0f, true);
        pp0 pp0Var = new pp0(runnable);
        this.f30255p = pp0Var;
        pp0Var.A = 0.3f;
        pp0Var.m(0.4f, 650L, 1.6f, isVar);
        pp0Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        pp0Var.w(AndroidUtilities.dp(16.0f));
        c(2.0f, false);
        pp0Var.u(-1);
        pp0Var.f30031b = 17;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.66f)));
        path2.moveTo(AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(AndroidUtilities.dp(8.66f), AndroidUtilities.dp(6.33f));
        path2.close();
        path3.moveTo(0.0f, -AndroidUtilities.dp(6.33f));
        path3.lineTo(AndroidUtilities.dp(8.66f), 0.0f);
        path3.lineTo(0.0f, AndroidUtilities.dp(6.33f));
        path3.close();
        this.f30256q = (z10 || MessagesController.getGlobalMainSettings().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.33f));
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30249j && this.f30251l.f26616c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30249j = z10;
        this.f30243b.run();
        dk0 dk0Var = this.f30245e;
        if (dk0Var != null && this.f30256q) {
            if (z10) {
                dk0Var.H(false);
            } else {
                dk0Var.stop();
            }
        }
    }

    public final void c(float f7, boolean z10) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            pp0 pp0Var = this.f30255p;
            pp0Var.a();
            pp0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30250k = i10;
        if (!z10) {
            this.f30252m.d(i10, true);
        }
        this.f30243b.run();
        if (this.f30256q && Math.abs(f7) > 3.0f && !this.f30261w) {
            this.f30261w = true;
            AndroidUtilities.runOnUIThread(this.f30262x, 2500L);
            MessagesController.getGlobalMainSettings().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f30255p.c() + AndroidUtilities.dp(46.0f);
        float e7 = this.f30251l.e(this.f30249j);
        float d = this.f30252m.d(this.f30250k, false);
        if (e7 > 0.0f) {
            float d10 = this.f30253n.d(Math.abs(this.v), false);
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30260u)) / 1000.0f);
            this.f30260u = currentTimeMillis;
            this.f30259t = (Math.min(d10, 4.0f) * 1.5f * min) + this.f30259t;
            this.f30243b.run();
            float f7 = c10 / 2.0f;
            this.f30257r.set(bounds.centerX() - f7, AndroidUtilities.dp(9.0f) + bounds.top, bounds.centerX() + f7, AndroidUtilities.dp(37.0f) + bounds.top);
            canvas.save();
            float f10 = e7 * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < AndroidUtilities.displaySize.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30242a) {
                    canvas.translate(-AndroidUtilities.dp(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30257r.centerX(), this.f30257r.top);
            canvas.translate(0.0f, (1.0f - e7) * (-AndroidUtilities.dp(15.0f)));
            canvas.clipRect(this.f30257r);
            this.f30244c.setColor(org.telegram.ui.ActionBar.i6.m1(f10, -16777216));
            RectF rectF = this.f30257r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30257r.height() / 2.0f, this.f30244c);
            this.f30255p.p(this.f30257r);
            canvas.save();
            float f12 = -d;
            canvas.translate(((this.f30257r.centerX() - f7) + AndroidUtilities.dp(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * AndroidUtilities.dp(30.0f)), this.f30257r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.i6.m1(((((((float) Math.sin(this.f30259t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.i6.m1(((((((float) Math.sin((this.f30259t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * e7, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-AndroidUtilities.dp(28.0f)) / 2.0f) * d, 0.0f);
            pp0 pp0Var = this.f30255p;
            pp0Var.B = (int) (e7 * 255.0f);
            pp0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, d)) * AndroidUtilities.dp(30.0f)) + ((this.f30257r.centerX() + f7) - AndroidUtilities.dp(30.0f)), this.f30257r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.i6.m1(((((((float) Math.sin(this.f30259t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f30248i, this.d);
            canvas.translate(AndroidUtilities.dp(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.i6.m1(((((((float) Math.sin((this.f30259t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, d) * e7, -1));
            canvas.drawPath(this.f30248i, this.d);
            canvas.restore();
            canvas.restore();
            g6 g6Var = this.f30254o;
            if (this.f30256q && this.f30249j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var.e(z10);
            if (e10 > 0.0f) {
                if (this.f30245e == null) {
                    dk0 dk0Var = new dk0(R.raw.seek_speed_hint, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
                    this.f30245e = dk0Var;
                    dk0Var.J(true);
                    this.f30245e.setCallback(new i.f(this, 3));
                    this.f30245e.K(1);
                    this.f30245e.start();
                }
                float dp = this.f30247g.f28602c + AndroidUtilities.dp(54.0f);
                RectF rectF2 = this.f30258s;
                float f13 = dp / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30257r;
                float height = (rectF3.height() * e7) + rectF3.top + AndroidUtilities.dp(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30257r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * e7) + rectF4.top + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(32.0f));
                canvas.save();
                float f14 = (0.25f * e10) + 0.75f;
                canvas.scale(f14, f14, this.f30258s.centerX(), this.f30258s.top);
                this.f30244c.setColor(org.telegram.ui.ActionBar.i6.m1(e10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30258s.centerX(), this.f30258s.top);
                canvas.drawPath(this.f30246f, this.f30244c);
                canvas.restore();
                canvas.drawRoundRect(this.f30258s, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f30244c);
                this.f30245e.setBounds(AndroidUtilities.dp(11.0f) + ((int) this.f30258s.left), ((int) this.f30258s.centerY()) - (AndroidUtilities.dp(24.0f) / 2), AndroidUtilities.dp(35.0f) + ((int) this.f30258s.left), (AndroidUtilities.dp(24.0f) / 2) + ((int) this.f30258s.centerY()));
                this.f30245e.setAlpha((int) (255.0f * e10));
                if (!this.f30245e.f25740k0) {
                    this.f30245e.H(true);
                }
                this.f30245e.draw(canvas);
                this.f30247g.c(this.f30258s.left + AndroidUtilities.dp(39.0f), this.f30258s.centerY(), e10, -1, canvas);
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
