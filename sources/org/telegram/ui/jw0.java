package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 implements r0.n, org.telegram.ui.Components.w71, org.telegram.ui.Components.lq0, org.telegram.ui.Components.to0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.jo0 {
    public final int f35017a;
    public final Object f35018b;

    public jw0(Object obj, int i10) {
        this.f35017a = i10;
        this.f35018b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f35017a;
    }

    @Override
    public int F0(int i10) {
        return ((td1) this.f35018b).f37758f.f39494a.F0(i10);
    }

    @Override
    public Paint G(String str) {
        return ((td1) this.f35018b).f37758f.f39494a.G(str);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        switch (this.f35017a) {
            case 0:
                mw0 mw0Var = (mw0) this.f35018b;
                i0.b g10 = l1Var.f42175a.g(519);
                mw0Var.f35860r = g10;
                mw0Var.d.setPadding(g10.f10592a, g10.f10593b, g10.f10594c, g10.d);
                mw0Var.f35852c.requestLayout();
                return r0.l1.f42174b;
            default:
                me1 me1Var = (me1) this.f35018b;
                i0.b g11 = l1Var.f42175a.g(519);
                me1Var.f35728n = g11;
                me1Var.f35723c.setPadding(g11.f10592a, g11.f10593b, g11.f10594c, g11.d);
                me1Var.f35721b.requestLayout();
                return r0.l1.f42174b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f35018b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f35017a) {
            case 3:
                xb1 xb1Var = (xb1) this.f35018b;
                ThemeActivity.Y(xb1Var.d, Math.round((xb1Var.f39478b * f7) + 0), false);
                return;
            default:
                ic1 ic1Var = (ic1) this.f35018b;
                ThemeActivity themeActivity = ic1Var.h;
                int i10 = ic1Var.f34547c;
                ThemeActivity.k0(themeActivity, Math.round(((ic1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((td1) this.f35018b).f37758f.f39494a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35018b;
        d51 d51Var = secretMediaViewer.f31795y;
        if (d51Var != null) {
            long p5 = d51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31795y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31795y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35018b;
        d51 d51Var = secretMediaViewer.f31795y;
        if (d51Var != null) {
            d51Var.B();
            long p5 = secretMediaViewer.f31795y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31795y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f35018b).f32477u0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        fg1 fg1Var = ((bg1) this.f35018b).f32477u0;
        HashSet hashSet = fg1.f33620n1;
        fg1Var.M0(s2Var);
    }

    @Override
    public int f0(int i10) {
        return ((td1) this.f35018b).f37758f.f39494a.F0(i10);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f35018b).f32477u0.finishPreviewFragment();
        }
    }

    @Override
    public int g1(int i10) {
        return ((td1) this.f35018b).f37758f.f39494a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f35017a) {
            case 3:
                xb1 xb1Var = (xb1) this.f35018b;
                return String.valueOf(Math.round((xb1Var.f39477a.getProgress() * xb1Var.f39478b) + 0));
            default:
                ic1 ic1Var = (ic1) this.f35018b;
                int i10 = ic1Var.f34547c;
                return String.valueOf(Math.round((ic1Var.f34546b.getProgress() * (ic1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        xd1 xd1Var = ((td1) this.f35018b).f37758f;
        if (str.equals("drawableMsgOut")) {
            return xd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return xd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return xd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return xd1Var.U;
        }
        xc1 xc1Var = xd1Var.f39494a;
        if (xc1Var != null) {
            return xc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public int l0() {
        switch (this.f35017a) {
            case 3:
                return ((xb1) this.f35018b).f39478b;
            default:
                ic1 ic1Var = (ic1) this.f35018b;
                return ic1Var.d - ic1Var.f34547c;
        }
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        xc1 xc1Var = ((td1) this.f35018b).f37758f.f39494a;
        if (xc1Var != null) {
            xc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public boolean n0() {
        return ((td1) this.f35018b).f37758f.f39494a.n0();
    }

    @Override
    public void t0() {
        ((StickersActivity) this.f35018b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19437v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
