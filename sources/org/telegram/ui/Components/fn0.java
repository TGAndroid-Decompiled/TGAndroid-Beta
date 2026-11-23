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
    public final boolean f35267a;
    public final Runnable f35268b;
    public final Paint f35269c = new Paint(1);
    public final Paint d;
    public oh0 f35270e;
    public final Path f35271f;
    public final xy0 f35272g;
    public final Path h;
    public final Path f35273i;
    public boolean f35274j;
    public int f35275k;
    public final d6 f35276l;
    public final d6 f35277m;
    public final d6 f35278n;
    public final d6 f35279o;
    public final hi.m f35280p;
    public boolean f35281q;
    public final RectF f35282r;
    public final RectF f35283s;
    public float f35284t;
    public long f35285u;
    public float v;
    public boolean f35286w;
    public final hb0 f35287x;

    public fn0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f35271f = path;
        this.f35272g = new xy0(org.telegram.messenger.hd.N0(2131745485, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f35273i = path3;
        this.f35275k = 1;
        this.f35282r = new RectF();
        this.f35283s = new RectF();
        this.f35287x = new hb0(this, 27);
        this.f35268b = runnable;
        this.f35267a = z10;
        nr nrVar = nr.h;
        d6 d6Var = new d6(runnable, 360L, nrVar, 0);
        this.f35276l = d6Var;
        d6Var.e(true, 0.0f);
        this.f35277m = new d6(runnable, 320L, nrVar, 0);
        this.f35278n = new d6(runnable, 200L, nrVar, 0);
        d6 d6Var2 = new d6(runnable, 360L, nrVar, 0);
        this.f35279o = d6Var2;
        d6Var2.e(true, 0.0f);
        hi.m mVar = new hi.m(runnable);
        this.f35280p = mVar;
        mVar.B = 0.3f;
        mVar.m(0.4f, 650L, 1.6f, nrVar);
        mVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        mVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        mVar.u(-1);
        mVar.f37795b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f35281q = (z10 || org.telegram.messenger.np.g1().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f35274j && this.f35276l.f34386c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f35274j = z10;
        this.f35268b.run();
        oh0 oh0Var = this.f35270e;
        if (oh0Var != null && this.f35281q) {
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
            hi.m mVar = this.f35280p;
            mVar.a();
            mVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        this.f35275k = i7;
        if (!z10) {
            this.f35277m.e(true, i7);
        }
        this.f35268b.run();
        if (this.f35281q && Math.abs(f10) > 3.0f && !this.f35286w) {
            this.f35286w = true;
            org.telegram.messenger.g0.h3(this.f35287x, 2500L);
            org.telegram.messenger.np.g1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f35280p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f35276l.d(this.f35274j);
        float e10 = this.f35277m.e(false, this.f35275k);
        if (d > 0.0f) {
            float e11 = this.f35278n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f35285u)) / 1000.0f);
            this.f35285u = currentTimeMillis;
            this.f35284t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f35284t;
            this.f35268b.run();
            float f10 = c10 / 2.0f;
            this.f35282r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f24046q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f35267a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f35282r.centerX(), this.f35282r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f35282r);
            this.f35269c.setColor(org.telegram.ui.ActionBar.m6.r1(f11, -16777216));
            RectF rectF = this.f35282r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f35282r.height() / 2.0f, this.f35269c);
            this.f35280p.p(this.f35282r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f35282r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f35282r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin(this.f35284t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin((this.f35284t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            hi.m mVar = this.f35280p;
            mVar.C = (int) (d * 255.0f);
            mVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f35282r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f35282r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin(this.f35284t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f35273i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin((this.f35284t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f35273i, this.d);
            canvas.restore();
            canvas.restore();
            d6 d6Var = this.f35279o;
            if (this.f35281q && this.f35274j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = d6Var.d(z10);
            if (d2 > 0.0f) {
                if (this.f35270e == null) {
                    oh0 oh0Var = new oh0(2131624192, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f35270e = oh0Var;
                    oh0Var.J(true);
                    this.f35270e.setCallback(new a5.b(this, 7));
                    this.f35270e.K(1);
                    this.f35270e.start();
                }
                float L = this.f35272g.f42246c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f35283s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f35282r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f35282r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d2) + 0.75f;
                canvas.scale(f15, f15, this.f35283s.centerX(), this.f35283s.top);
                this.f35269c.setColor(org.telegram.ui.ActionBar.m6.r1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f35283s.centerX(), this.f35283s.top);
                canvas.drawPath(this.f35271f, this.f35269c);
                canvas.restore();
                canvas.drawRoundRect(this.f35283s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f35269c);
                this.f35270e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f35283s.left), ((int) this.f35283s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f35283s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f35283s.centerY()));
                this.f35270e.setAlpha((int) (255.0f * d2));
                if (!this.f35270e.f38219l0) {
                    this.f35270e.H(true);
                }
                this.f35270e.draw(canvas);
                this.f35272g.c(this.f35283s.left + org.telegram.messenger.g0.L(39.0f), this.f35283s.centerY(), d2, -1, canvas);
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
