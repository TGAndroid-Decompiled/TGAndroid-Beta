package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jy0 implements org.telegram.ui.ActionBar.l6 {
    public final int f38140a;
    public final org.telegram.ui.ActionBar.p2 f38141b;

    public jy0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f38140a = i10;
        this.f38141b = p2Var;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f38140a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f38140a;
        int i12 = 0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f38141b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) p2Var);
                return;
            case 1:
                k11 k11Var = (k11) p2Var;
                org.telegram.ui.Components.sl0 sl0Var = k11Var.f38159a;
                if (sl0Var != null) {
                    int childCount = sl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = k11Var.f38159a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                d21 d21Var = (d21) p2Var;
                if (d21Var.h != null && ((valueAnimator = d21Var.D) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.aa aaVar = d21Var.h;
                    if (d21Var.C) {
                        i10 = org.telegram.ui.ActionBar.k6.f21896q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f22055z6;
                    }
                    aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                }
                if (d21Var.f35946a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f35946a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21787k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21805l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21878p7, false));
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
                u21 u21Var = (u21) p2Var;
                u21Var.getClass();
                u21Var.setNavigationBarColor(u21Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7));
                return;
            case 4:
                b31 b31Var = (b31) p2Var;
                b31Var.f35336a.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
                b31Var.f35338c.l();
                return;
            case 5:
                na1 na1Var = (na1) p2Var;
                o91 o91Var = na1Var.P;
                if (o91Var != null) {
                    int childCount2 = o91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        na1.l0(na1Var.P.getChildAt(i14));
                    }
                    int hiddenChildCount = na1Var.P.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        na1.l0(na1Var.P.V(i15));
                    }
                    int cachedChildCount = na1Var.P.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        na1.l0(na1Var.P.P(i16));
                    }
                    int attachedScrapChildCount = na1Var.P.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        na1.l0(na1Var.P.O(i12));
                        i12++;
                    }
                    na1Var.P.getRecycledViewPool().a();
                }
                wf.f fVar = na1Var.X;
                if (fVar != null) {
                    fVar.f49559g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) p2Var;
                for (int i17 = 0; i17 < themeActivity.f34872b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f34872b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof so0) {
                        ((so0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f34872b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f34872b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof so0) {
                        ((so0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f34872b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f34872b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof so0) {
                        ((so0) V).a();
                    }
                }
                while (i12 < themeActivity.f34872b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f34872b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof so0) {
                        ((so0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                jd1.W((jd1) p2Var);
                return;
            case 8:
                he1 he1Var = (he1) p2Var;
                org.telegram.ui.Components.sl0 sl0Var2 = he1Var.f37354a;
                if (sl0Var2 != null) {
                    int childCount3 = sl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = he1Var.f37354a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.sl0 sl0Var3 = he1Var.f37355b;
                if (sl0Var3 != null) {
                    int childCount4 = sl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = he1Var.f37355b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                he1Var.f37356c.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                he1Var.C.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21734h6, false));
                return;
            case 9:
                sf1.X((sf1) p2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) p2Var;
                org.telegram.ui.Components.sl0 sl0Var4 = usersSelectActivity.d;
                if (sl0Var4 != null) {
                    int childCount5 = sl0Var4.getChildCount();
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
