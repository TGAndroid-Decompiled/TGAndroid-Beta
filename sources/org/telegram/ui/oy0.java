package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oy0 implements org.telegram.ui.ActionBar.i6 {
    public final int f36364a;
    public final org.telegram.ui.ActionBar.m2 f36365b;

    public oy0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f36364a = i10;
        this.f36365b = m2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f36364a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f36364a;
        int i12 = 0;
        org.telegram.ui.ActionBar.m2 m2Var = this.f36365b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) m2Var);
                return;
            case 1:
                n11 n11Var = (n11) m2Var;
                org.telegram.ui.Components.wl0 wl0Var = n11Var.f35725a;
                if (wl0Var != null) {
                    int childCount = wl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = n11Var.f35725a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                f21 f21Var = (f21) m2Var;
                if (f21Var.h != null && ((valueAnimator = f21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ea eaVar = f21Var.h;
                    if (f21Var.F) {
                        i10 = org.telegram.ui.ActionBar.h6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f19462z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                }
                if (f21Var.f33524a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = f21Var.f33524a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19187k6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19205l6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
                            i13++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 3:
                w21 w21Var = (w21) m2Var;
                w21Var.getClass();
                w21Var.setNavigationBarColor(w21Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19004a7));
                return;
            case 4:
                d31 d31Var = (d31) m2Var;
                d31Var.f32906a.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
                d31Var.f32908c.l();
                return;
            case 5:
                sa1 sa1Var = (sa1) m2Var;
                t91 t91Var = sa1Var.S;
                if (t91Var != null) {
                    int childCount2 = t91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        sa1.l0(sa1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = sa1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        sa1.l0(sa1Var.S.V(i15));
                    }
                    int cachedChildCount = sa1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        sa1.l0(sa1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = sa1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        sa1.l0(sa1Var.S.O(i12));
                        i12++;
                    }
                    sa1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = sa1Var.f37669a0;
                if (fVar != null) {
                    fVar.f11101g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) m2Var;
                for (int i17 = 0; i17 < themeActivity.f31838b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f31838b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof yo0) {
                        ((yo0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f31838b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f31838b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof yo0) {
                        ((yo0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f31838b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f31838b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof yo0) {
                        ((yo0) V).a();
                    }
                }
                while (i12 < themeActivity.f31838b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f31838b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof yo0) {
                        ((yo0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                od1.X((od1) m2Var);
                return;
            case 8:
                le1 le1Var = (le1) m2Var;
                org.telegram.ui.Components.wl0 wl0Var2 = le1Var.f35340a;
                if (wl0Var2 != null) {
                    int childCount3 = wl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = le1Var.f35340a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.wl0 wl0Var3 = le1Var.f35341b;
                if (wl0Var3 != null) {
                    int childCount4 = wl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = le1Var.f35341b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                le1Var.f35342c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                le1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19131h6, false));
                return;
            case 9:
                wf1.X((wf1) m2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) m2Var;
                org.telegram.ui.Components.wl0 wl0Var4 = usersSelectActivity.d;
                if (wl0Var4 != null) {
                    int childCount5 = wl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount5; i22++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i22);
                        if (childAt5 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt5).f(0);
                        }
                    }
                    return;
                }
                return;
        }
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
}
