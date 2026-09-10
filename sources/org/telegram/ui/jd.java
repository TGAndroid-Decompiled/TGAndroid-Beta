package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jd extends org.telegram.ui.Components.aw0 {
    public final int f34075w0;
    public boolean f34076x0;
    public final org.telegram.ui.ActionBar.p2 f34077y0;

    public jd(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        this.f34075w0 = i10;
        this.f34077y0 = p2Var;
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
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
        switch (this.f34075w0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                nd ndVar = (nd) this.f34077y0;
                measureChildWithMargins(nd.a0(ndVar), i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.f34076x0 = true;
                    ndVar.f35222c.j();
                    this.f34076x0 = false;
                }
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != nd.b0(ndVar)) {
                        org.telegram.ui.Components.nu nuVar = ndVar.f35222c;
                        if (nuVar != null && nuVar.l(childAt)) {
                            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                if (AndroidUtilities.isTablet()) {
                                    f7 = 200.0f;
                                } else {
                                    f7 = 320.0f;
                                }
                                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f7), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), 1073741824));
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
                yo yoVar = (yo) this.f34077y0;
                lVar = ((org.telegram.ui.ActionBar.p2) yoVar).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.f34076x0 = true;
                    yoVar.v.j();
                    this.f34076x0 = false;
                }
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        lVar2 = ((org.telegram.ui.ActionBar.p2) yoVar).actionBar;
                        if (childAt2 != lVar2) {
                            org.telegram.ui.Components.nu nuVar2 = yoVar.v;
                            if (nuVar2 != null && nuVar2.l(childAt2)) {
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
                k70 k70Var = (k70) this.f34077y0;
                lVar3 = ((org.telegram.ui.ActionBar.p2) k70Var).actionBar;
                measureChildWithMargins(lVar3, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    org.telegram.ui.Components.nu nuVar3 = k70Var.f34249c;
                    if (!nuVar3.e) {
                        this.f34076x0 = true;
                        nuVar3.j();
                        this.f34076x0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt3 = getChildAt(i15);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        lVar4 = ((org.telegram.ui.ActionBar.p2) k70Var).actionBar;
                        if (childAt3 != lVar4) {
                            org.telegram.ui.Components.nu nuVar4 = k70Var.f34249c;
                            if (nuVar4 != null && nuVar4.l(childAt3)) {
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
                bw0 bw0Var = (bw0) this.f34077y0;
                lVar5 = ((org.telegram.ui.ActionBar.p2) bw0Var).actionBar;
                measureChildWithMargins(lVar5, i10, 0, i11, 0);
                int R = R();
                if (R > AndroidUtilities.dp(20.0f) && !bw0Var.P && !bw0Var.B0) {
                    this.f34076x0 = true;
                    bw0Var.l0();
                    this.f34076x0 = false;
                }
                if (R <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    i12 = bw0Var.V;
                } else {
                    i12 = 0;
                }
                if (R > AndroidUtilities.dp(20.0f) && bw0Var.B0) {
                    i12 = AndroidUtilities.dp(120.0f);
                }
                int i16 = i12;
                int childCount4 = getChildCount();
                for (int i17 = 0; i17 < childCount4; i17++) {
                    View childAt4 = getChildAt(i17);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        lVar6 = ((org.telegram.ui.ActionBar.p2) bw0Var).actionBar;
                        if (childAt4 != lVar6) {
                            org.telegram.ui.Components.rz rzVar = bw0Var.R;
                            if (rzVar != null && rzVar == childAt4) {
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
                            } else if (bw0Var.f31428c == childAt4) {
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
        switch (this.f34075w0) {
            case 0:
                if (!this.f34076x0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f34076x0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f34076x0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f34076x0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
