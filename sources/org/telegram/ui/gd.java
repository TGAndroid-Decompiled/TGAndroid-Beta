package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class gd extends org.telegram.ui.Components.vu0 {
    public final int f37453f0;
    public boolean f37454g0;
    public final org.telegram.ui.ActionBar.k2 f37455h0;

    public gd(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null);
        this.f37453f0 = i10;
        this.f37455h0 = k2Var;
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gd.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        float f11;
        int i12;
        float f12;
        switch (this.f37453f0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                kd kdVar = (kd) this.f37455h0;
                measureChildWithMargins(kd.f0(kdVar), i10, 0, i11, 0);
                if (Q() > org.telegram.messenger.i0.L(20.0f)) {
                    this.f37454g0 = true;
                    kdVar.d.j();
                    this.f37454g0 = false;
                }
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != kd.g0(kdVar)) {
                        org.telegram.ui.Components.wt wtVar = kdVar.d;
                        if (wtVar != null && wtVar.l(childAt)) {
                            if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (org.telegram.messenger.i0.Q1()) {
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                if (org.telegram.messenger.i0.Q1()) {
                                    f7 = 200.0f;
                                } else {
                                    f7 = 320.0f;
                                }
                                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(f7), getPaddingTop() + (paddingTop - org.telegram.messenger.i0.f16166m)), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - org.telegram.messenger.i0.f16166m), 1073741824));
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
                oo ooVar = (oo) this.f37455h0;
                i5Var = ((org.telegram.ui.ActionBar.k2) ooVar).simpleActionBar;
                measureChildWithMargins(i5Var, i10, 0, i11, 0);
                if (Q() > org.telegram.messenger.i0.L(20.0f)) {
                    this.f37454g0 = true;
                    ooVar.f40231w.j();
                    this.f37454g0 = false;
                }
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        i5Var2 = ((org.telegram.ui.ActionBar.k2) ooVar).simpleActionBar;
                        if (childAt2 != i5Var2) {
                            org.telegram.ui.Components.wt wtVar2 = ooVar.f40231w;
                            if (wtVar2 != null && wtVar2.l(childAt2)) {
                                if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.i0.Q1()) {
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                                    if (org.telegram.messenger.i0.Q1()) {
                                        f10 = 200.0f;
                                    } else {
                                        f10 = 320.0f;
                                    }
                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(f10), getPaddingTop() + (paddingTop2 - org.telegram.messenger.i0.f16166m)), 1073741824));
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - org.telegram.messenger.i0.f16166m), 1073741824));
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
                b60 b60Var = (b60) this.f37455h0;
                lVar = ((org.telegram.ui.ActionBar.k2) b60Var).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                if (Q() > org.telegram.messenger.i0.L(20.0f)) {
                    org.telegram.ui.Components.wt wtVar3 = b60Var.f35955c;
                    if (!wtVar3.e) {
                        this.f37454g0 = true;
                        wtVar3.j();
                        this.f37454g0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    View childAt3 = getChildAt(i15);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) b60Var).actionBar;
                        if (childAt3 != lVar2) {
                            org.telegram.ui.Components.wt wtVar4 = b60Var.f35955c;
                            if (wtVar4 != null && wtVar4.l(childAt3)) {
                                if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                                } else if (org.telegram.messenger.i0.Q1()) {
                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size5, 1073741824);
                                    if (org.telegram.messenger.i0.Q1()) {
                                        f11 = 200.0f;
                                    } else {
                                        f11 = 320.0f;
                                    }
                                    childAt3.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(f11), getPaddingTop() + (paddingTop3 - org.telegram.messenger.i0.f16166m)), 1073741824));
                                } else {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - org.telegram.messenger.i0.f16166m), 1073741824));
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
                zs0 zs0Var = (zs0) this.f37455h0;
                measureChildWithMargins(zs0.e0(zs0Var), i10, 0, i11, 0);
                int Q = Q();
                if (Q > org.telegram.messenger.i0.L(20.0f) && !zs0Var.P && !zs0Var.B0) {
                    this.f37454g0 = true;
                    zs0Var.q0();
                    this.f37454g0 = false;
                }
                if (Q <= org.telegram.messenger.i0.L(20.0f) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                    i12 = zs0Var.V;
                } else {
                    i12 = 0;
                }
                if (Q > org.telegram.messenger.i0.L(20.0f) && zs0Var.B0) {
                    i12 = org.telegram.messenger.i0.L(120.0f);
                }
                int i16 = i12;
                int childCount4 = getChildCount();
                for (int i17 = 0; i17 < childCount4; i17++) {
                    View childAt4 = getChildAt(i17);
                    if (childAt4 != null && childAt4.getVisibility() != 8 && childAt4 != zs0.f0(zs0Var)) {
                        org.telegram.ui.Components.vy vyVar = zs0Var.R;
                        if (vyVar != null && vyVar == childAt4) {
                            if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                            } else if (org.telegram.messenger.i0.Q1()) {
                                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size7, 1073741824);
                                if (org.telegram.messenger.i0.Q1()) {
                                    f12 = 200.0f;
                                } else {
                                    f12 = 320.0f;
                                }
                                childAt4.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(f12), getPaddingTop() + (paddingTop4 - org.telegram.messenger.i0.f16166m)), 1073741824));
                            } else {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - org.telegram.messenger.i0.f16166m), 1073741824));
                            }
                        } else if (zs0Var.f44056c == childAt4) {
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
        switch (this.f37453f0) {
            case 0:
                if (!this.f37454g0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f37454g0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f37454g0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f37454g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
