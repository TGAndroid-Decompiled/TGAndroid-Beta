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
public final class sn0 extends Drawable {
    public final boolean f30380a;
    public final Runnable f30381b;
    public final Paint f30382c = new Paint(1);
    public final Paint d;
    public ci0 e;
    public final Path f30383f;
    public final rz0 f30384g;
    public final Path h;
    public final Path f30385i;
    public boolean f30386j;
    public int f30387k;
    public final t5 f30388l;
    public final t5 f30389m;
    public final t5 f30390n;
    public final t5 f30391o;
    public final org.telegram.ui.ActionBar.u0 f30392p;
    public boolean f30393q;
    public final RectF f30394r;
    public final RectF f30395s;
    public float f30396t;
    public long f30397u;
    public float v;
    public boolean f30398w;
    public final eb0 f30399x;

    public sn0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f30383f = path;
        this.f30384g = new rz0(org.telegram.messenger.dd.L0(2131745698, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f30385i = path3;
        this.f30387k = 1;
        this.f30394r = new RectF();
        this.f30395s = new RectF();
        this.f30399x = new eb0(this, 29);
        this.f30381b = runnable;
        this.f30380a = z10;
        gr grVar = gr.h;
        t5 t5Var = new t5(runnable, 360L, grVar, 0);
        this.f30388l = t5Var;
        t5Var.e(true, 0.0f);
        this.f30389m = new t5(runnable, 320L, grVar, 0);
        this.f30390n = new t5(runnable, 200L, grVar, 0);
        t5 t5Var2 = new t5(runnable, 360L, grVar, 0);
        this.f30391o = t5Var2;
        t5Var2.e(true, 0.0f);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(runnable);
        this.f30392p = u0Var;
        u0Var.A = 0.3f;
        u0Var.m(0.4f, 650L, 1.6f, grVar);
        u0Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        u0Var.w(org.telegram.messenger.i0.L(16.0f));
        c(false, 2.0f);
        u0Var.u(-1);
        u0Var.f25744b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.i0.L(8.66f), -org.telegram.messenger.i0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.i0.L(6.33f));
        path3.lineTo(org.telegram.messenger.i0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.i0.L(6.33f));
        path3.close();
        this.f30393q = (z10 || org.telegram.messenger.wp.d1().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-org.telegram.messenger.i0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.i0.L(6.33f));
        path.lineTo(org.telegram.messenger.i0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f30386j && this.f30388l.f30530c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f30386j = z10;
        this.f30381b.run();
        ci0 ci0Var = this.e;
        if (ci0Var != null && this.f30393q) {
            if (z10) {
                ci0Var.H(false);
            } else {
                ci0Var.stop();
            }
        }
    }

    public final void c(boolean z10, float f7) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f30392p;
            u0Var.a();
            u0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30387k = i10;
        if (!z10) {
            this.f30389m.e(true, i10);
        }
        this.f30381b.run();
        if (this.f30393q && Math.abs(f7) > 3.0f && !this.f30398w) {
            this.f30398w = true;
            org.telegram.messenger.i0.h3(this.f30399x, 2500L);
            org.telegram.messenger.wp.d1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f30392p.c() + org.telegram.messenger.i0.L(46.0f);
        float d = this.f30388l.d(this.f30386j);
        float e = this.f30389m.e(false, this.f30387k);
        if (d > 0.0f) {
            float e7 = this.f30390n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f30397u)) / 1000.0f);
            this.f30397u = currentTimeMillis;
            this.f30396t = (Math.min(e7, 4.0f) * 1.5f * min) + this.f30396t;
            this.f30381b.run();
            float f7 = c10 / 2.0f;
            this.f30394r.set(bounds.centerX() - f7, org.telegram.messenger.i0.L(9.0f) + bounds.top, bounds.centerX() + f7, org.telegram.messenger.i0.L(37.0f) + bounds.top);
            canvas.save();
            float f10 = d * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < org.telegram.messenger.i0.f16172q.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f30380a) {
                    canvas.translate(-org.telegram.messenger.i0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f30394r.centerX(), this.f30394r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.i0.L(15.0f)));
            canvas.clipRect(this.f30394r);
            this.f30382c.setColor(org.telegram.ui.ActionBar.t6.r1(f10, -16777216));
            RectF rectF = this.f30394r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f30394r.height() / 2.0f, this.f30382c);
            this.f30392p.p(this.f30394r);
            canvas.save();
            float f12 = -e;
            canvas.translate(((this.f30394r.centerX() - f7) + org.telegram.messenger.i0.L(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * org.telegram.messenger.i0.L(30.0f)), this.f30394r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin(this.f30396t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.i0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin((this.f30396t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.i0.L(28.0f)) / 2.0f) * e, 0.0f);
            org.telegram.ui.ActionBar.u0 u0Var = this.f30392p;
            u0Var.B = (int) (d * 255.0f);
            u0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e)) * org.telegram.messenger.i0.L(30.0f)) + ((this.f30394r.centerX() + f7) - org.telegram.messenger.i0.L(30.0f)), this.f30394r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin(this.f30396t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e) * d, -1));
            canvas.drawPath(this.f30385i, this.d);
            canvas.translate(org.telegram.messenger.i0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin((this.f30396t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e) * d, -1));
            canvas.drawPath(this.f30385i, this.d);
            canvas.restore();
            canvas.restore();
            t5 t5Var = this.f30391o;
            if (this.f30393q && this.f30386j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d10 = t5Var.d(z10);
            if (d10 > 0.0f) {
                if (this.e == null) {
                    ci0 ci0Var = new ci0(2131624189, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
                    this.e = ci0Var;
                    ci0Var.J(true);
                    this.e.setCallback(new bi.s0(this, 3));
                    this.e.K(1);
                    this.e.start();
                }
                float L = this.f30384g.f30126c + org.telegram.messenger.i0.L(54.0f);
                RectF rectF2 = this.f30395s;
                float f13 = L / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f30394r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.i0.L(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f30394r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.i0.L(11.0f) + org.telegram.messenger.i0.L(32.0f));
                canvas.save();
                float f14 = (0.25f * d10) + 0.75f;
                canvas.scale(f14, f14, this.f30395s.centerX(), this.f30395s.top);
                this.f30382c.setColor(org.telegram.ui.ActionBar.t6.r1(d10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f30395s.centerX(), this.f30395s.top);
                canvas.drawPath(this.f30383f, this.f30382c);
                canvas.restore();
                canvas.drawRoundRect(this.f30395s, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.f30382c);
                this.e.setBounds(org.telegram.messenger.i0.L(11.0f) + ((int) this.f30395s.left), ((int) this.f30395s.centerY()) - (org.telegram.messenger.i0.L(24.0f) / 2), org.telegram.messenger.i0.L(35.0f) + ((int) this.f30395s.left), (org.telegram.messenger.i0.L(24.0f) / 2) + ((int) this.f30395s.centerY()));
                this.e.setAlpha((int) (255.0f * d10));
                if (!this.e.f25144k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f30384g.c(this.f30395s.left + org.telegram.messenger.i0.L(39.0f), this.f30395s.centerY(), d10, -1, canvas);
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
