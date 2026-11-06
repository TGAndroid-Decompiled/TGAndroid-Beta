package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
public final class f6 implements org.telegram.ui.ActionBar.s6 {
    public final int f45502a;
    public final org.telegram.ui.ActionBar.f2 f45503b;

    public f6(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f45502a = i7;
        this.f45503b = f2Var;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f45502a;
    }

    @Override
    public final void b() {
        int i7 = this.f45502a;
        org.telegram.ui.ActionBar.f2 f2Var = this.f45503b;
        switch (i7) {
            case 0:
                wt wtVar = ((y6) f2Var).Z;
                if (wtVar != null) {
                    wtVar.v0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h5, false));
                    return;
                }
                return;
            case 1:
                ((an) f2Var).Bb();
                return;
            case 2:
                ((so) f2Var).getClass();
                return;
            case 3:
                ((zo) f2Var).h.f();
                return;
            case 4:
                ((kp) f2Var).getClass();
                return;
            case 5:
                ((oq) f2Var).getClass();
                return;
            case 6:
                ((ContactsActivity) f2Var).getClass();
                return;
            case 7:
                ww wwVar = (ww) f2Var;
                fw fwVar = wwVar.C0;
                if (fwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = fwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f28205w8, actionMode, wwVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.r0 speedItem = wwVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28243y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((gz) f2Var).getClass();
                return;
            case 9:
                ((o00) f2Var).x0();
                return;
            case 10:
                ((u50) f2Var).a0(true);
                return;
            case 11:
                ((ce0) f2Var).Q1();
                return;
            case 12:
                ((cf0) f2Var).g0();
                return;
            case 13:
                ((jg0) f2Var).f0();
                return;
            case 14:
                ((NotificationsCustomSettingsActivity) f2Var).getClass();
                return;
            case 15:
                ((hm0) f2Var).J0();
                return;
            case 16:
                ((PremiumPreviewFragment) f2Var).z0();
                return;
            case 17:
                ((st0) f2Var).getClass();
                return;
            case 18:
                RectF rectF = ProfileActivity.S6;
                ((ProfileActivity) f2Var).m5();
                return;
            case 19:
                ((gx0) f2Var).getClass();
                return;
            case 20:
                ((ay0) f2Var).f44117b.f();
                return;
            case 21:
                ((c51) f2Var).s0();
                return;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) f2Var;
                for (int i10 = 0; i10 < themeActivity.f42009b.getChildCount(); i10++) {
                    View childAt = themeActivity.f42009b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof nl0) {
                        ((nl0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.f42009b.getCachedChildCount(); i11++) {
                    View P = themeActivity.f42009b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof nl0) {
                        ((nl0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f42009b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.f42009b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof nl0) {
                        ((nl0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f42009b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.f42009b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof nl0) {
                        ((nl0) O).updateColors();
                    }
                }
                return;
            case 23:
                ((u71) f2Var).V0();
                return;
            default:
                ((m81) f2Var).Z();
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
