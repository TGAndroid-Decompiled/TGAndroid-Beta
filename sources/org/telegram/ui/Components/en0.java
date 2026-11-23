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
public final class en0 extends Drawable {
    public final boolean f34808a;
    public final Runnable f34809b;
    public final Paint f34810c = new Paint(1);
    public final Paint d;
    public nh0 f34811e;
    public final Path f34812f;
    public final wy0 f34813g;
    public final Path h;
    public final Path f34814i;
    public boolean f34815j;
    public int f34816k;
    public final c6 f34817l;
    public final c6 f34818m;
    public final c6 f34819n;
    public final c6 f34820o;
    public final hi.l f34821p;
    public boolean f34822q;
    public final RectF f34823r;
    public final RectF f34824s;
    public float f34825t;
    public long f34826u;
    public float v;
    public boolean f34827w;
    public final eb0 f34828x;

    public en0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f34812f = path;
        this.f34813g = new wy0(org.telegram.messenger.gd.N0(2131745485, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f34814i = path3;
        this.f34816k = 1;
        this.f34823r = new RectF();
        this.f34824s = new RectF();
        this.f34828x = new eb0(this, 27);
        this.f34809b = runnable;
        this.f34808a = z10;
        kr krVar = kr.h;
        c6 c6Var = new c6(runnable, 360L, krVar, 0);
        this.f34817l = c6Var;
        c6Var.e(true, 0.0f);
        this.f34818m = new c6(runnable, 320L, krVar, 0);
        this.f34819n = new c6(runnable, 200L, krVar, 0);
        c6 c6Var2 = new c6(runnable, 360L, krVar, 0);
        this.f34820o = c6Var2;
        c6Var2.e(true, 0.0f);
        hi.l lVar = new hi.l(runnable);
        this.f34821p = lVar;
        lVar.B = 0.3f;
        lVar.m(0.4f, 650L, 1.6f, krVar);
        lVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        lVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        lVar.u(-1);
        lVar.f37394b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f34822q = (z10 || org.telegram.messenger.mp.g1().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f34815j && this.f34817l.f33931c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f34815j = z10;
        this.f34809b.run();
        nh0 nh0Var = this.f34811e;
        if (nh0Var != null && this.f34822q) {
            if (z10) {
                nh0Var.H(false);
            } else {
                nh0Var.stop();
            }
        }
    }

    public final void c(boolean z10, float f10) {
        int i7;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            hi.l lVar = this.f34821p;
            lVar.a();
            lVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        this.f34816k = i7;
        if (!z10) {
            this.f34818m.e(true, i7);
        }
        this.f34809b.run();
        if (this.f34822q && Math.abs(f10) > 3.0f && !this.f34827w) {
            this.f34827w = true;
            org.telegram.messenger.g0.h3(this.f34828x, 2500L);
            org.telegram.messenger.mp.g1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f34821p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f34817l.d(this.f34815j);
        float e10 = this.f34818m.e(false, this.f34816k);
        if (d > 0.0f) {
            float e11 = this.f34819n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f34826u)) / 1000.0f);
            this.f34826u = currentTimeMillis;
            this.f34825t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f34825t;
            this.f34809b.run();
            float f10 = c10 / 2.0f;
            this.f34823r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f24226q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f34808a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f34823r.centerX(), this.f34823r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f34823r);
            this.f34810c.setColor(org.telegram.ui.ActionBar.n6.r1(f11, -16777216));
            RectF rectF = this.f34823r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f34823r.height() / 2.0f, this.f34810c);
            this.f34821p.p(this.f34823r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f34823r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f34823r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.n6.r1(((((((float) Math.sin(this.f34825t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.n6.r1(((((((float) Math.sin((this.f34825t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            hi.l lVar = this.f34821p;
            lVar.C = (int) (d * 255.0f);
            lVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f34823r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f34823r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.n6.r1(((((((float) Math.sin(this.f34825t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f34814i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.n6.r1(((((((float) Math.sin((this.f34825t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f34814i, this.d);
            canvas.restore();
            canvas.restore();
            c6 c6Var = this.f34820o;
            if (this.f34822q && this.f34815j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = c6Var.d(z10);
            if (d2 > 0.0f) {
                if (this.f34811e == null) {
                    nh0 nh0Var = new nh0(2131624192, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f34811e = nh0Var;
                    nh0Var.J(true);
                    this.f34811e.setCallback(new a5.b(this, 7));
                    this.f34811e.K(1);
                    this.f34811e.start();
                }
                float L = this.f34813g.f41763c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f34824s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f34823r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f34823r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d2) + 0.75f;
                canvas.scale(f15, f15, this.f34824s.centerX(), this.f34824s.top);
                this.f34810c.setColor(org.telegram.ui.ActionBar.n6.r1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f34824s.centerX(), this.f34824s.top);
                canvas.drawPath(this.f34812f, this.f34810c);
                canvas.restore();
                canvas.drawRoundRect(this.f34824s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f34810c);
                this.f34811e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f34824s.left), ((int) this.f34824s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f34824s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f34824s.centerY()));
                this.f34811e.setAlpha((int) (255.0f * d2));
                if (!this.f34811e.f37814l0) {
                    this.f34811e.H(true);
                }
                this.f34811e.draw(canvas);
                this.f34813g.c(this.f34824s.left + org.telegram.messenger.g0.L(39.0f), this.f34824s.centerY(), d2, -1, canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
