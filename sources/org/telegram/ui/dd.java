package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dd extends org.telegram.ui.Components.hv0 {
    public final int f37497s0;
    public boolean f37498t0;
    public final org.telegram.ui.ActionBar.o2 f37499u0;

    public dd(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.f37497s0 = i10;
        this.f37499u0 = o2Var;
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float f10;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        float f11;
        org.telegram.ui.ActionBar.l lVar5;
        int i12;
        org.telegram.ui.ActionBar.l lVar6;
        float f12;
        switch (this.f37497s0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                hd hdVar = (hd) this.f37499u0;
                measureChildWithMargins(hd.a0(hdVar), i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.f37498t0 = true;
                    hdVar.f38853c.j();
                    this.f37498t0 = false;
                }
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != hd.b0(hdVar)) {
                        org.telegram.ui.Components.au auVar = hdVar.f38853c;
                        if (auVar != null && auVar.l(childAt)) {
                            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                if (AndroidUtilities.isTablet()) {
                                    f9 = 200.0f;
                                } else {
                                    f9 = 320.0f;
                                }
                                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f9), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight), 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        }
                    }
                }
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                int paddingTop2 = size4 - getPaddingTop();
                ko koVar = (ko) this.f37499u0;
                lVar = ((org.telegram.ui.ActionBar.o2) koVar).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.f37498t0 = true;
                    koVar.v.j();
                    this.f37498t0 = false;
                }
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        lVar2 = ((org.telegram.ui.ActionBar.o2) koVar).actionBar;
                        if (childAt2 != lVar2) {
                            org.telegram.ui.Components.au auVar2 = koVar.v;
                            if (auVar2 != null && auVar2.l(childAt2)) {
                                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                                } else if (AndroidUtilities.isTablet()) {
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                                    if (AndroidUtilities.isTablet()) {
                                        f10 = 200.0f;
                                    } else {
                                        f10 = 320.0f;
                                    }
                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt2, i10, 0, i11, 0);
                            }
                        }
                    }
                }
                return;
            case 2:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                int paddingTop3 = size6 - getPaddingTop();
                t60 t60Var = (t60) this.f37499u0;
                lVar3 = ((org.telegram.ui.ActionBar.o2) t60Var).actionBar;
                measureChildWithMargins(lVar3, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    org.telegram.ui.Components.au auVar3 = t60Var.f42559c;
                    if (!auVar3.f26885e) {
                        this.f37498t0 = true;
                        auVar3.j();
                        this.f37498t0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt3 = getChildAt(i15);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        lVar4 = ((org.telegram.ui.ActionBar.o2) t60Var).actionBar;
                        if (childAt3 != lVar4) {
                            org.telegram.ui.Components.au auVar4 = t60Var.f42559c;
                            if (auVar4 != null && auVar4.l(childAt3)) {
                                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                                } else if (AndroidUtilities.isTablet()) {
                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size5, 1073741824);
                                    if (AndroidUtilities.isTablet()) {
                                        f11 = 200.0f;
                                    } else {
                                        f11 = 320.0f;
                                    }
                                    childAt3.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f11), getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight)), 1073741824));
                                } else {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt3, i10, 0, i11, 0);
                            }
                        }
                    }
                }
                return;
            default:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                int paddingTop4 = size8 - getPaddingTop();
                vu0 vu0Var = (vu0) this.f37499u0;
                lVar5 = ((org.telegram.ui.ActionBar.o2) vu0Var).actionBar;
                measureChildWithMargins(lVar5, i10, 0, i11, 0);
                int R = R();
                if (R > AndroidUtilities.dp(20.0f) && !vu0Var.L && !vu0Var.f43784x0) {
                    this.f37498t0 = true;
                    vu0Var.l0();
                    this.f37498t0 = false;
                }
                if (R <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    i12 = vu0Var.R;
                } else {
                    i12 = 0;
                }
                if (R > AndroidUtilities.dp(20.0f) && vu0Var.f43784x0) {
                    i12 = AndroidUtilities.dp(120.0f);
                }
                int i16 = i12;
                int childCount4 = getChildCount();
                for (int i17 = 0; i17 < childCount4; i17++) {
                    View childAt4 = getChildAt(i17);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        lVar6 = ((org.telegram.ui.ActionBar.o2) vu0Var).actionBar;
                        if (childAt4 != lVar6) {
                            org.telegram.ui.Components.fz fzVar = vu0Var.N;
                            if (fzVar != null && fzVar == childAt4) {
                                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                                } else if (AndroidUtilities.isTablet()) {
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size7, 1073741824);
                                    if (AndroidUtilities.isTablet()) {
                                        f12 = 200.0f;
                                    } else {
                                        f12 = 320.0f;
                                    }
                                    childAt4.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f12), getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight)), 1073741824));
                                } else {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight), 1073741824));
                                }
                            } else if (vu0Var.f43756c == childAt4) {
                                childAt4.measure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i16, 1073741824));
                            } else {
                                measureChildWithMargins(childAt4, i10, 0, i11, 0);
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f37497s0) {
            case 0:
                if (!this.f37498t0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f37498t0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f37498t0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f37498t0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
