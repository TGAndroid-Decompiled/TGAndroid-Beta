package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class oj0 extends org.telegram.ui.Components.uu0 {
    public final int f40279f0;
    public final FrameLayout f40280g0;
    public final org.telegram.ui.ActionBar.k2 f40281h0;

    public oj0(org.telegram.ui.ActionBar.k2 k2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f40279f0 = i10;
        this.f40281h0 = k2Var;
        this.f40280g0 = frameLayout;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        org.telegram.ui.ActionBar.i5 i5Var;
        int measuredHeight2;
        switch (this.f40279f0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40281h0;
                int visibility = passcodeActivity.f33424w.getVisibility();
                FrameLayout frameLayout = this.f40280g0;
                if (visibility != 8 && Q() >= org.telegram.messenger.i0.L(20.0f)) {
                    if (passcodeActivity.p0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = Q() + (getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f));
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.f33424w.getVisibility() != 8) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f);
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                i5Var = ((org.telegram.ui.ActionBar.k2) passcodeActivity).simpleActionBar;
                View view = i5Var != null ? ((org.telegram.ui.ActionBar.k2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.k2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.f33424w.layout(0, measuredHeight, getMeasuredWidth(), org.telegram.messenger.i0.L(230.0f) + measuredHeight);
                R();
                return;
            default:
                uc1 uc1Var = (uc1) this.f40280g0;
                tc1 tc1Var = (tc1) this.f40281h0;
                if (tc1Var.f41801e0.getVisibility() != 8 && Q() >= org.telegram.messenger.i0.L(20.0f)) {
                    if (tc1Var.z0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f));
                        uc1Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        uc1Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (tc1Var.f41801e0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f);
                    uc1Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    uc1Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                tc1Var.f41801e0.layout(0, measuredHeight2, getMeasuredWidth(), org.telegram.messenger.i0.L(230.0f) + measuredHeight2);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.i5 i5Var;
        switch (this.f40279f0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40281h0;
                if (passcodeActivity.f33424w.getVisibility() != 8 && Q() < org.telegram.messenger.i0.L(20.0f)) {
                    i12 = size2 - org.telegram.messenger.i0.L(230.0f);
                } else {
                    i12 = size2;
                }
                this.f40280g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                passcodeActivity.f33424w.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(230.0f), 1073741824));
                i5Var = ((org.telegram.ui.ActionBar.k2) passcodeActivity).simpleActionBar;
                View view = i5Var != null ? ((org.telegram.ui.ActionBar.k2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.k2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    return;
                }
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                tc1 tc1Var = (tc1) this.f40281h0;
                if (tc1Var.f41801e0.getVisibility() != 8 && Q() < org.telegram.messenger.i0.L(20.0f)) {
                    size4 -= org.telegram.messenger.i0.L(230.0f);
                }
                ((uc1) this.f40280g0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                tc1Var.f41801e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(230.0f), 1073741824));
                return;
        }
    }
}
