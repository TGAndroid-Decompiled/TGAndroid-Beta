package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
public final class g6 implements org.telegram.ui.ActionBar.r6 {
    public final int f47351a;
    public final org.telegram.ui.ActionBar.e2 f47352b;

    public g6(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f47351a = i7;
        this.f47352b = e2Var;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f47351a;
    }

    @Override
    public final void b() {
        int i7 = this.f47351a;
        org.telegram.ui.ActionBar.e2 e2Var = this.f47352b;
        switch (i7) {
            case 0:
                yt ytVar = ((y6) e2Var).f53435a0;
                if (ytVar != null) {
                    ytVar.v0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
                    return;
                }
                return;
            case 1:
                ((an) e2Var).Fb();
                return;
            case 2:
                ((to) e2Var).getClass();
                return;
            case 3:
                ((ap) e2Var).h.f();
                return;
            case 4:
                ((mp) e2Var).getClass();
                return;
            case 5:
                ((qq) e2Var).getClass();
                return;
            case 6:
                ((ContactsActivity) e2Var).getClass();
                return;
            case 7:
                yw ywVar = (yw) e2Var;
                hw hwVar = ywVar.D0;
                if (hwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = hwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f29205w8, actionMode, ywVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.q0 speedItem = ywVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.f29243y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((hz) e2Var).getClass();
                return;
            case 9:
                ((p00) e2Var).x0();
                return;
            case 10:
                ((t50) e2Var).a0(true);
                return;
            case 11:
                ((ce0) e2Var).Q1();
                return;
            case 12:
                ((cf0) e2Var).g0();
                return;
            case 13:
                ((jg0) e2Var).f0();
                return;
            case 14:
                ((NotificationsCustomSettingsActivity) e2Var).getClass();
                return;
            case 15:
                ((im0) e2Var).J0();
                return;
            case 16:
                ((PremiumPreviewFragment) e2Var).z0();
                return;
            case 17:
                ((pt0) e2Var).getClass();
                return;
            case 18:
                RectF rectF = ProfileActivity.X6;
                ((ProfileActivity) e2Var).o5();
                return;
            case 19:
                ((fx0) e2Var).getClass();
                return;
            case 20:
                ((zx0) e2Var).f54055b.f();
                return;
            case 21:
                ((z41) e2Var).s0();
                return;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) e2Var;
                for (int i10 = 0; i10 < themeActivity.f43386b.getChildCount(); i10++) {
                    View childAt = themeActivity.f43386b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof ol0) {
                        ((ol0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.f43386b.getCachedChildCount(); i11++) {
                    View P = themeActivity.f43386b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof ol0) {
                        ((ol0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.f43386b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.f43386b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof ol0) {
                        ((ol0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.f43386b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.f43386b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof ol0) {
                        ((ol0) O).updateColors();
                    }
                }
                return;
            case 23:
                ((t71) e2Var).V0();
                return;
            default:
                ((l81) e2Var).Z();
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
