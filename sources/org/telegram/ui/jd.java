package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jd extends org.telegram.ui.Components.vw0 {
    public final int f40561l0;
    public boolean m0;
    public final org.telegram.ui.ActionBar.r2 f40562n0;

    public jd(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.f40561l0 = i10;
        this.f40562n0 = r2Var;
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float f11;
        int i12;
        float f12;
        switch (this.f40561l0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                nd ndVar = (nd) this.f40562n0;
                measureChildWithMargins(nd.b0(ndVar), i10, 0, i11, 0);
                if (Q() > AndroidUtilities.dp(20.0f)) {
                    this.m0 = true;
                    ndVar.d.j();
                    this.m0 = false;
                }
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != nd.c0(ndVar)) {
                        org.telegram.ui.Components.ru ruVar = ndVar.d;
                        if (ruVar != null && ruVar.l(childAt)) {
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
                mo moVar = (mo) this.f40562n0;
                r5Var = ((org.telegram.ui.ActionBar.r2) moVar).simpleActionBar;
                measureChildWithMargins(r5Var, i10, 0, i11, 0);
                if (Q() > AndroidUtilities.dp(20.0f)) {
                    this.m0 = true;
                    moVar.v.j();
                    this.m0 = false;
                }
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        r5Var2 = ((org.telegram.ui.ActionBar.r2) moVar).simpleActionBar;
                        if (childAt2 != r5Var2) {
                            org.telegram.ui.Components.ru ruVar2 = moVar.v;
                            if (ruVar2 != null && ruVar2.l(childAt2)) {
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
                x60 x60Var = (x60) this.f40562n0;
                kVar = ((org.telegram.ui.ActionBar.r2) x60Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                if (Q() > AndroidUtilities.dp(20.0f)) {
                    org.telegram.ui.Components.ru ruVar3 = x60Var.f45664c;
                    if (!ruVar3.e) {
                        this.m0 = true;
                        ruVar3.j();
                        this.m0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt3 = getChildAt(i15);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        kVar2 = ((org.telegram.ui.ActionBar.r2) x60Var).actionBar;
                        if (childAt3 != kVar2) {
                            org.telegram.ui.Components.ru ruVar4 = x60Var.f45664c;
                            if (ruVar4 != null && ruVar4.l(childAt3)) {
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
                mv0 mv0Var = (mv0) this.f40562n0;
                measureChildWithMargins(mv0.a0(mv0Var), i10, 0, i11, 0);
                int Q = Q();
                if (Q > AndroidUtilities.dp(20.0f) && !mv0Var.P && !mv0Var.B0) {
                    this.m0 = true;
                    mv0Var.m0();
                    this.m0 = false;
                }
                if (Q <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    i12 = mv0Var.V;
                } else {
                    i12 = 0;
                }
                if (Q > AndroidUtilities.dp(20.0f) && mv0Var.B0) {
                    i12 = AndroidUtilities.dp(120.0f);
                }
                int i16 = i12;
                int childCount4 = getChildCount();
                for (int i17 = 0; i17 < childCount4; i17++) {
                    View childAt4 = getChildAt(i17);
                    if (childAt4 != null && childAt4.getVisibility() != 8 && childAt4 != mv0.b0(mv0Var)) {
                        org.telegram.ui.Components.sz szVar = mv0Var.R;
                        if (szVar != null && szVar == childAt4) {
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
                        } else if (mv0Var.f41676c == childAt4) {
                            childAt4.measure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i16, 1073741824));
                        } else {
                            measureChildWithMargins(childAt4, i10, 0, i11, 0);
                        }
                    }
                }
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f40561l0) {
            case 0:
                if (!this.m0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.m0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.m0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.m0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
