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
public final class tm0 extends Drawable {
    public final boolean f38498a;
    public final Runnable f38499b;
    public final Paint f38500c = new Paint(1);
    public final Paint d;
    public ch0 f38501e;
    public final Path f38502f;
    public final ly0 f38503g;
    public final Path h;
    public final Path f38504i;
    public boolean f38505j;
    public int f38506k;
    public final u5 f38507l;
    public final u5 f38508m;
    public final u5 f38509n;
    public final u5 f38510o;
    public final gi.k f38511p;
    public boolean f38512q;
    public final RectF f38513r;
    public final RectF f38514s;
    public float f38515t;
    public long f38516u;
    public float v;
    public boolean f38517w;
    public final jb0 f38518x;

    public tm0(Runnable runnable, boolean z10) {
        boolean z11 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f38502f = path;
        this.f38503g = new ly0(org.telegram.messenger.bd.M0(2131745691, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f38504i = path3;
        this.f38506k = 1;
        this.f38513r = new RectF();
        this.f38514s = new RectF();
        this.f38518x = new jb0(this, 26);
        this.f38499b = runnable;
        this.f38498a = z10;
        xq xqVar = xq.h;
        u5 u5Var = new u5(runnable, 360L, xqVar, 0);
        this.f38507l = u5Var;
        u5Var.e(true, 0.0f);
        this.f38508m = new u5(runnable, 320L, xqVar, 0);
        this.f38509n = new u5(runnable, 200L, xqVar, 0);
        u5 u5Var2 = new u5(runnable, 360L, xqVar, 0);
        this.f38510o = u5Var2;
        u5Var2.e(true, 0.0f);
        gi.k kVar = new gi.k(runnable);
        this.f38511p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, xqVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        kVar.u(-1);
        kVar.f33983b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f38512q = (z10 || org.telegram.messenger.hp.e1().getBoolean("seekSpeedHintShowed", false)) ? false : z11;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f38505j && this.f38507l.f38645c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10) {
        this.f38505j = z10;
        this.f38499b.run();
        ch0 ch0Var = this.f38501e;
        if (ch0Var != null && this.f38512q) {
            if (z10) {
                ch0Var.H(false);
            } else {
                ch0Var.stop();
            }
        }
    }

    public final void c(boolean z10, float f10) {
        int i3;
        if (Math.floor(this.v * 10.0f) != Math.floor(10.0f * f10)) {
            gi.k kVar = this.f38511p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z10, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        this.f38506k = i3;
        if (!z10) {
            this.f38508m.e(true, i3);
        }
        this.f38499b.run();
        if (this.f38512q && Math.abs(f10) > 3.0f && !this.f38517w) {
            this.f38517w = true;
            org.telegram.messenger.g0.i3(this.f38518x, 2500L);
            org.telegram.messenger.hp.e1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10;
        Rect bounds = getBounds();
        float c2 = this.f38511p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f38507l.d(this.f38505j);
        float e10 = this.f38508m.e(false, this.f38506k);
        if (d > 0.0f) {
            float e11 = this.f38509n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f38516u)) / 1000.0f);
            this.f38516u = currentTimeMillis;
            this.f38515t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f38515t;
            this.f38499b.run();
            float f10 = c2 / 2.0f;
            this.f38513r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f22608q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f38498a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f38513r.centerX(), this.f38513r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f38513r);
            this.f38500c.setColor(org.telegram.ui.ActionBar.k6.r1(f11, -16777216));
            RectF rectF = this.f38513r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f38513r.height() / 2.0f, this.f38500c);
            this.f38511p.p(this.f38513r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f38513r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f38513r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin(this.f38515t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin((this.f38515t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            gi.k kVar = this.f38511p;
            kVar.B = (int) (d * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f38513r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f38513r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin(this.f38515t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f38504i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.k6.r1(((((((float) Math.sin((this.f38515t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f38504i, this.d);
            canvas.restore();
            canvas.restore();
            u5 u5Var = this.f38510o;
            if (this.f38512q && this.f38505j) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d10 = u5Var.d(z10);
            if (d10 > 0.0f) {
                if (this.f38501e == null) {
                    ch0 ch0Var = new ch0(2131624191, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f38501e = ch0Var;
                    ch0Var.J(true);
                    this.f38501e.setCallback(new ah.a(this, 8));
                    this.f38501e.K(1);
                    this.f38501e.start();
                }
                float L = this.f38503g.f35918c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f38514s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f38513r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f38513r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d10) + 0.75f;
                canvas.scale(f15, f15, this.f38514s.centerX(), this.f38514s.top);
                this.f38500c.setColor(org.telegram.ui.ActionBar.k6.r1(d10 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f38514s.centerX(), this.f38514s.top);
                canvas.drawPath(this.f38502f, this.f38500c);
                canvas.restore();
                canvas.drawRoundRect(this.f38514s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f38500c);
                this.f38501e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f38514s.left), ((int) this.f38514s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f38514s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f38514s.centerY()));
                this.f38501e.setAlpha((int) (255.0f * d10));
                if (!this.f38501e.f32734l0) {
                    this.f38501e.H(true);
                }
                this.f38501e.draw(canvas);
                this.f38503g.c(this.f38514s.left + org.telegram.messenger.g0.L(39.0f), this.f38514s.centerY(), d10, -1, canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
