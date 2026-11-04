package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
public final class h6 implements org.telegram.ui.ActionBar.s6 {
    public final int f45826a;
    public final org.telegram.ui.ActionBar.d2 f45827b;

    public h6(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f45826a = i3;
        this.f45827b = d2Var;
    }

    @Override
    public final void a(float f10) {
        int i3 = this.f45826a;
    }

    @Override
    public final void b() {
        int i3 = this.f45826a;
        org.telegram.ui.ActionBar.d2 d2Var = this.f45827b;
        switch (i3) {
            case 0:
                ut utVar = ((z6) d2Var).f52546a0;
                if (utVar != null) {
                    utVar.v0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
                    return;
                }
                return;
            case 1:
                ((wm) d2Var).Bb();
                return;
            case 2:
                ((qo) d2Var).getClass();
                return;
            case 3:
                ((xo) d2Var).h.f();
                return;
            case 4:
                ((ip) d2Var).getClass();
                return;
            case 5:
                ((nq) d2Var).getClass();
                return;
            case 6:
                ((ContactsActivity) d2Var).getClass();
                return;
            case 7:
                uw uwVar = (uw) d2Var;
                cw cwVar = uwVar.D0;
                if (cwVar != null) {
                    org.telegram.ui.ActionBar.x actionMode = cwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f28236w8, actionMode, uwVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.q0 speedItem = uwVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28275y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((ez) d2Var).getClass();
                return;
            case 9:
                ((l00) d2Var).x0();
                return;
            case 10:
                ((o50) d2Var).a0(true);
                return;
            case 11:
                ((xd0) d2Var).H1();
                return;
            case 12:
                ((xe0) d2Var).g0();
                return;
            case 13:
                ((dg0) d2Var).f0();
                return;
            case 14:
                ((NotificationsCustomSettingsActivity) d2Var).getClass();
                return;
            case 15:
                ((cm0) d2Var).J0();
                return;
            case 16:
                ((PremiumPreviewFragment) d2Var).z0();
                return;
            case 17:
                ((it0) d2Var).getClass();
                return;
            case 18:
                RectF rectF = ProfileActivity.T6;
                ((ProfileActivity) d2Var).m5();
                return;
            case 19:
                ((yw0) d2Var).getClass();
                return;
            case 20:
                ((sx0) d2Var).f49641b.f();
                return;
            case 21:
                ((r41) d2Var).s0();
                return;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) d2Var;
                for (int i10 = 0; i10 < themeActivity.f42043b.getChildCount(); i10++) {
                    View childAt = themeActivity.f42043b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof il0) {
                        ((il0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.f42043b.getCachedChildCount(); i11++) {
                    View P = themeActivity.f42043b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof il0) {
                        ((il0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f42043b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.f42043b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof il0) {
                        ((il0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f42043b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.f42043b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof il0) {
                        ((il0) O).updateColors();
                    }
                }
                return;
            case 23:
                ((l71) d2Var).V0();
                return;
            default:
                ((d81) d2Var).Z();
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
