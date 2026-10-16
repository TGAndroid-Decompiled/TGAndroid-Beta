package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cz0 implements org.telegram.ui.ActionBar.h6 {
    public final int f34814a;
    public final org.telegram.ui.ActionBar.m2 f34815b;

    public cz0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f34814a = i10;
        this.f34815b = m2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f34814a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f34814a;
        int i12 = 0;
        org.telegram.ui.ActionBar.m2 m2Var = this.f34815b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) m2Var);
                return;
            case 1:
                c21 c21Var = (c21) m2Var;
                org.telegram.ui.Components.mm0 mm0Var = c21Var.f34428a;
                if (mm0Var != null) {
                    int childCount = mm0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = c21Var.f34428a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                v21 v21Var = (v21) m2Var;
                if (v21Var.h != null && ((valueAnimator = v21Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ca caVar = v21Var.h;
                    if (v21Var.F) {
                        i10 = org.telegram.ui.ActionBar.g6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f20005z6;
                    }
                    caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
                }
                if (v21Var.f40556a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = v21Var.f40556a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19728k6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19745l6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19822p7, false));
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
                l31 l31Var = (l31) m2Var;
                l31Var.getClass();
                l31Var.setNavigationBarColor(l31Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7));
                return;
            case 4:
                s31 s31Var = (s31) m2Var;
                s31Var.f39690a.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
                s31Var.f39692c.l();
                return;
            case 5:
                hb1 hb1Var = (hb1) m2Var;
                ia1 ia1Var = hb1Var.S;
                if (ia1Var != null) {
                    int childCount2 = ia1Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        hb1.l0(hb1Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = hb1Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        hb1.l0(hb1Var.S.V(i15));
                    }
                    int cachedChildCount = hb1Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        hb1.l0(hb1Var.S.P(i16));
                    }
                    int attachedScrapChildCount = hb1Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        hb1.l0(hb1Var.S.O(i12));
                        i12++;
                    }
                    hb1Var.S.getRecycledViewPool().a();
                }
                jg.f fVar = hb1Var.f36476a0;
                if (fVar != null) {
                    fVar.f13013a = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) m2Var;
                for (int i17 = 0; i17 < themeActivity.f32544b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f32544b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof jp0) {
                        ((jp0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f32544b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f32544b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof jp0) {
                        ((jp0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f32544b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f32544b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof jp0) {
                        ((jp0) V).a();
                    }
                }
                while (i12 < themeActivity.f32544b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f32544b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof jp0) {
                        ((jp0) O).a();
                    }
                    i12++;
                }
                return;
            case 7:
                ce1.X((ce1) m2Var);
                return;
            case 8:
                ze1 ze1Var = (ze1) m2Var;
                org.telegram.ui.Components.mm0 mm0Var2 = ze1Var.f42292a;
                if (mm0Var2 != null) {
                    int childCount3 = mm0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = ze1Var.f42292a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.mm0 mm0Var3 = ze1Var.f42293b;
                if (mm0Var3 != null) {
                    int childCount4 = mm0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = ze1Var.f42293b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                ze1Var.f42294c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                ze1Var.F.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19673h6, false));
                return;
            case 9:
                kg1.X((kg1) m2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) m2Var;
                org.telegram.ui.Components.mm0 mm0Var4 = usersSelectActivity.d;
                if (mm0Var4 != null) {
                    int childCount5 = mm0Var4.getChildCount();
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
