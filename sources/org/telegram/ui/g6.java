package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
public final class g6 implements org.telegram.ui.ActionBar.b7 {
    public final int f37357a;
    public final org.telegram.ui.ActionBar.k2 f37358b;

    public g6(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f37357a = i10;
        this.f37358b = k2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f37357a;
    }

    @Override
    public final void b() {
        int i10 = this.f37357a;
        org.telegram.ui.ActionBar.k2 k2Var = this.f37358b;
        switch (i10) {
            case 0:
                yu yuVar = ((y6) k2Var).Z;
                if (yuVar != null) {
                    yuVar.v0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
                    return;
                }
                return;
            case 1:
                ((un) k2Var).wb();
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
                zx zxVar = (zx) k2Var;
                jx jxVar = zxVar.C0;
                if (jxVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = jxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21280w8, actionMode, zxVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.t0 speedItem = zxVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.f21314y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((h00) k2Var).getClass();
                return;
            case 9:
                ((o10) k2Var).x0();
                return;
            case 10:
                ((r60) k2Var).a0(true);
                return;
            case 11:
                ((gf0) k2Var).H1();
                return;
            case 12:
                ((ig0) k2Var).g0();
                return;
            case 13:
                ((qh0) k2Var).f0();
                return;
            case 14:
                ((NotificationsCustomSettingsActivity) k2Var).getClass();
                return;
            case 15:
                ((rn0) k2Var).J0();
                return;
            case 16:
                ((PremiumPreviewFragment) k2Var).z0();
                return;
            case 17:
                ((zu0) k2Var).getClass();
                return;
            case 18:
                RectF rectF = ProfileActivity.S6;
                ((ProfileActivity) k2Var).m5();
                return;
            case 19:
                ((ty0) k2Var).getClass();
                return;
            case 20:
                ((oz0) k2Var).f40308b.f();
                return;
            case 21:
                ((s61) k2Var).s0();
                return;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) k2Var;
                for (int i11 = 0; i11 < themeActivity.f34096b.getChildCount(); i11++) {
                    View childAt = themeActivity.f34096b.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof xm0) {
                        ((xm0) childAt).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f34096b.getCachedChildCount(); i12++) {
                    View P = themeActivity.f34096b.P(i12);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof xm0) {
                        ((xm0) P).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f34096b.getHiddenChildCount(); i13++) {
                    View V = themeActivity.f34096b.V(i13);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof xm0) {
                        ((xm0) V).updateColors();
                    }
                }
                for (int i14 = 0; i14 < themeActivity.f34096b.getAttachedScrapChildCount(); i14++) {
                    View O = themeActivity.f34096b.O(i14);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof xm0) {
                        ((xm0) O).updateColors();
                    }
                }
                return;
            case 23:
                ((k91) k2Var).V0();
                return;
            default:
                ((ca1) k2Var).Z();
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
