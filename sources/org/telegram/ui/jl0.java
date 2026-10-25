package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jl0 extends org.telegram.ui.Components.vw0 {
    public final int f40681l0;
    public final FrameLayout m0;
    public final org.telegram.ui.ActionBar.r2 f40682n0;

    public jl0(org.telegram.ui.ActionBar.r2 r2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f40681l0 = i10;
        this.f40682n0 = r2Var;
        this.m0 = frameLayout;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        org.telegram.ui.ActionBar.r5 r5Var;
        int measuredHeight2;
        switch (this.f40681l0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40682n0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.m0;
                if (visibility != 8 && Q() >= AndroidUtilities.dp(20.0f)) {
                    if (passcodeActivity.m0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = Q() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.v.getVisibility() != 8) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                r5Var = ((org.telegram.ui.ActionBar.r2) passcodeActivity).simpleActionBar;
                View view = r5Var != null ? ((org.telegram.ui.ActionBar.r2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.r2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.v.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                R();
                return;
            default:
                k0 k0Var = (k0) this.m0;
                dg1 dg1Var = (dg1) this.f40682n0;
                if (dg1Var.f38869e0.getVisibility() != 8 && Q() >= AndroidUtilities.dp(20.0f)) {
                    if (dg1Var.w0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        k0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        k0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (dg1Var.f38869e0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    k0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    k0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                dg1Var.f38869e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.r5 r5Var;
        switch (this.f40681l0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40682n0;
                if (passcodeActivity.v.getVisibility() != 8 && Q() < AndroidUtilities.dp(20.0f)) {
                    i12 = size2 - AndroidUtilities.dp(230.0f);
                } else {
                    i12 = size2;
                }
                this.m0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                r5Var = ((org.telegram.ui.ActionBar.r2) passcodeActivity).simpleActionBar;
                View view = r5Var != null ? ((org.telegram.ui.ActionBar.r2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.r2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    return;
                }
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                dg1 dg1Var = (dg1) this.f40682n0;
                if (dg1Var.f38869e0.getVisibility() != 8 && Q() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((k0) this.m0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                dg1Var.f38869e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
