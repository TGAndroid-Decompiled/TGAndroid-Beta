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
public final class um0 extends Drawable {
    public final boolean f40109a;
    public final Runnable f40110b;
    public final Paint f40111c = new Paint(1);
    public final Paint d;
    public ch0 f40112e;
    public final Path f40113f;
    public final oy0 f40114g;
    public final Path h;
    public final Path f40115i;
    public boolean f40116j;
    public int f40117k;
    public final u5 f40118l;
    public final u5 f40119m;
    public final u5 f40120n;
    public final u5 f40121o;
    public final hi.k f40122p;
    public boolean f40123q;
    public final RectF f40124r;
    public final RectF f40125s;
    public float f40126t;
    public long f40127u;
    public float v;
    public boolean f40128w;
    public final wa0 f40129x;

    public um0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f40113f = path;
        this.f40114g = new oy0(org.telegram.messenger.hd.M0(2131745681, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f40115i = path3;
        this.f40117k = 1;
        this.f40124r = new RectF();
        this.f40125s = new RectF();
        this.f40129x = new wa0(this, 27);
        this.f40110b = runnable;
        this.f40109a = z10;
        er erVar = er.h;
        u5 u5Var = new u5(runnable, 360L, erVar, 0);
        this.f40118l = u5Var;
        u5Var.e(true, 0.0f);
        this.f40119m = new u5(runnable, 320L, erVar, 0);
        this.f40120n = new u5(runnable, 200L, erVar, 0);
        u5 u5Var2 = new u5(runnable, 360L, erVar, 0);
        this.f40121o = u5Var2;
        u5Var2.e(true, 0.0f);
        hi.k kVar = new hi.k(runnable);
        this.f40122p = kVar;
        kVar.B = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, erVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        kVar.u(-1);
        kVar.f34829b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f40123q = (z10 || org.telegram.messenger.np.e1().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f40116j && this.f40118l.f39903c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f40116j = z10;
        this.f40110b.run();
        ch0 ch0Var = this.f40112e;
        if (ch0Var != null && this.f40123q) {
            if (z10) {
                ch0Var.H(false);
            } else {
                ch0Var.stop();
            }
        }
    }

    public final void c(boolean z10, float f10) {
        int i7;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            hi.k kVar = this.f40122p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        this.f40117k = i7;
        if (!z10) {
            this.f40119m.e(true, i7);
        }
        this.f40110b.run();
        if (this.f40123q && Math.abs(f10) > 3.0f && !this.f40128w) {
            this.f40128w = true;
            org.telegram.messenger.g0.i3(this.f40129x, 2500L);
            org.telegram.messenger.np.e1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f40122p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f40118l.d(this.f40116j);
        float e10 = this.f40119m.e(false, this.f40117k);
        if (d > 0.0f) {
            float e11 = this.f40120n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f40127u)) / 1000.0f);
            this.f40127u = currentTimeMillis;
            this.f40126t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f40126t;
            this.f40110b.run();
            float f10 = c10 / 2.0f;
            this.f40124r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f23609q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f40109a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f40124r.centerX(), this.f40124r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f40124r);
            this.f40111c.setColor(org.telegram.ui.ActionBar.j6.r1(f11, -16777216));
            RectF rectF = this.f40124r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f40124r.height() / 2.0f, this.f40111c);
            this.f40122p.p(this.f40124r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f40124r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f40124r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.r1(((((((float) Math.sin(this.f40126t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.r1(((((((float) Math.sin((this.f40126t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            hi.k kVar = this.f40122p;
            kVar.C = (int) (d * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f40124r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f40124r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.j6.r1(((((((float) Math.sin(this.f40126t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f40115i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.j6.r1(((((((float) Math.sin((this.f40126t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f40115i, this.d);
            canvas.restore();
            canvas.restore();
            u5 u5Var = this.f40121o;
            if (this.f40123q && this.f40116j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = u5Var.d(z10);
            if (d2 > 0.0f) {
                if (this.f40112e == null) {
                    ch0 ch0Var = new ch0(2131624192, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f40112e = ch0Var;
                    ch0Var.J(true);
                    this.f40112e.setCallback(new a5.b(this, 7));
                    this.f40112e.K(1);
                    this.f40112e.start();
                }
                float L = this.f40114g.f38105c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f40125s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f40124r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f40124r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d2) + 0.75f;
                canvas.scale(f15, f15, this.f40125s.centerX(), this.f40125s.top);
                this.f40111c.setColor(org.telegram.ui.ActionBar.j6.r1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f40125s.centerX(), this.f40125s.top);
                canvas.drawPath(this.f40113f, this.f40111c);
                canvas.restore();
                canvas.drawRoundRect(this.f40125s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f40111c);
                this.f40112e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f40125s.left), ((int) this.f40125s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f40125s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f40125s.centerY()));
                this.f40112e.setAlpha((int) (255.0f * d2));
                if (!this.f40112e.f33586l0) {
                    this.f40112e.H(true);
                }
                this.f40112e.draw(canvas);
                this.f40114g.c(this.f40125s.left + org.telegram.messenger.g0.L(39.0f), this.f40125s.centerY(), d2, -1, canvas);
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
