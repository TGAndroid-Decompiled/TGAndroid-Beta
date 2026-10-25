package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class j6 implements org.telegram.ui.ActionBar.g7 {
    public final int f40465a;
    public final org.telegram.ui.ActionBar.r2 f40466b;

    public j6(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f40465a = i10;
        this.f40466b = r2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f40465a;
    }

    @Override
    public final void b() {
        int i10 = this.f40465a;
        org.telegram.ui.ActionBar.r2 r2Var = this.f40466b;
        switch (i10) {
            case 0:
                vu vuVar = ((c7) r2Var).Z;
                if (vuVar != null) {
                    vuVar.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false));
                    return;
                }
                return;
            case 1:
                ((un) r2Var).kb();
                return;
            case 2:
                ((np) r2Var).getClass();
                return;
            case 3:
                ((vp) r2Var).h.l();
                return;
            case 4:
                ((gq) r2Var).getClass();
                return;
            case 5:
                ((kr) r2Var).getClass();
                return;
            case 6:
                ((ContactsActivity) r2Var).getClass();
                return;
            case 7:
                cy cyVar = (cy) r2Var;
                jx jxVar = cyVar.C0;
                if (jxVar != null) {
                    org.telegram.ui.ActionBar.z actionMode = jxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23711w8, actionMode, cyVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.w0 speedItem = cyVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23748y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((o00) r2Var).getClass();
                return;
            case 9:
                ((d20) r2Var).t0();
                return;
            case 10:
                ((p70) r2Var).W(true);
                return;
            case 11:
                ((pc0) r2Var).d0();
                return;
            case 12:
                ((gg0) r2Var).D1();
                return;
            case 13:
                ((jh0) r2Var).c0();
                return;
            case 14:
                ((vi0) r2Var).b0();
                return;
            case 15:
                ((NotificationsCustomSettingsActivity) r2Var).getClass();
                return;
            case 16:
                ((rp0) r2Var).F0();
                return;
            case 17:
                ((PremiumPreviewFragment) r2Var).v0();
                return;
            case 18:
                ((sx0) r2Var).getClass();
                return;
            case 19:
                int i11 = ProfileActivity.R6;
                ((ProfileActivity) r2Var).d5();
                return;
            case 20:
                ((h11) r2Var).getClass();
                return;
            case 21:
                ((g21) r2Var).f39524b.l();
                return;
            case 22:
                ((w91) r2Var).o0();
                return;
            case 23:
                ThemeActivity themeActivity = (ThemeActivity) r2Var;
                for (int i12 = 0; i12 < themeActivity.f36262b.getChildCount(); i12++) {
                    View childAt = themeActivity.f36262b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().l();
                    } else if (childAt instanceof wo0) {
                        ((wo0) childAt).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f36262b.getCachedChildCount(); i13++) {
                    View P = themeActivity.f36262b.P(i13);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof wo0) {
                        ((wo0) P).updateColors();
                    }
                }
                for (int i14 = 0; i14 < themeActivity.f36262b.getHiddenChildCount(); i14++) {
                    View V = themeActivity.f36262b.V(i14);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof wo0) {
                        ((wo0) V).updateColors();
                    }
                }
                for (int i15 = 0; i15 < themeActivity.f36262b.getAttachedScrapChildCount(); i15++) {
                    View O = themeActivity.f36262b.O(i15);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof wo0) {
                        ((wo0) O).updateColors();
                    }
                }
                return;
            case 24:
                ((tc1) r2Var).R0();
                return;
            default:
                ((pd1) r2Var).V();
                return;
        }
    }

    private final void A(float f7) {
    }

    private final void B(float f7) {
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
