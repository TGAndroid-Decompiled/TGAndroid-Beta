package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class i6 implements org.telegram.ui.ActionBar.s6 {
    public final int f38151a;
    public final org.telegram.ui.ActionBar.o2 f38152b;

    public i6(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f38151a = i10;
        this.f38152b = o2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f38151a;
    }

    @Override
    public final void b() {
        switch (this.f38151a) {
            case 0:
                yu yuVar = ((c7) this.f38152b).T;
                if (yuVar != null) {
                    yuVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false));
                    return;
                }
                return;
            case 1:
                ((sn) this.f38152b).fb();
                return;
            case 2:
                ((kp) this.f38152b).getClass();
                return;
            case 3:
                ((rp) this.f38152b).W();
                return;
            case 4:
                ((dq) this.f38152b).getClass();
                return;
            case 5:
                ((jr) this.f38152b).getClass();
                return;
            case 6:
                ((ContactsActivity) this.f38152b).g0();
                return;
            case 7:
                ey eyVar = (ey) this.f38152b;
                nx nxVar = eyVar.C0;
                if (nxVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = nxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21538w8, actionMode, eyVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.u0 speedItem = eyVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21574y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((q00) this.f38152b).getClass();
                return;
            case 9:
                ((b20) this.f38152b).w0();
                return;
            case 10:
                ((n70) this.f38152b).V(true);
                return;
            case 11:
                ((rc0) this.f38152b).c0();
                return;
            case 12:
                ((hg0) this.f38152b).C1();
                return;
            case 13:
                ((lh0) this.f38152b).b0();
                return;
            case 14:
                ((xi0) this.f38152b).a0();
                return;
            case 15:
                ((NotificationsCustomSettingsActivity) this.f38152b).getClass();
                return;
            case 16:
                ((kp0) this.f38152b).F0();
                return;
            case 17:
                ((PremiumPreviewFragment) this.f38152b).u0();
                return;
            case 18:
                ((nx0) this.f38152b).getClass();
                return;
            case 19:
                ((ProfileActivity) this.f38152b).V4();
                return;
            case 20:
                ((c11) this.f38152b).getClass();
                return;
            case 21:
                c21 c21Var = (c21) this.f38152b;
                c21Var.f36197a.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, false));
                c21Var.f36199c.l();
                return;
            case 22:
                ((t91) this.f38152b).p0();
                return;
            case 23:
                ThemeActivity themeActivity = (ThemeActivity) this.f38152b;
                for (int i10 = 0; i10 < themeActivity.f34202b.getChildCount(); i10++) {
                    View childAt = themeActivity.f34202b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().l();
                    } else if (childAt instanceof po0) {
                        ((po0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.f34202b.getCachedChildCount(); i11++) {
                    View P = themeActivity.f34202b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof po0) {
                        ((po0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f34202b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.f34202b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof po0) {
                        ((po0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f34202b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.f34202b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof po0) {
                        ((po0) O).updateColors();
                    }
                }
                return;
            case 24:
                ((pc1) this.f38152b).Q0();
                return;
            default:
                ((ld1) this.f38152b).U();
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
