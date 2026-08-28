package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ed extends org.telegram.ui.Components.xu0 {
    public final int f37906s0;
    public boolean f37907t0;
    public final org.telegram.ui.ActionBar.o2 f37908u0;

    public ed(int i9, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.f37906s0 = i9;
        this.f37908u0 = o2Var;
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        float f11;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        float f12;
        org.telegram.ui.ActionBar.k kVar5;
        int i11;
        org.telegram.ui.ActionBar.k kVar6;
        float f13;
        switch (this.f37906s0) {
            case 0:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                id idVar = (id) this.f37908u0;
                measureChildWithMargins(id.Z(idVar), i9, 0, i10, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.f37907t0 = true;
                    idVar.f39105c.j();
                    this.f37907t0 = false;
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != id.a0(idVar)) {
                        org.telegram.ui.Components.ut utVar = idVar.f39105c;
                        if (utVar != null && utVar.l(childAt)) {
                            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                                if (AndroidUtilities.isTablet()) {
                                    f10 = 200.0f;
                                } else {
                                    f10 = 320.0f;
                                }
                                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight), 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt, i9, 0, i10, 0);
                        }
                    }
                }
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                int paddingTop2 = size4 - getPaddingTop();
                ho hoVar = (ho) this.f37908u0;
                kVar = ((org.telegram.ui.ActionBar.o2) hoVar).actionBar;
                measureChildWithMargins(kVar, i9, 0, i10, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.f37907t0 = true;
                    hoVar.v.j();
                    this.f37907t0 = false;
                }
                int childCount2 = getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) hoVar).actionBar;
                        if (childAt2 != kVar2) {
                            org.telegram.ui.Components.ut utVar2 = hoVar.v;
                            if (utVar2 != null && utVar2.l(childAt2)) {
                                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                                } else if (AndroidUtilities.isTablet()) {
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                                    if (AndroidUtilities.isTablet()) {
                                        f11 = 200.0f;
                                    } else {
                                        f11 = 320.0f;
                                    }
                                    childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f11), getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt2, i9, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
            case 2:
                int size5 = View.MeasureSpec.getSize(i9);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                int paddingTop3 = size6 - getPaddingTop();
                r60 r60Var = (r60) this.f37908u0;
                kVar3 = ((org.telegram.ui.ActionBar.o2) r60Var).actionBar;
                measureChildWithMargins(kVar3, i9, 0, i10, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    org.telegram.ui.Components.ut utVar3 = r60Var.f42279c;
                    if (!utVar3.f33124e) {
                        this.f37907t0 = true;
                        utVar3.j();
                        this.f37907t0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt3 = getChildAt(i14);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        kVar4 = ((org.telegram.ui.ActionBar.o2) r60Var).actionBar;
                        if (childAt3 != kVar4) {
                            org.telegram.ui.Components.ut utVar4 = r60Var.f42279c;
                            if (utVar4 != null && utVar4.l(childAt3)) {
                                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                                } else if (AndroidUtilities.isTablet()) {
                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size5, 1073741824);
                                    if (AndroidUtilities.isTablet()) {
                                        f12 = 200.0f;
                                    } else {
                                        f12 = 320.0f;
                                    }
                                    childAt3.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f12), getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight)), 1073741824));
                                } else {
                                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight), 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt3, i9, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
            default:
                int size7 = View.MeasureSpec.getSize(i9);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                int paddingTop4 = size8 - getPaddingTop();
                xu0 xu0Var = (xu0) this.f37908u0;
                kVar5 = ((org.telegram.ui.ActionBar.o2) xu0Var).actionBar;
                measureChildWithMargins(kVar5, i9, 0, i10, 0);
                int R = R();
                if (R > AndroidUtilities.dp(20.0f) && !xu0Var.L && !xu0Var.f44639x0) {
                    this.f37907t0 = true;
                    xu0Var.k0();
                    this.f37907t0 = false;
                }
                if (R <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    i11 = xu0Var.R;
                } else {
                    i11 = 0;
                }
                if (R > AndroidUtilities.dp(20.0f) && xu0Var.f44639x0) {
                    i11 = AndroidUtilities.dp(120.0f);
                }
                int i15 = i11;
                int childCount4 = getChildCount();
                for (int i16 = 0; i16 < childCount4; i16++) {
                    View childAt4 = getChildAt(i16);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        kVar6 = ((org.telegram.ui.ActionBar.o2) xu0Var).actionBar;
                        if (childAt4 != kVar6) {
                            org.telegram.ui.Components.wy wyVar = xu0Var.N;
                            if (wyVar != null && wyVar == childAt4) {
                                if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                                } else if (AndroidUtilities.isTablet()) {
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size7, 1073741824);
                                    if (AndroidUtilities.isTablet()) {
                                        f13 = 200.0f;
                                    } else {
                                        f13 = 320.0f;
                                    }
                                    childAt4.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f13), getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight)), 1073741824));
                                } else {
                                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight), 1073741824));
                                }
                            } else if (xu0Var.f44611c == childAt4) {
                                childAt4.measure(i9, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i15, 1073741824));
                            } else {
                                measureChildWithMargins(childAt4, i9, 0, i10, 0);
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f37906s0) {
            case 0:
                if (!this.f37907t0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f37907t0) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f37907t0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f37907t0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
