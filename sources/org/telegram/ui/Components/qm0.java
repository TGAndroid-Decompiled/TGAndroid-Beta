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
    public final boolean f37453a;
    public final Runnable f37454b;
    public final Paint f37455c = new Paint(1);
    public final Paint d;
    public zg0 f37456e;
    public final Path f37457f;
    public final ly0 f37458g;
    public final Path h;
    public final Path f37459i;
    public boolean f37460j;
    public int f37461k;
    public final w5 f37462l;
    public final w5 f37463m;
    public final w5 f37464n;
    public final w5 f37465o;
    public final fi.k f37466p;
    public boolean f37467q;
    public final RectF f37468r;
    public final RectF f37469s;
    public float f37470t;
    public long f37471u;
    public float v;
    public boolean f37472w;
    public final ob0 f37473x;

    public qm0(Runnable runnable, boolean z9) {
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f37457f = path;
        this.f37458g = new ly0(org.telegram.messenger.hd.M0(2131745682, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f37459i = path3;
        this.f37461k = 1;
        this.f37468r = new RectF();
        this.f37469s = new RectF();
        this.f37473x = new ob0(this, 24);
        this.f37454b = runnable;
        this.f37453a = z9;
        xq xqVar = xq.h;
        w5 w5Var = new w5(runnable, 360L, xqVar, 0);
        this.f37462l = w5Var;
        w5Var.e(true, 0.0f);
        this.f37463m = new w5(runnable, 320L, xqVar, 0);
        this.f37464n = new w5(runnable, 200L, xqVar, 0);
        w5 w5Var2 = new w5(runnable, 360L, xqVar, 0);
        this.f37465o = w5Var2;
        w5Var2.e(true, 0.0f);
        fi.k kVar = new fi.k(runnable);
        this.f37466p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, xqVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        kVar.u(-1);
        kVar.f34516b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f37467q = (z9 || org.telegram.messenger.qp.e1().getBoolean("seekSpeedHintShowed", false)) ? false : z10;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f37460j && this.f37462l.f39849c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z9) {
        this.f37460j = z9;
        this.f37454b.run();
        zg0 zg0Var = this.f37456e;
        if (zg0Var != null && this.f37467q) {
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
            fi.k kVar = this.f37466p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z9, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        this.f37461k = i7;
        if (!z9) {
            this.f37463m.e(true, i7);
        }
        this.f37454b.run();
        if (this.f37467q && Math.abs(f10) > 3.0f && !this.f37472w) {
            this.f37472w = true;
            org.telegram.messenger.g0.i3(this.f37473x, 2500L);
            org.telegram.messenger.qp.e1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z9;
        Rect bounds = getBounds();
        float c10 = this.f37466p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f37462l.d(this.f37460j);
        float e10 = this.f37463m.e(false, this.f37461k);
        if (d > 0.0f) {
            float e11 = this.f37464n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f37471u)) / 1000.0f);
            this.f37471u = currentTimeMillis;
            this.f37470t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f37470t;
            this.f37454b.run();
            float f10 = c10 / 2.0f;
            this.f37468r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f22537q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f37453a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f37468r.centerX(), this.f37468r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f37468r);
            this.f37455c.setColor(org.telegram.ui.ActionBar.k6.r1(f11, -16777216));
            RectF rectF = this.f37468r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f37468r.height() / 2.0f, this.f37455c);
            this.f37466p.p(this.f37468r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f37468r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f37468r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin(this.f37470t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin((this.f37470t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            fi.k kVar = this.f37466p;
            kVar.B = (int) (d * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f37468r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f37468r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin(this.f37470t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f37459i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin((this.f37470t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f37459i, this.d);
            canvas.restore();
            canvas.restore();
            w5 w5Var = this.f37465o;
            if (this.f37467q && this.f37460j) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d2 = w5Var.d(z9);
            if (d2 > 0.0f) {
                if (this.f37456e == null) {
                    zg0 zg0Var = new zg0(2131624191, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f37456e = zg0Var;
                    zg0Var.J(true);
                    this.f37456e.setCallback(new a5.b(this, 7));
                    this.f37456e.K(1);
                    this.f37456e.start();
                }
                float L = this.f37458g.f35777c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f37469s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f37468r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f37468r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d2) + 0.75f;
                canvas.scale(f15, f15, this.f37469s.centerX(), this.f37469s.top);
                this.f37455c.setColor(org.telegram.ui.ActionBar.k6.r1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f37469s.centerX(), this.f37469s.top);
                canvas.drawPath(this.f37457f, this.f37455c);
                canvas.restore();
                canvas.drawRoundRect(this.f37469s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f37455c);
                this.f37456e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f37469s.left), ((int) this.f37469s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f37469s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f37469s.centerY()));
                this.f37456e.setAlpha((int) (255.0f * d2));
                if (!this.f37456e.f40939k0) {
                    this.f37456e.H(true);
                }
                this.f37456e.draw(canvas);
                this.f37458g.c(this.f37469s.left + org.telegram.messenger.g0.L(39.0f), this.f37469s.centerY(), d2, -1, canvas);
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
