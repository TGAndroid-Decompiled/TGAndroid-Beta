package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 implements r0.n, org.telegram.ui.Components.h71, org.telegram.ui.Components.wp0, org.telegram.ui.Components.eo0, org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.un0 {
    public final int f34988a;
    public final Object f34989b;

    public jw0(Object obj, int i10) {
        this.f34988a = i10;
        this.f34989b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f34988a;
    }

    @Override
    public Paint G(String str) {
        return ((rd1) this.f34989b).f37084f.f38513a.G(str);
    }

    @Override
    public int G0(int i10) {
        return ((rd1) this.f34989b).f37084f.f38513a.G0(i10);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f34988a) {
            case 0:
                mw0 mw0Var = (mw0) this.f34989b;
                i0.b g10 = l1Var.f41855a.g(519);
                mw0Var.f35829r = g10;
                mw0Var.d.setPadding(g10.f10588a, g10.f10589b, g10.f10590c, g10.d);
                mw0Var.f35821c.requestLayout();
                return r0.l1.f41854b;
            default:
                ke1 ke1Var = (ke1) this.f34989b;
                i0.b g11 = l1Var.f41855a.g(519);
                ke1Var.f35134n = g11;
                ke1Var.f35129c.setPadding(g11.f10588a, g11.f10589b, g11.f10590c, g11.d);
                ke1Var.f35127b.requestLayout();
                return r0.l1.f41854b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f34989b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f34988a) {
            case 3:
                vb1 vb1Var = (vb1) this.f34989b;
                ThemeActivity.Y(vb1Var.d, Math.round((vb1Var.f38496b * f7) + 0), false);
                return;
            default:
                gc1 gc1Var = (gc1) this.f34989b;
                ThemeActivity themeActivity = gc1Var.h;
                int i10 = gc1Var.f33863c;
                ThemeActivity.k0(themeActivity, Math.round(((gc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((rd1) this.f34989b).f37084f.f38513a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34989b;
        z41 z41Var = secretMediaViewer.f31490y;
        if (z41Var != null) {
            long p5 = z41Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31490y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f31490y.C();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34989b;
        z41 z41Var = secretMediaViewer.f31490y;
        if (z41Var != null) {
            z41Var.B();
            long p5 = secretMediaViewer.f31490y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f31490y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((zf1) this.f34989b).f40207t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        dg1 dg1Var = ((zf1) this.f34989b).f40207t0;
        HashSet hashSet = dg1.f33011n1;
        dg1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((zf1) this.f34989b).f40207t0.finishPreviewFragment();
        }
    }

    @Override
    public int g0(int i10) {
        return ((rd1) this.f34989b).f37084f.f38513a.G0(i10);
    }

    @Override
    public int g1(int i10) {
        return ((rd1) this.f34989b).f37084f.f38513a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f34988a) {
            case 3:
                vb1 vb1Var = (vb1) this.f34989b;
                return String.valueOf(Math.round((vb1Var.f38495a.getProgress() * vb1Var.f38496b) + 0));
            default:
                gc1 gc1Var = (gc1) this.f34989b;
                int i10 = gc1Var.f33863c;
                return String.valueOf(Math.round((gc1Var.f33862b.getProgress() * (gc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        vd1 vd1Var = ((rd1) this.f34989b).f37084f;
        if (str.equals("drawableMsgOut")) {
            return vd1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return vd1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return vd1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return vd1Var.U;
        }
        vc1 vc1Var = vd1Var.f38513a;
        if (vc1Var != null) {
            return vc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        vc1 vc1Var = ((rd1) this.f34989b).f37084f.f38513a;
        if (vc1Var != null) {
            vc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f34988a) {
            case 3:
                return ((vb1) this.f34989b).f38496b;
            default:
                gc1 gc1Var = (gc1) this.f34989b;
                return gc1Var.d - gc1Var.f33863c;
        }
    }

    @Override
    public boolean p0() {
        return ((rd1) this.f34989b).f37084f.f38513a.p0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f34989b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f19163v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
