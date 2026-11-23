package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
public final class g6 implements org.telegram.ui.ActionBar.v6 {
    public final int f48114a;
    public final org.telegram.ui.ActionBar.g2 f48115b;

    public g6(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f48114a = i7;
        this.f48115b = g2Var;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f48114a;
    }

    @Override
    public final void b() {
        int i7 = this.f48114a;
        org.telegram.ui.ActionBar.g2 g2Var = this.f48115b;
        switch (i7) {
            case 0:
                zt ztVar = ((y6) g2Var).f54241a0;
                if (ztVar != null) {
                    ztVar.v0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false));
                    return;
                }
                return;
            case 1:
                ((bn) g2Var).Fb();
                return;
            case 2:
                ((uo) g2Var).getClass();
                return;
            case 3:
                ((bp) g2Var).h.f();
                return;
            case 4:
                ((np) g2Var).getClass();
                return;
            case 5:
                ((rq) g2Var).getClass();
                return;
            case 6:
                ((ContactsActivity) g2Var).getClass();
                return;
            case 7:
                bx bxVar = (bx) g2Var;
                jw jwVar = bxVar.D0;
                if (jwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = jwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29807w8, actionMode, bxVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.q0 speedItem = bxVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29845y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((jz) g2Var).getClass();
                return;
            case 9:
                ((r00) g2Var).x0();
                return;
            case 10:
                ((v50) g2Var).a0(true);
                return;
            case 11:
                ((de0) g2Var).Q1();
                return;
            case 12:
                ((ef0) g2Var).g0();
                return;
            case 13:
                ((mg0) g2Var).f0();
                return;
            case 14:
                ((NotificationsCustomSettingsActivity) g2Var).getClass();
                return;
            case 15:
                ((jm0) g2Var).J0();
                return;
            case 16:
                ((PremiumPreviewFragment) g2Var).z0();
                return;
            case 17:
                ((rt0) g2Var).getClass();
                return;
            case 18:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) g2Var).p5();
                return;
            case 19:
                ((hx0) g2Var).getClass();
                return;
            case 20:
                ((cy0) g2Var).f46908b.f();
                return;
            case 21:
                ((b51) g2Var).s0();
                return;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) g2Var;
                for (int i10 = 0; i10 < themeActivity.f43958b.getChildCount(); i10++) {
                    View childAt = themeActivity.f43958b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof pl0) {
                        ((pl0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.f43958b.getCachedChildCount(); i11++) {
                    View P = themeActivity.f43958b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof pl0) {
                        ((pl0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f43958b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.f43958b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof pl0) {
                        ((pl0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f43958b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.f43958b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof pl0) {
                        ((pl0) O).updateColors();
                    }
                }
                return;
            case 23:
                ((v71) g2Var).V0();
                return;
            default:
                ((n81) g2Var).Z();
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
