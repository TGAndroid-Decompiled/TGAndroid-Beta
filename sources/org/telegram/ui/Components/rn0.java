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
public final class rn0 extends Drawable {
    public final boolean f29968a;
    public final Runnable f29969b;
    public final Paint f29970c = new Paint(1);
    public final Paint d;
    public bi0 e;
    public final Path f29971f;
    public final qz0 f29972g;
    public final Path h;
    public final Path f29973i;
    public boolean f29974j;
    public int f29975k;
    public final t5 f29976l;
    public final t5 f29977m;
    public final t5 f29978n;
    public final t5 f29979o;
    public final org.telegram.ui.ActionBar.u0 f29980p;
    public boolean f29981q;
    public final RectF f29982r;
    public final RectF f29983s;
    public float f29984t;
    public long f29985u;
    public float v;
    public boolean f29986w;
    public final eb0 f29987x;

    public rn0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f29971f = path;
        this.f29972g = new qz0(org.telegram.messenger.cd.L0(2131745698, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f29973i = path3;
        this.f29975k = 1;
        this.f29982r = new RectF();
        this.f29983s = new RectF();
        this.f29987x = new eb0(this, 29);
        this.f29969b = runnable;
        this.f29968a = z10;
        gr grVar = gr.h;
        t5 t5Var = new t5(runnable, 360L, grVar, 0);
        this.f29976l = t5Var;
        t5Var.e(true, 0.0f);
        this.f29977m = new t5(runnable, 320L, grVar, 0);
        this.f29978n = new t5(runnable, 200L, grVar, 0);
        t5 t5Var2 = new t5(runnable, 360L, grVar, 0);
        this.f29979o = t5Var2;
        t5Var2.e(true, 0.0f);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(runnable);
        this.f29980p = u0Var;
        u0Var.A = 0.3f;
        u0Var.m(0.4f, 650L, 1.6f, grVar);
        u0Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        u0Var.w(org.telegram.messenger.i0.L(16.0f));
        c(false, 2.0f);
        u0Var.u(-1);
        u0Var.f25695b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.i0.L(8.66f), -org.telegram.messenger.i0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.i0.L(8.66f), org.telegram.messenger.i0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.i0.L(6.33f));
        path3.lineTo(org.telegram.messenger.i0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.i0.L(6.33f));
        path3.close();
        this.f29981q = (z10 || org.telegram.messenger.vp.d1().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-org.telegram.messenger.i0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.i0.L(6.33f));
        path.lineTo(org.telegram.messenger.i0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f29974j && this.f29976l.f30445c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f29974j = z10;
        this.f29969b.run();
        bi0 bi0Var = this.e;
        if (bi0Var != null && this.f29981q) {
            if (z10) {
                bi0Var.H(false);
            } else {
                bi0Var.stop();
            }
        }
    }

    public final void c(boolean z10, float f7) {
        int i10;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f7)) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f29980p;
            u0Var.a();
            u0Var.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f7))), z10, true);
            this.v = f7;
        }
        if (f7 > 0.0f) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f29975k = i10;
        if (!z10) {
            this.f29977m.e(true, i10);
        }
        this.f29969b.run();
        if (this.f29981q && Math.abs(f7) > 3.0f && !this.f29986w) {
            this.f29986w = true;
            org.telegram.messenger.i0.h3(this.f29987x, 2500L);
            org.telegram.messenger.vp.d1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f29980p.c() + org.telegram.messenger.i0.L(46.0f);
        float d = this.f29976l.d(this.f29974j);
        float e = this.f29977m.e(false, this.f29975k);
        if (d > 0.0f) {
            float e7 = this.f29978n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f29985u)) / 1000.0f);
            this.f29985u = currentTimeMillis;
            this.f29984t = (Math.min(e7, 4.0f) * 1.5f * min) + this.f29984t;
            this.f29969b.run();
            float f7 = c10 / 2.0f;
            this.f29982r.set(bounds.centerX() - f7, org.telegram.messenger.i0.L(9.0f) + bounds.top, bounds.centerX() + f7, org.telegram.messenger.i0.L(37.0f) + bounds.top);
            canvas.save();
            float f10 = d * 0.4f;
            float f11 = 0.6f + f10;
            if (bounds.width() < org.telegram.messenger.i0.f16026q.x * 0.7f) {
                f11 *= 0.75f;
                if (this.f29968a) {
                    canvas.translate(-org.telegram.messenger.i0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f11, f11, this.f29982r.centerX(), this.f29982r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.i0.L(15.0f)));
            canvas.clipRect(this.f29982r);
            this.f29970c.setColor(org.telegram.ui.ActionBar.t6.r1(f10, -16777216));
            RectF rectF = this.f29982r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f29982r.height() / 2.0f, this.f29970c);
            this.f29980p.p(this.f29982r);
            canvas.save();
            float f12 = -e;
            canvas.translate(((this.f29982r.centerX() - f7) + org.telegram.messenger.i0.L(9.0f)) - ((1.0f - Math.max(0.0f, f12)) * org.telegram.messenger.i0.L(30.0f)), this.f29982r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin(this.f29984t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.i0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin((this.f29984t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f12) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.i0.L(28.0f)) / 2.0f) * e, 0.0f);
            org.telegram.ui.ActionBar.u0 u0Var = this.f29980p;
            u0Var.B = (int) (d * 255.0f);
            u0Var.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e)) * org.telegram.messenger.i0.L(30.0f)) + ((this.f29982r.centerX() + f7) - org.telegram.messenger.i0.L(30.0f)), this.f29982r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin(this.f29984t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e) * d, -1));
            canvas.drawPath(this.f29973i, this.d);
            canvas.translate(org.telegram.messenger.i0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.t6.r1(((((((float) Math.sin((this.f29984t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e) * d, -1));
            canvas.drawPath(this.f29973i, this.d);
            canvas.restore();
            canvas.restore();
            t5 t5Var = this.f29979o;
            if (this.f29981q && this.f29974j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d10 = t5Var.d(z10);
            if (d10 > 0.0f) {
                if (this.e == null) {
                    bi0 bi0Var = new bi0(2131624189, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
                    this.e = bi0Var;
                    bi0Var.J(true);
                    this.e.setCallback(new bi.s0(this, 3));
                    this.e.K(1);
                    this.e.start();
                }
                float L = this.f29972g.f29774c + org.telegram.messenger.i0.L(54.0f);
                RectF rectF2 = this.f29983s;
                float f13 = L / 2.0f;
                float centerX = bounds.centerX() - f13;
                RectF rectF3 = this.f29982r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.i0.L(11.0f);
                float centerX2 = bounds.centerX() + f13;
                RectF rectF4 = this.f29982r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.i0.L(11.0f) + org.telegram.messenger.i0.L(32.0f));
                canvas.save();
                float f14 = (0.25f * d10) + 0.75f;
                canvas.scale(f14, f14, this.f29983s.centerX(), this.f29983s.top);
                this.f29970c.setColor(org.telegram.ui.ActionBar.t6.r1(d10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f29983s.centerX(), this.f29983s.top);
                canvas.drawPath(this.f29971f, this.f29970c);
                canvas.restore();
                canvas.drawRoundRect(this.f29983s, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.f29970c);
                this.e.setBounds(org.telegram.messenger.i0.L(11.0f) + ((int) this.f29983s.left), ((int) this.f29983s.centerY()) - (org.telegram.messenger.i0.L(24.0f) / 2), org.telegram.messenger.i0.L(35.0f) + ((int) this.f29983s.left), (org.telegram.messenger.i0.L(24.0f) / 2) + ((int) this.f29983s.centerY()));
                this.e.setAlpha((int) (255.0f * d10));
                if (!this.e.f24765k0) {
                    this.e.H(true);
                }
                this.e.draw(canvas);
                this.f29972g.c(this.f29983s.left + org.telegram.messenger.i0.L(39.0f), this.f29983s.centerY(), d10, -1, canvas);
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
