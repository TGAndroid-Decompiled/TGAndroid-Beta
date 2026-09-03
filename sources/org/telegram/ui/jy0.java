package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jy0 implements org.telegram.ui.ActionBar.k6 {
    public final int f35388a;
    public final org.telegram.ui.ActionBar.p2 f35389b;

    public jy0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f35388a = i10;
        this.f35389b = p2Var;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f35388a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f35388a;
        int i12 = 0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f35389b;
        switch (i11) {
            case 0:
                ProfileActivity.V((ProfileActivity) p2Var);
                return;
            case 1:
                l11 l11Var = (l11) p2Var;
                org.telegram.ui.Components.rl0 rl0Var = l11Var.f35618a;
                if (rl0Var != null) {
                    int childCount = rl0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = l11Var.f35618a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ta) {
                            ((org.telegram.ui.Cells.ta) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                d21 d21Var = (d21) p2Var;
                if (d21Var.h != null && ((valueAnimator = d21Var.D) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.z9 z9Var = d21Var.h;
                    if (d21Var.C) {
                        i10 = org.telegram.ui.ActionBar.j6.f20115q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20273z6;
                    }
                    z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                }
                if (d21Var.f33303a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f33303a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20006k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20024l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
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
                u21Var.setNavigationBarColor(u21Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7));
                return;
            case 4:
                b31 b31Var = (b31) p2Var;
                b31Var.f32723a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
                b31Var.f32725c.l();
                return;
            case 5:
                oa1 oa1Var = (oa1) p2Var;
                p91 p91Var = oa1Var.P;
                if (p91Var != null) {
                    int childCount2 = p91Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        oa1.l0(oa1Var.P.getChildAt(i14));
                    }
                    int hiddenChildCount = oa1Var.P.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        oa1.l0(oa1Var.P.V(i15));
                    }
                    int cachedChildCount = oa1Var.P.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        oa1.l0(oa1Var.P.P(i16));
                    }
                    int attachedScrapChildCount = oa1Var.P.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        oa1.l0(oa1Var.P.O(i12));
                        i12++;
                    }
                    oa1Var.P.getRecycledViewPool().a();
                }
                vf.f fVar = oa1Var.X;
                if (fVar != null) {
                    fVar.f45763g = true;
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) p2Var;
                for (int i17 = 0; i17 < themeActivity.f32307b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f32307b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof so0) {
                        ((so0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f32307b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f32307b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof so0) {
                        ((so0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f32307b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f32307b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof so0) {
                        ((so0) V).a();
                    }
                }
                while (i12 < themeActivity.f32307b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f32307b.O(i12);
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
                ge1 ge1Var = (ge1) p2Var;
                org.telegram.ui.Components.rl0 rl0Var2 = ge1Var.f34427a;
                if (rl0Var2 != null) {
                    int childCount3 = rl0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = ge1Var.f34427a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.rl0 rl0Var3 = ge1Var.f34428b;
                if (rl0Var3 != null) {
                    int childCount4 = rl0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = ge1Var.f34428b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                ge1Var.f34429c.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                ge1Var.C.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19953h6, false));
                return;
            case 9:
                sf1.X((sf1) p2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) p2Var;
                org.telegram.ui.Components.rl0 rl0Var4 = usersSelectActivity.d;
                if (rl0Var4 != null) {
                    int childCount5 = rl0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount5; i22++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i22);
                        if (childAt5 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt5).f(0);
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
