package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class i6 implements org.telegram.ui.ActionBar.s6 {
    public final int f38076a;
    public final org.telegram.ui.ActionBar.o2 f38077b;

    public i6(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f38076a = i10;
        this.f38077b = o2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f38076a;
    }

    @Override
    public final void b() {
        switch (this.f38076a) {
            case 0:
                yu yuVar = ((c7) this.f38077b).T;
                if (yuVar != null) {
                    yuVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false));
                    return;
                }
                return;
            case 1:
                ((sn) this.f38077b).fb();
                return;
            case 2:
                ((kp) this.f38077b).getClass();
                return;
            case 3:
                ((rp) this.f38077b).W();
                return;
            case 4:
                ((dq) this.f38077b).getClass();
                return;
            case 5:
                ((jr) this.f38077b).getClass();
                return;
            case 6:
                ((ContactsActivity) this.f38077b).g0();
                return;
            case 7:
                ey eyVar = (ey) this.f38077b;
                nx nxVar = eyVar.C0;
                if (nxVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = nxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21537w8, actionMode, eyVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.u0 speedItem = eyVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21573y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((q00) this.f38077b).getClass();
                return;
            case 9:
                ((b20) this.f38077b).w0();
                return;
            case 10:
                ((n70) this.f38077b).V(true);
                return;
            case 11:
                ((sc0) this.f38077b).c0();
                return;
            case 12:
                ((ig0) this.f38077b).C1();
                return;
            case 13:
                ((mh0) this.f38077b).b0();
                return;
            case 14:
                ((yi0) this.f38077b).a0();
                return;
            case 15:
                ((NotificationsCustomSettingsActivity) this.f38077b).getClass();
                return;
            case 16:
                ((lp0) this.f38077b).F0();
                return;
            case 17:
                ((PremiumPreviewFragment) this.f38077b).u0();
                return;
            case 18:
                ((ox0) this.f38077b).getClass();
                return;
            case 19:
                ((ProfileActivity) this.f38077b).V4();
                return;
            case 20:
                ((d11) this.f38077b).getClass();
                return;
            case 21:
                d21 d21Var = (d21) this.f38077b;
                d21Var.f36487a.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false));
                d21Var.f36489c.l();
                return;
            case 22:
                ((u91) this.f38077b).p0();
                return;
            case 23:
                ThemeActivity themeActivity = (ThemeActivity) this.f38077b;
                for (int i10 = 0; i10 < themeActivity.f34200b.getChildCount(); i10++) {
                    View childAt = themeActivity.f34200b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().l();
                    } else if (childAt instanceof qo0) {
                        ((qo0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.f34200b.getCachedChildCount(); i11++) {
                    View P = themeActivity.f34200b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof qo0) {
                        ((qo0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f34200b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.f34200b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof qo0) {
                        ((qo0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f34200b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.f34200b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof qo0) {
                        ((qo0) O).updateColors();
                    }
                }
                return;
            case 24:
                ((qc1) this.f38077b).Q0();
                return;
            default:
                ((md1) this.f38077b).U();
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
