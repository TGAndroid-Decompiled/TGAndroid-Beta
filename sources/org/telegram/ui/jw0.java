package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class jw0 implements r0.n, org.telegram.ui.Components.m81, org.telegram.ui.Components.cr0, org.telegram.ui.Components.kp0, org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.ap0 {
    public final int f39076a;
    public final Object f39077b;

    public jw0(Object obj, int i10) {
        this.f39076a = i10;
        this.f39077b = obj;
    }

    @Override
    public Paint F(String str) {
        return ((td1) this.f39077b).f42027f.f43981a.F(str);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        switch (this.f39076a) {
            case 0:
                mw0 mw0Var = (mw0) this.f39077b;
                i0.b g10 = k1Var.f46821a.g(519);
                mw0Var.f40060r = g10;
                mw0Var.d.setPadding(g10.f11576a, g10.f11577b, g10.f11578c, g10.d);
                mw0Var.f40051c.requestLayout();
                return r0.k1.f46820b;
            default:
                me1 me1Var = (me1) this.f39077b;
                i0.b g11 = k1Var.f46821a.g(519);
                me1Var.f39932n = g11;
                me1Var.f39926c.setPadding(g11.f11576a, g11.f11577b, g11.f11578c, g11.d);
                me1Var.f39924b.requestLayout();
                return r0.k1.f46820b;
        }
    }

    @Override
    public void P() {
        ((StickersActivity) this.f39077b).j0();
    }

    @Override
    public void X(float f7, boolean z10) {
        switch (this.f39076a) {
            case 3:
                xb1 xb1Var = (xb1) this.f39077b;
                ThemeActivity.Y(xb1Var.d, Math.round((xb1Var.f43961b * f7) + 0), false);
                return;
            default:
                ic1 ic1Var = (ic1) this.f39077b;
                ThemeActivity themeActivity = ic1Var.h;
                int i10 = ic1Var.f38652c;
                ThemeActivity.k0(themeActivity, Math.round(((ic1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((td1) this.f39077b).f42027f.f43981a.a();
    }

    @Override
    public int a1(int i10) {
        return ((td1) this.f39077b).f42027f.f43981a.a1(i10);
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39077b;
        c51 c51Var = secretMediaViewer.f34505y;
        if (c51Var != null) {
            long p5 = c51Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34505y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34505y.C();
        }
    }

    @Override
    public int c0(int i10) {
        return ((td1) this.f39077b).f42027f.f43981a.x0(i10);
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39077b;
        c51 c51Var = secretMediaViewer.f34505y;
        if (c51Var != null) {
            c51Var.B();
            long p5 = secretMediaViewer.f34505y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34505y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f39077b).f36375t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        fg1 fg1Var = ((bg1) this.f39077b).f36375t0;
        HashSet hashSet = fg1.f37601n1;
        fg1Var.M0(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((bg1) this.f39077b).f36375t0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f39076a) {
            case 3:
                xb1 xb1Var = (xb1) this.f39077b;
                return String.valueOf(Math.round((xb1Var.f43960a.getProgress() * xb1Var.f43961b) + 0));
            default:
                ic1 ic1Var = (ic1) this.f39077b;
                int i10 = ic1Var.f38652c;
                return String.valueOf(Math.round((ic1Var.f38651b.getProgress() * (ic1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        xd1 xd1Var = ((td1) this.f39077b).f42027f;
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
        xc1 xc1Var = xd1Var.f43981a;
        if (xc1Var != null) {
            return xc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.P0(str);
    }

    @Override
    public int i0() {
        switch (this.f39076a) {
            case 3:
                return ((xb1) this.f39077b).f43961b;
            default:
                ic1 ic1Var = (ic1) this.f39077b;
                return ic1Var.d - ic1Var.f38652c;
        }
    }

    @Override
    public boolean k0() {
        return ((td1) this.f39077b).f42027f.f43981a.k0();
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        xc1 xc1Var = ((td1) this.f39077b).f42027f.f43981a;
        if (xc1Var != null) {
            xc1Var.m(f7, f10, i10, i11);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public void q0() {
        ((StickersActivity) this.f39077b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21129v3;
    }

    @Override
    public int x0(int i10) {
        return ((td1) this.f39077b).f42027f.f43981a.x0(i10);
    }

    @Override
    public void z() {
        int i10 = this.f39076a;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void I0(int i10, int i11) {
    }
}
