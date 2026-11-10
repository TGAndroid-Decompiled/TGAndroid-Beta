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
    public final boolean f37333a;
    public final Runnable f37334b;
    public final Paint f37335c = new Paint(1);
    public final Paint d;
    public zg0 f37336e;
    public final Path f37337f;
    public final my0 f37338g;
    public final Path h;
    public final Path f37339i;
    public boolean f37340j;
    public int f37341k;
    public final v5 f37342l;
    public final v5 f37343m;
    public final v5 f37344n;
    public final v5 f37345o;
    public final fi.k f37346p;
    public boolean f37347q;
    public final RectF f37348r;
    public final RectF f37349s;
    public float f37350t;
    public long f37351u;
    public float v;
    public boolean f37352w;
    public final ob0 f37353x;

    public qm0(Runnable runnable, boolean z9) {
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f37337f = path;
        this.f37338g = new my0(org.telegram.messenger.id.M0(2131745681, null), 14.0f, null);
        Path path2 = new Path();
        this.h = path2;
        Path path3 = new Path();
        this.f37339i = path3;
        this.f37341k = 1;
        this.f37348r = new RectF();
        this.f37349s = new RectF();
        this.f37353x = new ob0(this, 24);
        this.f37334b = runnable;
        this.f37333a = z9;
        wq wqVar = wq.h;
        v5 v5Var = new v5(runnable, 360L, wqVar, 0);
        this.f37342l = v5Var;
        v5Var.e(true, 0.0f);
        this.f37343m = new v5(runnable, 320L, wqVar, 0);
        this.f37344n = new v5(runnable, 200L, wqVar, 0);
        v5 v5Var2 = new v5(runnable, 360L, wqVar, 0);
        this.f37345o = v5Var2;
        v5Var2.e(true, 0.0f);
        fi.k kVar = new fi.k(runnable);
        this.f37346p = kVar;
        kVar.A = 0.3f;
        kVar.m(0.4f, 650L, 1.6f, wqVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.L(16.0f));
        c(false, 2.0f);
        kVar.u(-1);
        kVar.f34187b = 17;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.66f)));
        path2.moveTo(org.telegram.messenger.g0.L(8.66f), -org.telegram.messenger.g0.L(6.33f));
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(org.telegram.messenger.g0.L(8.66f), org.telegram.messenger.g0.L(6.33f));
        path2.close();
        path3.moveTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path3.lineTo(org.telegram.messenger.g0.L(8.66f), 0.0f);
        path3.lineTo(0.0f, org.telegram.messenger.g0.L(6.33f));
        path3.close();
        this.f37347q = (z9 || org.telegram.messenger.qp.e1().getBoolean("seekSpeedHintShowed", false)) ? false : z10;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.33f));
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.close();
    }

    public final boolean a() {
        if (!this.f37340j && this.f37342l.f38854c <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void b(boolean z9) {
        this.f37340j = z9;
        this.f37334b.run();
        zg0 zg0Var = this.f37336e;
        if (zg0Var != null && this.f37347q) {
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
            fi.k kVar = this.f37346p;
            kVar.a();
            kVar.t(String.format(Locale.US, "%.1fx", Float.valueOf(Math.abs(f10))), z9, true);
            this.v = f10;
        }
        if (f10 > 0.0f) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        this.f37341k = i7;
        if (!z9) {
            this.f37343m.e(true, i7);
        }
        this.f37334b.run();
        if (this.f37347q && Math.abs(f10) > 3.0f && !this.f37352w) {
            this.f37352w = true;
            org.telegram.messenger.g0.i3(this.f37353x, 2500L);
            org.telegram.messenger.qp.e1().edit().putBoolean("seekSpeedHintShowed", true).apply();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z9;
        Rect bounds = getBounds();
        float c10 = this.f37346p.c() + org.telegram.messenger.g0.L(46.0f);
        float d = this.f37342l.d(this.f37340j);
        float e10 = this.f37343m.e(false, this.f37341k);
        if (d > 0.0f) {
            float e11 = this.f37344n.e(false, Math.abs(this.v));
            long currentTimeMillis = System.currentTimeMillis();
            float min = Math.min(0.016f, ((float) (currentTimeMillis - this.f37351u)) / 1000.0f);
            this.f37351u = currentTimeMillis;
            this.f37350t = (Math.min(e11, 4.0f) * 1.5f * min) + this.f37350t;
            this.f37334b.run();
            float f10 = c10 / 2.0f;
            this.f37348r.set(bounds.centerX() - f10, org.telegram.messenger.g0.L(9.0f) + bounds.top, bounds.centerX() + f10, org.telegram.messenger.g0.L(37.0f) + bounds.top);
            canvas.save();
            float f11 = d * 0.4f;
            float f12 = 0.6f + f11;
            if (bounds.width() < org.telegram.messenger.g0.f22567q.x * 0.7f) {
                f12 *= 0.75f;
                if (this.f37333a) {
                    canvas.translate(-org.telegram.messenger.g0.L(45.0f), 0.0f);
                }
            }
            canvas.scale(f12, f12, this.f37348r.centerX(), this.f37348r.top);
            canvas.translate(0.0f, (1.0f - d) * (-org.telegram.messenger.g0.L(15.0f)));
            canvas.clipRect(this.f37348r);
            this.f37335c.setColor(org.telegram.ui.ActionBar.m6.r1(f11, -16777216));
            RectF rectF = this.f37348r;
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, this.f37348r.height() / 2.0f, this.f37335c);
            this.f37346p.p(this.f37348r);
            canvas.save();
            float f13 = -e10;
            canvas.translate(((this.f37348r.centerX() - f10) + org.telegram.messenger.g0.L(9.0f)) - ((1.0f - Math.max(0.0f, f13)) * org.telegram.messenger.g0.L(30.0f)), this.f37348r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin(this.f37350t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin((this.f37350t + 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, f13) * d, -1));
            canvas.drawPath(this.h, this.d);
            canvas.restore();
            canvas.save();
            canvas.translate(((-org.telegram.messenger.g0.L(28.0f)) / 2.0f) * e10, 0.0f);
            fi.k kVar = this.f37346p;
            kVar.B = (int) (d * 255.0f);
            kVar.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((1.0f - Math.max(0.0f, e10)) * org.telegram.messenger.g0.L(30.0f)) + ((this.f37348r.centerX() + f10) - org.telegram.messenger.g0.L(30.0f)), this.f37348r.centerY());
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin(this.f37350t * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f37339i, this.d);
            canvas.translate(org.telegram.messenger.g0.L(10.66f), 0.0f);
            this.d.setColor(org.telegram.ui.ActionBar.m6.r1(((((((float) Math.sin((this.f37350t - 0.17f) * 3.141592653589793d)) / 2.0f) + 1.0f) * 0.75f) + 0.2f) * Math.max(0.0f, e10) * d, -1));
            canvas.drawPath(this.f37339i, this.d);
            canvas.restore();
            canvas.restore();
            v5 v5Var = this.f37345o;
            if (this.f37347q && this.f37340j) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d2 = v5Var.d(z9);
            if (d2 > 0.0f) {
                if (this.f37336e == null) {
                    zg0 zg0Var = new zg0(2131624191, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
                    this.f37336e = zg0Var;
                    zg0Var.J(true);
                    this.f37336e.setCallback(new a5.b(this, 7));
                    this.f37336e.K(1);
                    this.f37336e.start();
                }
                float L = this.f37338g.f36133c + org.telegram.messenger.g0.L(54.0f);
                RectF rectF2 = this.f37349s;
                float f14 = L / 2.0f;
                float centerX = bounds.centerX() - f14;
                RectF rectF3 = this.f37348r;
                float height = (rectF3.height() * d) + rectF3.top + org.telegram.messenger.g0.L(11.0f);
                float centerX2 = bounds.centerX() + f14;
                RectF rectF4 = this.f37348r;
                rectF2.set(centerX, height, centerX2, (rectF4.height() * d) + rectF4.top + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(32.0f));
                canvas.save();
                float f15 = (0.25f * d2) + 0.75f;
                canvas.scale(f15, f15, this.f37349s.centerX(), this.f37349s.top);
                this.f37335c.setColor(org.telegram.ui.ActionBar.m6.r1(d2 * 0.4f, -16777216));
                canvas.save();
                canvas.translate(this.f37349s.centerX(), this.f37349s.top);
                canvas.drawPath(this.f37337f, this.f37335c);
                canvas.restore();
                canvas.drawRoundRect(this.f37349s, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f37335c);
                this.f37336e.setBounds(org.telegram.messenger.g0.L(11.0f) + ((int) this.f37349s.left), ((int) this.f37349s.centerY()) - (org.telegram.messenger.g0.L(24.0f) / 2), org.telegram.messenger.g0.L(35.0f) + ((int) this.f37349s.left), (org.telegram.messenger.g0.L(24.0f) / 2) + ((int) this.f37349s.centerY()));
                this.f37336e.setAlpha((int) (255.0f * d2));
                if (!this.f37336e.f40976k0) {
                    this.f37336e.H(true);
                }
                this.f37336e.draw(canvas);
                this.f37338g.c(this.f37349s.left + org.telegram.messenger.g0.L(39.0f), this.f37349s.centerY(), d2, -1, canvas);
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
