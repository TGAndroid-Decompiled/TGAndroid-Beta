package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class dw0 implements r0.n, org.telegram.ui.Components.e81, org.telegram.ui.Components.oq0, org.telegram.ui.Components.xo0, org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.mo0 {
    public final int f35848a;
    public final Object f35849b;

    public dw0(Object obj, int i10) {
        this.f35848a = i10;
        this.f35849b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f35848a;
    }

    @Override
    public Paint H(String str) {
        return ((nd1) this.f35849b).f38941f.f40032a.H(str);
    }

    @Override
    public int H0(int i10) {
        return ((nd1) this.f35849b).f38941f.f40032a.H0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f35848a) {
            case 0:
                gw0 gw0Var = (gw0) this.f35849b;
                i0.b g10 = l1Var.f45610a.g(519);
                gw0Var.f36755r = g10;
                gw0Var.d.setPadding(g10.f11525a, g10.f11526b, g10.f11527c, g10.d);
                gw0Var.f36746c.requestLayout();
                return r0.l1.f45609b;
            default:
                ge1 ge1Var = (ge1) this.f35849b;
                i0.b g11 = l1Var.f45610a.g(519);
                ge1Var.f36615n = g11;
                ge1Var.f36609c.setPadding(g11.f11525a, g11.f11526b, g11.f11527c, g11.d);
                ge1Var.f36607b.requestLayout();
                return r0.l1.f45609b;
        }
    }

    @Override
    public void V() {
        ((StickersActivity) this.f35849b).j0();
    }

    @Override
    public void Y(float f7, boolean z10) {
        switch (this.f35848a) {
            case 3:
                rb1 rb1Var = (rb1) this.f35849b;
                ThemeActivity.X(rb1Var.d, Math.round((rb1Var.f40010b * f7) + 0), false);
                return;
            default:
                cc1 cc1Var = (cc1) this.f35849b;
                ThemeActivity themeActivity = cc1Var.h;
                int i10 = cc1Var.f35406c;
                ThemeActivity.k0(themeActivity, Math.round(((cc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((nd1) this.f35849b).f38941f.f40032a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35849b;
        w41 w41Var = secretMediaViewer.f34458y;
        if (w41Var != null) {
            long p5 = w41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34458y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34458y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35849b;
        w41 w41Var = secretMediaViewer.f34458y;
        if (w41Var != null) {
            w41Var.B();
            long p5 = secretMediaViewer.f34458y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34458y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uf1) this.f35849b).f41189u0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        yf1 yf1Var = ((uf1) this.f35849b).f41189u0;
        HashSet hashSet = yf1.f43162n1;
        yf1Var.M0(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((uf1) this.f35849b).f41189u0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f35848a) {
            case 3:
                rb1 rb1Var = (rb1) this.f35849b;
                return String.valueOf(Math.round((rb1Var.f40009a.getProgress() * rb1Var.f40010b) + 0));
            default:
                cc1 cc1Var = (cc1) this.f35849b;
                int i10 = cc1Var.f35406c;
                return String.valueOf(Math.round((cc1Var.f35405b.getProgress() * (cc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        rd1 rd1Var = ((nd1) this.f35849b).f38941f;
        if (str.equals("drawableMsgOut")) {
            return rd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return rd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return rd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return rd1Var.U;
        }
        rc1 rc1Var = rd1Var.f40032a;
        if (rc1Var != null) {
            return rc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public int j0(int i10) {
        return ((nd1) this.f35849b).f38941f.f40032a.H0(i10);
    }

    @Override
    public int j1(int i10) {
        return ((nd1) this.f35849b).f38941f.f40032a.j1(i10);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        rc1 rc1Var = ((nd1) this.f35849b).f38941f.f40032a;
        if (rc1Var != null) {
            rc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int p0() {
        switch (this.f35848a) {
            case 3:
                return ((rb1) this.f35849b).f40010b;
            default:
                cc1 cc1Var = (cc1) this.f35849b;
                return cc1Var.d - cc1Var.f35406c;
        }
    }

    @Override
    public boolean r0() {
        return ((nd1) this.f35849b).f38941f.f40032a.r0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21150v3;
    }

    @Override
    public void x0() {
        ((StickersActivity) this.f35849b).j0();
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
