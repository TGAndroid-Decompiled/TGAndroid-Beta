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
    public final boolean f34902a;
    public final Runnable f34903b;
    public final Paint f34904c = new Paint(1);
    public final Paint d;
    public oh0 f34905e;
    public final Path f34906f;
    public final xy0 f34907g;
    public final Path h;
    public final Path f34908i;
    public boolean f34909j;
    public int f34910k;
    public final d6 f34911l;
    public final d6 f34912m;
    public final d6 f34913n;
    public final d6 f34914o;
    public final hi.k f34915p;
    public boolean f34916q;
    public final RectF f34917r;
    public final RectF f34918s;
    public float f34919t;
    public long f34920u;
    public float v;
    public boolean f34921w;
    public final hb0 f34922x;

    public en0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f34906f = path;
        this.f34907g = new xy0(org.telegram.messenger.hd.N0(2131745485, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f34908i = path3;
        this.f34910k = 1;
        this.f34917r = new RectF();
        this.f34918s = new RectF();
        this.f34922x = new hb0(this, 27);
        this.f34903b = runnable;
        this.f34902a = z10;
        nr nrVar = nr.h;
        d6 d6Var = new d6(runnable, 360L, nrVar, 0);
        this.f34911l = d6Var;
        d6Var.e(true, 0.0f);
        this.f34912m = new d6(runnable, 320L, nrVar, 0);
        this.f34913n = new d6(runnable, 200L, nrVar, 0);
        d6 d6Var2 = new d6(runnable, 360L, nrVar, 0);
        this.f34914o = d6Var2;
        d6Var2.e(true, 0.0f);
        hi.k kVar = new hi.k(runnable);
        this.f34915p = kVar;
        kVar.B = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, nrVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        kVar.u(-1);
        kVar.f37751b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f34916q = (z10 || org.telegram.messenger.np.g1().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f34909j && this.f34911l.f34349c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f34909j = z10;
        this.f34903b.run();
        oh0 oh0Var = this.f34905e;
        if (oh0Var != null && this.f34916q) {
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
            hi.k kVar = this.f34915p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        this.f34910k = i7;
        if (!z10) {
            this.f34912m.e(true, i7);
        }
        this.f34903b.run();
        if (this.f34916q && Math.abs(f10) > 3.0f && !this.f34921w) {
            this.f34921w = true;
            org.telegram.messenger.g0.h3(this.f34922x, 2500L);
            org.telegram.messenger.np.g1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c10 = this.f34915p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f34911l.d(this.f34909j);
        float e10 = this.f34912m.e(false, this.f34910k);
        if (d > 0.0f) {
            float e11 = this.f34913n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f34920u)) / 1000.0f);
            this.f34920u = currentTimeMillis;
            this.f34919t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f34919t;
            this.f34903b.run();
            float f10 = c10 / 2.0f;
            this.f34917r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f24010q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f34902a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f34917r.centerX(), this.f34917r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f34917r);
            this.f34904c.setColor(org.telegram.ui.ActionBar.m6.r1(f11, -16777216));
            RectF rectF = this.f34917r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f34917r.height() / 2.0f, this.f34904c);
            this.f34915p.p(this.f34917r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f34917r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f34917r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin(this.f34919t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin((this.f34919t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            hi.k kVar = this.f34915p;
            kVar.C = (int) (d * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f34917r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f34917r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin(this.f34919t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f34908i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin((this.f34919t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f34908i, this.d);
            canvas.restore();
            canvas.restore();
            d6 d6Var = this.f34914o;
            if (this.f34916q && this.f34909j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = d6Var.d(z10);
            if (d2 > 0.0f) {
                if (this.f34905e == null) {
                    oh0 oh0Var = new oh0(2131624192, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f34905e = oh0Var;
                    oh0Var.J(true);
                    this.f34905e.setCallback(new a5.b(this, 7));
                    this.f34905e.K(1);
                    this.f34905e.start();
                }
                float L = this.f34907g.f42224c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f34918s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f34917r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f34917r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d2) + 0.75f;
                canvas.scale(f15, f15, this.f34918s.centerX(), this.f34918s.top);
                this.f34904c.setColor(org.telegram.ui.ActionBar.m6.r1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f34918s.centerX(), this.f34918s.top);
                canvas.drawPath(this.f34906f, this.f34904c);
                canvas.restore();
                canvas.drawRoundRect(this.f34918s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f34904c);
                this.f34905e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f34918s.left), ((int) this.f34918s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f34918s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f34918s.centerY()));
                this.f34905e.setAlpha((int) (255.0f * d2));
                if (!this.f34905e.f38188l0) {
                    this.f34905e.H(true);
                }
                this.f34905e.draw(canvas);
                this.f34907g.c(this.f34918s.left + org.telegram.messenger.g0.L(39.0f), this.f34918s.centerY(), d2, -1, canvas);
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
