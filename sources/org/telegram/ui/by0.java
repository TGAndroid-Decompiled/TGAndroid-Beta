package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class by0 implements org.telegram.ui.ActionBar.i6 {
    public final int f35776a;
    public final org.telegram.ui.ActionBar.n2 f35777b;

    public by0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35776a = i10;
        this.f35777b = n2Var;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f35776a;
    }

    @Override
    public final void b() {
        ValueAnimator valueAnimator;
        int i10;
        int i11 = this.f35776a;
        int i12 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f35777b;
        switch (i11) {
            case 0:
                ProfileActivity.n0((ProfileActivity) n2Var);
                return;
            case 1:
                b11 b11Var = (b11) n2Var;
                org.telegram.ui.Components.im0 im0Var = b11Var.f35553a;
                if (im0Var != null) {
                    int childCount = im0Var.getChildCount();
                    while (i12 < childCount) {
                        View childAt = b11Var.f35553a.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i12++;
                    }
                    return;
                }
                return;
            case 2:
                u11 u11Var = (u11) n2Var;
                if (u11Var.h != null && ((valueAnimator = u11Var.G) == null || !valueAnimator.isRunning())) {
                    org.telegram.ui.Cells.ba baVar = u11Var.h;
                    if (u11Var.F) {
                        i10 = org.telegram.ui.ActionBar.h6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21398z6;
                    }
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                }
                if (u11Var.f41873a != null) {
                    int i13 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = u11Var.f41873a;
                        if (i13 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i13].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21120k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21137l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21214p7, false));
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
                b21 b21Var = (b21) n2Var;
                b21Var.f35575a.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
                b21Var.f35577c.l();
                return;
            case 4:
                r91 r91Var = (r91) n2Var;
                s81 s81Var = r91Var.S;
                if (s81Var != null) {
                    int childCount2 = s81Var.getChildCount();
                    for (int i14 = 0; i14 < childCount2; i14++) {
                        r91.l0(r91Var.S.getChildAt(i14));
                    }
                    int hiddenChildCount = r91Var.S.getHiddenChildCount();
                    for (int i15 = 0; i15 < hiddenChildCount; i15++) {
                        r91.l0(r91Var.S.V(i15));
                    }
                    int cachedChildCount = r91Var.S.getCachedChildCount();
                    for (int i16 = 0; i16 < cachedChildCount; i16++) {
                        r91.l0(r91Var.S.P(i16));
                    }
                    int attachedScrapChildCount = r91Var.S.getAttachedScrapChildCount();
                    while (i12 < attachedScrapChildCount) {
                        r91.l0(r91Var.S.O(i12));
                        i12++;
                    }
                    r91Var.S.getRecycledViewPool().a();
                }
                jg.f fVar = r91Var.f40663a0;
                if (fVar != null) {
                    fVar.f14427a = true;
                    return;
                }
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i17 = 0; i17 < themeActivity.f33891b.getChildCount(); i17++) {
                    View childAt2 = themeActivity.f33891b.getChildAt(i17);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof po0) {
                        ((po0) childAt2).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.f33891b.getCachedChildCount(); i18++) {
                    View P = themeActivity.f33891b.P(i18);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof po0) {
                        ((po0) P).a();
                    }
                }
                for (int i19 = 0; i19 < themeActivity.f33891b.getHiddenChildCount(); i19++) {
                    View V = themeActivity.f33891b.V(i19);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof po0) {
                        ((po0) V).a();
                    }
                }
                while (i12 < themeActivity.f33891b.getAttachedScrapChildCount()) {
                    View O = themeActivity.f33891b.O(i12);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof po0) {
                        ((po0) O).a();
                    }
                    i12++;
                }
                return;
            case 6:
                mc1.X((mc1) n2Var);
                return;
            case 7:
                id1 id1Var = (id1) n2Var;
                org.telegram.ui.Components.im0 im0Var2 = id1Var.f37866a;
                if (im0Var2 != null) {
                    int childCount3 = im0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount3; i20++) {
                        View childAt3 = id1Var.f37866a.getChildAt(i20);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.im0 im0Var3 = id1Var.f37867b;
                if (im0Var3 != null) {
                    int childCount4 = im0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount4; i21++) {
                        View childAt4 = id1Var.f37867b.getChildAt(i21);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                id1Var.f37868c.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                id1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065h6, false));
                return;
            case 8:
                te1.X((te1) n2Var);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.im0 im0Var4 = usersSelectActivity.d;
                if (im0Var4 != null) {
                    int childCount5 = im0Var4.getChildCount();
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
}
