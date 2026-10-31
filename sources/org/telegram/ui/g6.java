package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
public final class g6 implements org.telegram.ui.ActionBar.b7 {
    public final int f37430a;
    public final org.telegram.ui.ActionBar.k2 f37431b;

    public g6(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f37430a = i10;
        this.f37431b = k2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f37430a;
    }

    @Override
    public final void b() {
        int i10 = this.f37430a;
        org.telegram.ui.ActionBar.k2 k2Var = this.f37431b;
        switch (i10) {
            case 0:
                zu zuVar = ((y6) k2Var).Z;
                if (zuVar != null) {
                    zuVar.v0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false));
                    return;
                }
                return;
            case 1:
                ((un) k2Var).rb();
                return;
            case 2:
                ((qp) k2Var).getClass();
                return;
            case 3:
                ((xp) k2Var).h.f();
                return;
            case 4:
                ((iq) k2Var).getClass();
                return;
            case 5:
                ((pr) k2Var).getClass();
                return;
            case 6:
                ((ContactsActivity) k2Var).getClass();
                return;
            case 7:
                ay ayVar = (ay) k2Var;
                kx kxVar = ayVar.C0;
                if (kxVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = kxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21279w8, actionMode, ayVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.t0 speedItem = ayVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.f21313y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((i00) k2Var).getClass();
                return;
            case 9:
                ((p10) k2Var).w0();
                return;
            case 10:
                ((s60) k2Var).Z(true);
                return;
            case 11:
                ((hf0) k2Var).G1();
                return;
            case 12:
                ((kg0) k2Var).f0();
                return;
            case 13:
                ((sh0) k2Var).e0();
                return;
            case 14:
                ((NotificationsCustomSettingsActivity) k2Var).getClass();
                return;
            case 15:
                ((tn0) k2Var).I0();
                return;
            case 16:
                ((PremiumPreviewFragment) k2Var).y0();
                return;
            case 17:
                ((av0) k2Var).getClass();
                return;
            case 18:
                RectF rectF = ProfileActivity.R6;
                ((ProfileActivity) k2Var).l5();
                return;
            case 19:
                ((uy0) k2Var).getClass();
                return;
            case 20:
                ((pz0) k2Var).f40827b.f();
                return;
            case 21:
                ((u61) k2Var).r0();
                return;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) k2Var;
                for (int i11 = 0; i11 < themeActivity.f34089b.getChildCount(); i11++) {
                    View childAt = themeActivity.f34089b.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof zm0) {
                        ((zm0) childAt).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f34089b.getCachedChildCount(); i12++) {
                    View P = themeActivity.f34089b.P(i12);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof zm0) {
                        ((zm0) P).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f34089b.getHiddenChildCount(); i13++) {
                    View V = themeActivity.f34089b.V(i13);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof zm0) {
                        ((zm0) V).updateColors();
                    }
                }
                for (int i14 = 0; i14 < themeActivity.f34089b.getAttachedScrapChildCount(); i14++) {
                    View O = themeActivity.f34089b.O(i14);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof zm0) {
                        ((zm0) O).updateColors();
                    }
                }
                return;
            case 23:
                ((m91) k2Var).U0();
                return;
            default:
                ((ea1) k2Var).Y();
                return;
        }
    }

    private final void A(float f7) {
    }

    private final void c(float f7) {
    }

    private final void d(float f7) {
    }

    private final void e(float f7) {
    }

    private final void f(float f7) {
    }

    private final void g(float f7) {
    }

    private final void h(float f7) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }

    private final void m(float f7) {
    }

    private final void n(float f7) {
    }

    private final void o(float f7) {
    }

    private final void p(float f7) {
    }

    private final void q(float f7) {
    }

    private final void r(float f7) {
    }

    private final void s(float f7) {
    }

    private final void t(float f7) {
    }

    private final void u(float f7) {
    }

    private final void v(float f7) {
    }

    private final void w(float f7) {
    }

    private final void x(float f7) {
    }

    private final void y(float f7) {
    }

    private final void z(float f7) {
    }
}
