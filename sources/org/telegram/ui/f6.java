package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
public final class f6 implements org.telegram.ui.ActionBar.t6 {
    public final int f45597a;
    public final org.telegram.ui.ActionBar.f2 f45598b;

    public f6(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f45597a = i7;
        this.f45598b = f2Var;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f45597a;
    }

    @Override
    public final void b() {
        int i7 = this.f45597a;
        org.telegram.ui.ActionBar.f2 f2Var = this.f45598b;
        switch (i7) {
            case 0:
                yt ytVar = ((y6) f2Var).Z;
                if (ytVar != null) {
                    ytVar.v0(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
                    return;
                }
                return;
            case 1:
                ((cn) f2Var).Eb();
                return;
            case 2:
                ((uo) f2Var).getClass();
                return;
            case 3:
                ((bp) f2Var).h.f();
                return;
            case 4:
                ((mp) f2Var).getClass();
                return;
            case 5:
                ((qq) f2Var).getClass();
                return;
            case 6:
                ((ContactsActivity) f2Var).getClass();
                return;
            case 7:
                yw ywVar = (yw) f2Var;
                hw hwVar = ywVar.C0;
                if (hwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = hwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f28221w8, actionMode, ywVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.r0 speedItem = ywVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.f28259y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((iz) f2Var).getClass();
                return;
            case 9:
                ((q00) f2Var).x0();
                return;
            case 10:
                ((w50) f2Var).a0(true);
                return;
            case 11:
                ((ee0) f2Var).Q1();
                return;
            case 12:
                ((ef0) f2Var).g0();
                return;
            case 13:
                ((lg0) f2Var).f0();
                return;
            case 14:
                ((NotificationsCustomSettingsActivity) f2Var).getClass();
                return;
            case 15:
                ((jm0) f2Var).J0();
                return;
            case 16:
                ((PremiumPreviewFragment) f2Var).z0();
                return;
            case 17:
                ((ut0) f2Var).getClass();
                return;
            case 18:
                RectF rectF = ProfileActivity.V6;
                ((ProfileActivity) f2Var).p5();
                return;
            case 19:
                ((kx0) f2Var).getClass();
                return;
            case 20:
                ((ey0) f2Var).f45536b.f();
                return;
            case 21:
                ((d51) f2Var).s0();
                return;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) f2Var;
                for (int i10 = 0; i10 < themeActivity.f42020b.getChildCount(); i10++) {
                    View childAt = themeActivity.f42020b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof pl0) {
                        ((pl0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.f42020b.getCachedChildCount(); i11++) {
                    View P = themeActivity.f42020b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof pl0) {
                        ((pl0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f42020b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.f42020b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof pl0) {
                        ((pl0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f42020b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.f42020b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof pl0) {
                        ((pl0) O).updateColors();
                    }
                }
                return;
            case 23:
                ((w71) f2Var).V0();
                return;
            default:
                ((o81) f2Var).Z();
                return;
        }
    }

    private final void A(float f10) {
    }

    private final void c(float f10) {
    }

    private final void d(float f10) {
    }

    private final void e(float f10) {
    }

    private final void f(float f10) {
    }

    private final void g(float f10) {
    }

    private final void h(float f10) {
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }

    private final void k(float f10) {
    }

    private final void l(float f10) {
    }

    private final void m(float f10) {
    }

    private final void n(float f10) {
    }

    private final void o(float f10) {
    }

    private final void p(float f10) {
    }

    private final void q(float f10) {
    }

    private final void r(float f10) {
    }

    private final void s(float f10) {
    }

    private final void t(float f10) {
    }

    private final void u(float f10) {
    }

    private final void v(float f10) {
    }

    private final void w(float f10) {
    }

    private final void x(float f10) {
    }

    private final void y(float f10) {
    }

    private final void z(float f10) {
    }
}
