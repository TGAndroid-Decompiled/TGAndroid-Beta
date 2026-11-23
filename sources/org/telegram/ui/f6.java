package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
public final class f6 implements org.telegram.ui.ActionBar.u6 {
    public final int f47607a;
    public final org.telegram.ui.ActionBar.g2 f47608b;

    public f6(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f47607a = i7;
        this.f47608b = g2Var;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f47607a;
    }

    @Override
    public final void b() {
        int i7 = this.f47607a;
        org.telegram.ui.ActionBar.g2 g2Var = this.f47608b;
        switch (i7) {
            case 0:
                au auVar = ((x6) g2Var).f53649a0;
                if (auVar != null) {
                    auVar.v0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false));
                    return;
                }
                return;
            case 1:
                ((bn) g2Var).Fb();
                return;
            case 2:
                ((vo) g2Var).getClass();
                return;
            case 3:
                ((cp) g2Var).h.f();
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
                cx cxVar = (cx) g2Var;
                kw kwVar = cxVar.D0;
                if (kwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = kwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29737w8, actionMode, cxVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.q0 speedItem = cxVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.f29775y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((kz) g2Var).getClass();
                return;
            case 9:
                ((s00) g2Var).x0();
                return;
            case 10:
                ((v50) g2Var).a0(true);
                return;
            case 11:
                ((de0) g2Var).Q1();
                return;
            case 12:
                ((ff0) g2Var).g0();
                return;
            case 13:
                ((og0) g2Var).f0();
                return;
            case 14:
                ((NotificationsCustomSettingsActivity) g2Var).getClass();
                return;
            case 15:
                ((lm0) g2Var).J0();
                return;
            case 16:
                ((PremiumPreviewFragment) g2Var).z0();
                return;
            case 17:
                ((st0) g2Var).getClass();
                return;
            case 18:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) g2Var).p5();
                return;
            case 19:
                ((jx0) g2Var).getClass();
                return;
            case 20:
                ((ey0) g2Var).f47414b.f();
                return;
            case 21:
                ((c51) g2Var).s0();
                return;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) g2Var;
                for (int i10 = 0; i10 < themeActivity.f43877b.getChildCount(); i10++) {
                    View childAt = themeActivity.f43877b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof rl0) {
                        ((rl0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.f43877b.getCachedChildCount(); i11++) {
                    View P = themeActivity.f43877b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof rl0) {
                        ((rl0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f43877b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.f43877b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof rl0) {
                        ((rl0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f43877b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.f43877b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof rl0) {
                        ((rl0) O).updateColors();
                    }
                }
                return;
            case 23:
                ((x71) g2Var).V0();
                return;
            default:
                ((p81) g2Var).Z();
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
