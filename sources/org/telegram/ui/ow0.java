package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class ow0 implements r0.n, org.telegram.ui.Components.j81, org.telegram.ui.Components.xq0, org.telegram.ui.Components.fp0, org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.vo0 {
    public final int f38761a;
    public final Object f38762b;

    public ow0(Object obj, int i10) {
        this.f38761a = i10;
        this.f38762b = obj;
    }

    @Override
    public int E0(int i10) {
        return ((yd1) this.f38762b).f41810f.f34577a.E0(i10);
    }

    @Override
    public Paint F(String str) {
        return ((yd1) this.f38762b).f41810f.f34577a.F(str);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        switch (this.f38761a) {
            case 0:
                rw0 rw0Var = (rw0) this.f38762b;
                i0.b g10 = l1Var.f43497a.g(519);
                rw0Var.f39610r = g10;
                rw0Var.d.setPadding(g10.f10892a, g10.f10893b, g10.f10894c, g10.d);
                rw0Var.f39602c.requestLayout();
                return r0.l1.f43496b;
            default:
                re1 re1Var = (re1) this.f38762b;
                i0.b g11 = l1Var.f43497a.g(519);
                re1Var.f39496n = g11;
                re1Var.f39491c.setPadding(g11.f10892a, g11.f10893b, g11.f10894c, g11.d);
                re1Var.f39489b.requestLayout();
                return r0.l1.f43496b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f38762b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f38761a) {
            case 3:
                cc1 cc1Var = (cc1) this.f38762b;
                ThemeActivity.Y(cc1Var.d, Math.round((cc1Var.f34559b * f7) + 0), false);
                return;
            default:
                nc1 nc1Var = (nc1) this.f38762b;
                ThemeActivity themeActivity = nc1Var.h;
                int i10 = nc1Var.f38363c;
                ThemeActivity.k0(themeActivity, Math.round(((nc1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((yd1) this.f38762b).f41810f.f34577a.a();
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38762b;
        j51 j51Var = secretMediaViewer.f32483y;
        if (j51Var != null) {
            long p5 = j51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f32483y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f32483y.C();
        }
    }

    @Override
    public int b0(int i10) {
        return ((yd1) this.f38762b).f41810f.f34577a.E0(i10);
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38762b;
        j51 j51Var = secretMediaViewer.f32483y;
        if (j51Var != null) {
            j51Var.B();
            long p5 = secretMediaViewer.f32483y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f32483y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gg1) this.f38762b).f36214t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        kg1 kg1Var = ((gg1) this.f38762b).f36214t0;
        HashSet hashSet = kg1.f37379n1;
        kg1Var.M0(s2Var);
    }

    @Override
    public int f1(int i10) {
        return ((yd1) this.f38762b).f41810f.f34577a.f1(i10);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((gg1) this.f38762b).f36214t0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f38761a) {
            case 3:
                cc1 cc1Var = (cc1) this.f38762b;
                return String.valueOf(Math.round((cc1Var.f34558a.getProgress() * cc1Var.f34559b) + 0));
            default:
                nc1 nc1Var = (nc1) this.f38762b;
                int i10 = nc1Var.f38363c;
                return String.valueOf(Math.round((nc1Var.f38362b.getProgress() * (nc1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        ce1 ce1Var = ((yd1) this.f38762b).f41810f;
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
        cd1 cd1Var = ce1Var.f34577a;
        if (cd1Var != null) {
            return cd1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.g6.P0(str);
    }

    @Override
    public int k0() {
        switch (this.f38761a) {
            case 3:
                return ((cc1) this.f38762b).f34559b;
            default:
                nc1 nc1Var = (nc1) this.f38762b;
                return nc1Var.d - nc1Var.f38363c;
        }
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        cd1 cd1Var = ((yd1) this.f38762b).f41810f.f34577a;
        if (cd1Var != null) {
            cd1Var.l(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public boolean m0() {
        return ((yd1) this.f38762b).f41810f.f34577a.m0();
    }

    @Override
    public void s0() {
        ((StickersActivity) this.f38762b).j0();
    }

    @Override
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.g6.f19930v3;
    }

    @Override
    public void z() {
        int i10 = this.f38761a;
    }

    private final void d() {
    }

    private final void g() {
    }

    @Override
    public void M0(int i10, int i11) {
    }
}
