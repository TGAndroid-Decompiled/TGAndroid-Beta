package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class ji0 extends org.telegram.ui.Components.st0 {
    public final int f47018f0;
    public final FrameLayout f47019g0;
    public final org.telegram.ui.ActionBar.f2 f47020h0;

    public ji0(org.telegram.ui.ActionBar.f2 f2Var, Context context, FrameLayout frameLayout, int i7) {
        super(context, null);
        this.f47018f0 = i7;
        this.f47020h0 = f2Var;
        this.f47019g0 = frameLayout;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredHeight;
        org.telegram.ui.ActionBar.z4 z4Var;
        int measuredHeight2;
        switch (this.f47018f0) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47020h0;
                int visibility = passcodeActivity.f41331w.getVisibility();
                FrameLayout frameLayout = this.f47019g0;
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
                } else if (passcodeActivity.f41331w.getVisibility() != 8) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f);
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                z4Var = ((org.telegram.ui.ActionBar.f2) passcodeActivity).simpleActionBar;
                View view = z4Var != null ? ((org.telegram.ui.ActionBar.f2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.f2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.f41331w.layout(0, measuredHeight, getMeasuredWidth(), org.telegram.messenger.g0.L(230.0f) + measuredHeight);
                R();
                return;
            default:
                k0 k0Var = (k0) this.f47019g0;
                cb1 cb1Var = (cb1) this.f47020h0;
                if (cb1Var.f44300e0.getVisibility() != 8 && Q() >= org.telegram.messenger.g0.L(20.0f)) {
                    if (cb1Var.A0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f));
                        k0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        k0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (cb1Var.f44300e0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(230.0f);
                    k0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    k0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                cb1Var.f44300e0.layout(0, measuredHeight2, getMeasuredWidth(), org.telegram.messenger.g0.L(230.0f) + measuredHeight2);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.z4 z4Var;
        switch (this.f47018f0) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47020h0;
                if (passcodeActivity.f41331w.getVisibility() != 8 && Q() < org.telegram.messenger.g0.L(20.0f)) {
                    i11 = size2 - org.telegram.messenger.g0.L(230.0f);
                } else {
                    i11 = size2;
                }
                this.f47019g0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                passcodeActivity.f41331w.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), 1073741824));
                z4Var = ((org.telegram.ui.ActionBar.f2) passcodeActivity).simpleActionBar;
                View view = z4Var != null ? ((org.telegram.ui.ActionBar.f2) passcodeActivity).simpleActionBar : ((org.telegram.ui.ActionBar.f2) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    return;
                }
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                cb1 cb1Var = (cb1) this.f47020h0;
                if (cb1Var.f44300e0.getVisibility() != 8 && Q() < org.telegram.messenger.g0.L(20.0f)) {
                    size4 -= org.telegram.messenger.g0.L(230.0f);
                }
                ((k0) this.f47019g0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                cb1Var.f44300e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), 1073741824));
                return;
        }
    }
}
