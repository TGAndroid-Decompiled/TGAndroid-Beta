package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class mj0 extends org.telegram.ui.Components.vu0 {
    public final int f39544f0;
    public final FrameLayout f39545g0;
    public final org.telegram.ui.ActionBar.k2 f39546h0;

    public mj0(org.telegram.ui.ActionBar.k2 k2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f39544f0 = i10;
        this.f39546h0 = k2Var;
        this.f39545g0 = frameLayout;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        org.telegram.ui.ActionBar.i5 i5Var;
        int measuredHeight2;
        switch (this.f39544f0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39546h0;
                int visibility = passcodeActivity.f33431w.getVisibility();
                FrameLayout frameLayout = this.f39545g0;
                if (visibility != 8 && Q() >= org.telegram.messenger.i0.L(20.0f)) {
                    if (passcodeActivity.q0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = Q() + (getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f));
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.f33431w.getVisibility() != 8) {
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
                passcodeActivity.f33431w.layout(0, measuredHeight, getMeasuredWidth(), org.telegram.messenger.i0.L(230.0f) + measuredHeight);
                R();
                return;
            default:
                sc1 sc1Var = (sc1) this.f39545g0;
                rc1 rc1Var = (rc1) this.f39546h0;
                if (rc1Var.f41044e0.getVisibility() != 8 && Q() >= org.telegram.messenger.i0.L(20.0f)) {
                    if (rc1Var.A0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f));
                        sc1Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        sc1Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (rc1Var.f41044e0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.i0.L(230.0f);
                    sc1Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    sc1Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                rc1Var.f41044e0.layout(0, measuredHeight2, getMeasuredWidth(), org.telegram.messenger.i0.L(230.0f) + measuredHeight2);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.i5 i5Var;
        switch (this.f39544f0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39546h0;
                if (passcodeActivity.f33431w.getVisibility() != 8 && Q() < org.telegram.messenger.i0.L(20.0f)) {
                    i12 = size2 - org.telegram.messenger.i0.L(230.0f);
                } else {
                    i12 = size2;
                }
                this.f39545g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                passcodeActivity.f33431w.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(230.0f), 1073741824));
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
                rc1 rc1Var = (rc1) this.f39546h0;
                if (rc1Var.f41044e0.getVisibility() != 8 && Q() < org.telegram.messenger.i0.L(20.0f)) {
                    size4 -= org.telegram.messenger.i0.L(230.0f);
                }
                ((sc1) this.f39545g0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                rc1Var.f41044e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(230.0f), 1073741824));
                return;
        }
    }
}
