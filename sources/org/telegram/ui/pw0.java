package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class pw0 implements r0.o, org.telegram.ui.Components.i81, org.telegram.ui.Components.yq0, org.telegram.ui.Components.fp0, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.vo0 {
    public final int f39298a;
    public final Object f39299b;

    public pw0(Object obj, int i10) {
        this.f39298a = i10;
        this.f39299b = obj;
    }

    @Override
    public int F0(int i10) {
        return ((yd1) this.f39299b).f42142f.f34853a.F0(i10);
    }

    @Override
    public Paint G(String str) {
        return ((yd1) this.f39299b).f42142f.f34853a.G(str);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f39298a) {
            case 0:
                sw0 sw0Var = (sw0) this.f39299b;
                i0.b g10 = l1Var.f43741a.g(519);
                sw0Var.f40240r = g10;
                sw0Var.d.setPadding(g10.f10888a, g10.f10889b, g10.f10890c, g10.d);
                sw0Var.f40232c.requestLayout();
                return r0.l1.f43740b;
            default:
                se1 se1Var = (se1) this.f39299b;
                i0.b g11 = l1Var.f43741a.g(519);
                se1Var.f40117n = g11;
                se1Var.f40112c.setPadding(g11.f10888a, g11.f10889b, g11.f10890c, g11.d);
                se1Var.f40110b.requestLayout();
                return r0.l1.f43740b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f39299b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f39298a) {
            case 3:
                cc1 cc1Var = (cc1) this.f39299b;
                ThemeActivity.Y(cc1Var.d, Math.round((cc1Var.f34835b * f7) + 0), false);
                return;
            default:
                nc1 nc1Var = (nc1) this.f39299b;
                ThemeActivity themeActivity = nc1Var.h;
                int i10 = nc1Var.f38644c;
                ThemeActivity.k0(themeActivity, Math.round(((nc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((yd1) this.f39299b).f42142f.f34853a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39299b;
        j51 j51Var = secretMediaViewer.f32781y;
        if (j51Var != null) {
            long p5 = j51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f32781y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f32781y.C();
        }
    }

    @Override
    public int b0(int i10) {
        return ((yd1) this.f39299b).f42142f.f34853a.F0(i10);
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39299b;
        j51 j51Var = secretMediaViewer.f32781y;
        if (j51Var != null) {
            j51Var.B();
            long p5 = secretMediaViewer.f32781y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f32781y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((hg1) this.f39299b).f36814t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        lg1 lg1Var = ((hg1) this.f39299b).f36814t0;
        HashSet hashSet = lg1.f37956n1;
        lg1Var.M0(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((hg1) this.f39299b).f36814t0.finishPreviewFragment();
        }
    }

    @Override
    public int g1(int i10) {
        return ((yd1) this.f39299b).f42142f.f34853a.g1(i10);
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f39298a) {
            case 3:
                cc1 cc1Var = (cc1) this.f39299b;
                return String.valueOf(Math.round((cc1Var.f34834a.getProgress() * cc1Var.f34835b) + 0));
            default:
                nc1 nc1Var = (nc1) this.f39299b;
                int i10 = nc1Var.f38644c;
                return String.valueOf(Math.round((nc1Var.f38643b.getProgress() * (nc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        ce1 ce1Var = ((yd1) this.f39299b).f42142f;
        if (str.equals("drawableMsgOut")) {
            return ce1Var.R;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ce1Var.S;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return ce1Var.T;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return ce1Var.U;
        }
        cd1 cd1Var = ce1Var.f34853a;
        if (cd1Var != null) {
            return cd1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.g6.P0(str);
    }

    @Override
    public int k0() {
        switch (this.f39298a) {
            case 3:
                return ((cc1) this.f39299b).f34835b;
            default:
                nc1 nc1Var = (nc1) this.f39299b;
                return nc1Var.d - nc1Var.f38644c;
        }
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        cd1 cd1Var = ((yd1) this.f39299b).f42142f.f34853a;
        if (cd1Var != null) {
            cd1Var.l(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public boolean m0() {
        return ((yd1) this.f39299b).f42142f.f34853a.m0();
    }

    @Override
    public void s0() {
        ((StickersActivity) this.f39299b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.g6.f20230v3;
    }

    @Override
    public void z() {
        int i10 = this.f39298a;
    }

    private final void d() {
    }

    private final void g() {
    }

    @Override
    public void N0(int i10, int i11) {
    }
}
