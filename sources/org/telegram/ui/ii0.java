package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class ii0 extends org.telegram.ui.Components.st0 {
    public final int f48060g0;
    public final FrameLayout f48061h0;
    public final org.telegram.ui.ActionBar.e2 f48062i0;

    public ii0(org.telegram.ui.ActionBar.e2 e2Var, Context context, FrameLayout frameLayout, int i7) {
        super(context, null);
        this.f48060g0 = i7;
        this.f48062i0 = e2Var;
        this.f48061h0 = frameLayout;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredHeight;
        org.telegram.ui.ActionBar.w4 w4Var;
        int measuredHeight2;
        switch (this.f48060g0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48062i0;
                int visibility = passcodeActivity.f42701w.getVisibility();
                FrameLayout frameLayout = this.f48061h0;
                if (visibility != 8 && Q() >= org.telegram.messenger.g0.L(20.0f)) {
                    if (passcodeActivity.q0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = Q() + (getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f));
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.f42701w.getVisibility() != 8) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f);
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                w4Var = ((org.telegram.ui.ActionBar.e2) passcodeActivity).simpleActionBar;
                View view = w4Var != null ? ((org.telegram.ui.ActionBar.e2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.e2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.f42701w.layout(0, measuredHeight, getMeasuredWidth(), org.telegram.messenger.g0.L(230.0f) + measuredHeight);
                R();
                return;
            default:
                k0 k0Var = (k0) this.f48061h0;
                xa1 xa1Var = (xa1) this.f48062i0;
                if (xa1Var.f53149f0.getVisibility() != 8 && Q() >= org.telegram.messenger.g0.L(20.0f)) {
                    if (xa1Var.A0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f));
                        k0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        k0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (xa1Var.f53149f0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f);
                    k0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    k0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                xa1Var.f53149f0.layout(0, measuredHeight2, getMeasuredWidth(), org.telegram.messenger.g0.L(230.0f) + measuredHeight2);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.w4 w4Var;
        switch (this.f48060g0) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f48062i0;
                if (passcodeActivity.f42701w.getVisibility() != 8 && Q() < org.telegram.messenger.g0.L(20.0f)) {
                    i11 = size2 - org.telegram.messenger.g0.L(230.0f);
                } else {
                    i11 = size2;
                }
                this.f48061h0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                passcodeActivity.f42701w.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), 1073741824));
                w4Var = ((org.telegram.ui.ActionBar.e2) passcodeActivity).simpleActionBar;
                View view = w4Var != null ? ((org.telegram.ui.ActionBar.e2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.e2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    return;
                }
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                xa1 xa1Var = (xa1) this.f48062i0;
                if (xa1Var.f53149f0.getVisibility() != 8 && Q() < org.telegram.messenger.g0.L(20.0f)) {
                    size4 -= org.telegram.messenger.g0.L(230.0f);
                }
                ((k0) this.f48061h0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                xa1Var.f53149f0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), 1073741824));
                return;
        }
    }
}
