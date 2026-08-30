package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cy0 implements org.telegram.ui.ActionBar.k6 {
    public final int f33450a;
    public final org.telegram.ui.ActionBar.p2 f33451b;

    public cy0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f33450a = i10;
        this.f33451b = p2Var;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f33450a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f33450a;
        int i12 = 0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f33451b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) p2Var);
                return;
            case 1:
                e11 e11Var = (e11) p2Var;
                org.telegram.ui.Components.sl0 sl0Var = e11Var.f33851a;
                if (sl0Var != null) {
                    int childCount = sl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = e11Var.f33851a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                w11 w11Var = (w11) p2Var;
                if (w11Var.h != null && ((valueAnimator = w11Var.E) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.aa aaVar = w11Var.h;
                    if (w11Var.D) {
                        i10 = org.telegram.ui.ActionBar.j6.f20140q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20298z6;
                    }
                    aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                }
                if (w11Var.f39299a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = w11Var.f39299a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20031k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20049l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
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
                m21 m21Var = (m21) p2Var;
                m21Var.getClass();
                m21Var.setNavigationBarColor(m21Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
                return;
            case 4:
                u21 u21Var = (u21) p2Var;
                u21Var.f38829a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
                u21Var.f38831c.l();
                return;
            case 5:
                ga1 ga1Var = (ga1) p2Var;
                h91 h91Var = ga1Var.P;
                if (h91Var != null) {
                    int childCount2 = h91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        ga1.l0(ga1Var.P.getChildAt(i14));
                    }
                    int hiddenChildCount = ga1Var.P.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        ga1.l0(ga1Var.P.V(i15));
                    }
                    int cachedChildCount = ga1Var.P.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        ga1.l0(ga1Var.P.P(i16));
                    }
                    int attachedScrapChildCount = ga1Var.P.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        ga1.l0(ga1Var.P.O(i12));
                        i12++;
                    }
                    ga1Var.P.getRecycledViewPool().a();
                }
                vf.f fVar = ga1Var.X;
                if (fVar != null) {
                    fVar.f45685g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) p2Var;
                for (int i17 = 0; i17 < themeActivity.f32333b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f32333b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof oo0) {
                        ((oo0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f32333b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f32333b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof oo0) {
                        ((oo0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f32333b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f32333b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof oo0) {
                        ((oo0) V).a();
                    }
                }
                while (i12 < themeActivity.f32333b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f32333b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof oo0) {
                        ((oo0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                cd1.W((cd1) p2Var);
                return;
            case 8:
                yd1 yd1Var = (yd1) p2Var;
                org.telegram.ui.Components.sl0 sl0Var2 = yd1Var.f40492a;
                if (sl0Var2 != null) {
                    int childCount3 = sl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = yd1Var.f40492a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.sl0 sl0Var3 = yd1Var.f40493b;
                if (sl0Var3 != null) {
                    int childCount4 = sl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = yd1Var.f40493b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                yd1Var.f40494c.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                yd1Var.C.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19978h6, false));
                return;
            case 9:
                kf1.X((kf1) p2Var);
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
