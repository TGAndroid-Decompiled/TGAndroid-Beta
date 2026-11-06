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
public final class qm0 extends Drawable {
    public final boolean f37338a;
    public final Runnable f37339b;
    public final Paint f37340c = new Paint(1);
    public final Paint d;
    public zg0 f37341e;
    public final Path f37342f;
    public final my0 f37343g;
    public final Path h;
    public final Path f37344i;
    public boolean f37345j;
    public int f37346k;
    public final w5 f37347l;
    public final w5 f37348m;
    public final w5 f37349n;
    public final w5 f37350o;
    public final fi.k f37351p;
    public boolean f37352q;
    public final RectF f37353r;
    public final RectF f37354s;
    public float f37355t;
    public long f37356u;
    public float v;
    public boolean f37357w;
    public final ob0 f37358x;

    public qm0(Runnable runnable, boolean z9) {
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f37342f = path;
        this.f37343g = new my0(org.telegram.messenger.hd.M0(2131745682, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f37344i = path3;
        this.f37346k = 1;
        this.f37353r = new RectF();
        this.f37354s = new RectF();
        this.f37358x = new ob0(this, 24);
        this.f37339b = runnable;
        this.f37338a = z9;
        xq xqVar = xq.h;
        w5 w5Var = new w5(runnable, 360L, xqVar, 0);
        this.f37347l = w5Var;
        w5Var.e(true, 0.0f);
        this.f37348m = new w5(runnable, 320L, xqVar, 0);
        this.f37349n = new w5(runnable, 200L, xqVar, 0);
        w5 w5Var2 = new w5(runnable, 360L, xqVar, 0);
        this.f37350o = w5Var2;
        w5Var2.e(true, 0.0f);
        fi.k kVar = new fi.k(runnable);
        this.f37351p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, xqVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        kVar.u(-1);
        kVar.f34508b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f37352q = (z9 || org.telegram.messenger.qp.e1().getBoolean("seekSpeedHintShowed", false)) ? false : z10;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f37345j && this.f37347l.f39855c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z9) {
        this.f37345j = z9;
        this.f37339b.run();
        zg0 zg0Var = this.f37341e;
        if (zg0Var != null && this.f37352q) {
            if (z9) {
                zg0Var.H(false);
            } else {
                zg0Var.stop();
            }
        }
    }

    public final void c(boolean z9, float f10) {
        int i7;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            fi.k kVar = this.f37351p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z9, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        this.f37346k = i7;
        if (!z9) {
            this.f37348m.e(true, i7);
        }
        this.f37339b.run();
        if (this.f37352q && Math.abs(f10) > 3.0f && !this.f37357w) {
            this.f37357w = true;
            org.telegram.messenger.g0.i3(this.f37358x, 2500L);
            org.telegram.messenger.qp.e1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z9;
        Rect bounds = getBounds();
        float c10 = this.f37351p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f37347l.d(this.f37345j);
        float e10 = this.f37348m.e(false, this.f37346k);
        if (d > 0.0f) {
            float e11 = this.f37349n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f37356u)) / 1000.0f);
            this.f37356u = currentTimeMillis;
            this.f37355t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f37355t;
            this.f37339b.run();
            float f10 = c10 / 2.0f;
            this.f37353r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f22544q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f37338a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f37353r.centerX(), this.f37353r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f37353r);
            this.f37340c.setColor(org.telegram.ui.ActionBar.k6.r1(f11, -16777216));
            RectF rectF = this.f37353r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f37353r.height() / 2.0f, this.f37340c);
            this.f37351p.p(this.f37353r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f37353r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f37353r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin(this.f37355t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin((this.f37355t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            fi.k kVar = this.f37351p;
            kVar.B = (int) (d * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f37353r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f37353r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin(this.f37355t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f37344i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin((this.f37355t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f37344i, this.d);
            canvas.restore();
            canvas.restore();
            w5 w5Var = this.f37350o;
            if (this.f37352q && this.f37345j) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d2 = w5Var.d(z9);
            if (d2 > 0.0f) {
                if (this.f37341e == null) {
                    zg0 zg0Var = new zg0(2131624191, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f37341e = zg0Var;
                    zg0Var.J(true);
                    this.f37341e.setCallback(new a5.b(this, 7));
                    this.f37341e.K(1);
                    this.f37341e.start();
                }
                float L = this.f37343g.f36125c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f37354s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f37353r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f37353r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d2) + 0.75f;
                canvas.scale(f15, f15, this.f37354s.centerX(), this.f37354s.top);
                this.f37340c.setColor(org.telegram.ui.ActionBar.k6.r1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f37354s.centerX(), this.f37354s.top);
                canvas.drawPath(this.f37342f, this.f37340c);
                canvas.restore();
                canvas.drawRoundRect(this.f37354s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f37340c);
                this.f37341e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f37354s.left), ((int) this.f37354s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f37354s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f37354s.centerY()));
                this.f37341e.setAlpha((int) (255.0f * d2));
                if (!this.f37341e.f40984k0) {
                    this.f37341e.H(true);
                }
                this.f37341e.draw(canvas);
                this.f37343g.c(this.f37354s.left + org.telegram.messenger.g0.L(39.0f), this.f37354s.centerY(), d2, -1, canvas);
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
