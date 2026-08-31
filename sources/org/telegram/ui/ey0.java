package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ey0 implements org.telegram.ui.ActionBar.l6 {
    public final int f36707a;
    public final org.telegram.ui.ActionBar.p2 f36708b;

    public ey0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f36707a = i10;
        this.f36708b = p2Var;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f36707a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f36707a;
        int i12 = 0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f36708b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) p2Var);
                return;
            case 1:
                g11 g11Var = (g11) p2Var;
                org.telegram.ui.Components.tl0 tl0Var = g11Var.f37056a;
                if (tl0Var != null) {
                    int childCount = tl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = g11Var.f37056a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                z11 z11Var = (z11) p2Var;
                if (z11Var.h != null && ((valueAnimator = z11Var.D) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.aa aaVar = z11Var.h;
                    if (z11Var.C) {
                        i10 = org.telegram.ui.ActionBar.k6.f21894q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f22053z6;
                    }
                    aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                }
                if (z11Var.f43772a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = z11Var.f43772a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21785k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21803l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
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
                o21 o21Var = (o21) p2Var;
                o21Var.getClass();
                o21Var.setNavigationBarColor(o21Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
                return;
            case 4:
                w21 w21Var = (w21) p2Var;
                w21Var.f42362a.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
                w21Var.f42364c.l();
                return;
            case 5:
                ha1 ha1Var = (ha1) p2Var;
                i91 i91Var = ha1Var.P;
                if (i91Var != null) {
                    int childCount2 = i91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        ha1.l0(ha1Var.P.getChildAt(i14));
                    }
                    int hiddenChildCount = ha1Var.P.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        ha1.l0(ha1Var.P.V(i15));
                    }
                    int cachedChildCount = ha1Var.P.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        ha1.l0(ha1Var.P.P(i16));
                    }
                    int attachedScrapChildCount = ha1Var.P.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        ha1.l0(ha1Var.P.O(i12));
                        i12++;
                    }
                    ha1Var.P.getRecycledViewPool().a();
                }
                wf.f fVar = ha1Var.X;
                if (fVar != null) {
                    fVar.f49522g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) p2Var;
                for (int i17 = 0; i17 < themeActivity.f34872b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f34872b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof qo0) {
                        ((qo0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f34872b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f34872b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof qo0) {
                        ((qo0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f34872b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f34872b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof qo0) {
                        ((qo0) V).a();
                    }
                }
                while (i12 < themeActivity.f34872b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f34872b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof qo0) {
                        ((qo0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                ed1.W((ed1) p2Var);
                return;
            case 8:
                be1 be1Var = (be1) p2Var;
                org.telegram.ui.Components.tl0 tl0Var2 = be1Var.f35491a;
                if (tl0Var2 != null) {
                    int childCount3 = tl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = be1Var.f35491a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.tl0 tl0Var3 = be1Var.f35492b;
                if (tl0Var3 != null) {
                    int childCount4 = tl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = be1Var.f35492b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                be1Var.f35493c.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                be1Var.C.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21732h6, false));
                return;
            case 9:
                mf1.X((mf1) p2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) p2Var;
                org.telegram.ui.Components.tl0 tl0Var4 = usersSelectActivity.d;
                if (tl0Var4 != null) {
                    int childCount5 = tl0Var4.getChildCount();
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
}
