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
public final class fn0 extends Drawable {
    public final boolean f35265a;
    public final Runnable f35266b;
    public final Paint f35267c = new Paint(1);
    public final Paint d;
    public oh0 f35268e;
    public final Path f35269f;
    public final xy0 f35270g;
    public final Path h;
    public final Path f35271i;
    public boolean f35272j;
    public int f35273k;
    public final d6 f35274l;
    public final d6 f35275m;
    public final d6 f35276n;
    public final d6 f35277o;
    public final hi.m f35278p;
    public boolean f35279q;
    public final RectF f35280r;
    public final RectF f35281s;
    public float f35282t;
    public long f35283u;
    public float v;
    public boolean f35284w;
    public final hb0 f35285x;

    public fn0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f35269f = path;
        this.f35270g = new xy0(org.telegram.messenger.gd.N0(2131745485, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f35271i = path3;
        this.f35273k = 1;
        this.f35280r = new RectF();
        this.f35281s = new RectF();
        this.f35285x = new hb0(this, 27);
        this.f35266b = runnable;
        this.f35265a = z10;
        nr nrVar = nr.h;
        d6 d6Var = new d6(runnable, 360L, nrVar, 0);
        this.f35274l = d6Var;
        d6Var.e(true, 0.0f);
        this.f35275m = new d6(runnable, 320L, nrVar, 0);
        this.f35276n = new d6(runnable, 200L, nrVar, 0);
        d6 d6Var2 = new d6(runnable, 360L, nrVar, 0);
        this.f35277o = d6Var2;
        d6Var2.e(true, 0.0f);
        hi.m mVar = new hi.m(runnable);
        this.f35278p = mVar;
        mVar.B = 0.3f;
        mVar.m(0.4f, 650L, 1.6f, nrVar);
        mVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        mVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        mVar.u(-1);
        mVar.f37791b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f35279q = (z10 || org.telegram.messenger.mp.g1().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f35272j && this.f35274l.f34391c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f35272j = z10;
        this.f35266b.run();
        oh0 oh0Var = this.f35268e;
        if (oh0Var != null && this.f35279q) {
            if (z10) {
                oh0Var.H(false);
            } else {
                oh0Var.stop();
            }
        }
    }

    public final void c(boolean z10, float f10) {
        int i7;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            hi.m mVar = this.f35278p;
            mVar.a();
            mVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        this.f35273k = i7;
        if (!z10) {
            this.f35275m.e(true, i7);
        }
        this.f35266b.run();
        if (this.f35279q && Math.abs(f10) > 3.0f && !this.f35284w) {
            this.f35284w = true;
            org.telegram.messenger.g0.h3(this.f35285x, 2500L);
            org.telegram.messenger.mp.g1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f35278p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f35274l.d(this.f35272j);
        float e10 = this.f35275m.e(false, this.f35273k);
        if (d > 0.0f) {
            float e11 = this.f35276n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f35283u)) / 1000.0f);
            this.f35283u = currentTimeMillis;
            this.f35282t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f35282t;
            this.f35266b.run();
            float f10 = c10 / 2.0f;
            this.f35280r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f24146q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f35265a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f35280r.centerX(), this.f35280r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f35280r);
            this.f35267c.setColor(org.telegram.ui.ActionBar.m6.r1(f11, -16777216));
            RectF rectF = this.f35280r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f35280r.height() / 2.0f, this.f35267c);
            this.f35278p.p(this.f35280r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f35280r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f35280r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin(this.f35282t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin((this.f35282t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            hi.m mVar = this.f35278p;
            mVar.C = (int) (d * 255.0f);
            mVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f35280r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f35280r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin(this.f35282t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f35271i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin((this.f35282t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f35271i, this.d);
            canvas.restore();
            canvas.restore();
            d6 d6Var = this.f35277o;
            if (this.f35279q && this.f35272j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = d6Var.d(z10);
            if (d2 > 0.0f) {
                if (this.f35268e == null) {
                    oh0 oh0Var = new oh0(2131624192, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f35268e = oh0Var;
                    oh0Var.J(true);
                    this.f35268e.setCallback(new a5.b(this, 7));
                    this.f35268e.K(1);
                    this.f35268e.start();
                }
                float L = this.f35270g.f42254c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f35281s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f35280r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f35280r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d2) + 0.75f;
                canvas.scale(f15, f15, this.f35281s.centerX(), this.f35281s.top);
                this.f35267c.setColor(org.telegram.ui.ActionBar.m6.r1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f35281s.centerX(), this.f35281s.top);
                canvas.drawPath(this.f35269f, this.f35267c);
                canvas.restore();
                canvas.drawRoundRect(this.f35281s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f35267c);
                this.f35268e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f35281s.left), ((int) this.f35281s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f35281s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f35281s.centerY()));
                this.f35268e.setAlpha((int) (255.0f * d2));
                if (!this.f35268e.f38226l0) {
                    this.f35268e.H(true);
                }
                this.f35268e.draw(canvas);
                this.f35270g.c(this.f35281s.left + org.telegram.messenger.g0.L(39.0f), this.f35281s.centerY(), d2, -1, canvas);
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
