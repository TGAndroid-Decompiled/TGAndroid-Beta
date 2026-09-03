package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.vg1;
public final class z90 extends pv0 {
    public final int f33879t0;
    public final FrameLayout f33880u0;
    public final org.telegram.ui.ActionBar.p2 f33881v0;

    public z90(org.telegram.ui.ActionBar.p2 p2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f33879t0 = i10;
        this.f33881v0 = p2Var;
        this.f33880u0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f33879t0) {
            case 0:
                ((fa0) this.f33881v0).S.Q(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qt0[] qt0VarArr;
        qt0 qt0Var;
        switch (this.f33879t0) {
            case 0:
                fa0 fa0Var = (fa0) this.f33881v0;
                ca0 ca0Var = fa0Var.S;
                if (ca0Var != null && (qt0Var = (qt0VarArr = ca0Var.f33625h0)[0]) != null && qt0Var.h.getFastScroll() != null && qt0VarArr[0].h.getFastScroll().f25653n) {
                    return fa0Var.S.O(motionEvent);
                }
                ca0 ca0Var2 = fa0Var.S;
                if (ca0Var2 != null && ca0Var2.H(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int measuredHeight2;
        switch (this.f33879t0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f33881v0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f33880u0;
                if (visibility != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (passcodeActivity.c0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
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
                passcodeActivity.v.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                S();
                return;
            case 2:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f33880u0;
                vg1 vg1Var = (vg1) this.f33881v0;
                if (vg1Var.f42113b0.getVisibility() != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (vg1Var.v0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        l0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        l0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (vg1Var.f42113b0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    l0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    l0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                vg1Var.f42113b0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        switch (this.f33879t0) {
            case 0:
                fa0 fa0Var = (fa0) this.f33881v0;
                k6[] k6VarArr = fa0Var.f26858x;
                org.telegram.ui.ActionBar.l5[] l5VarArr = fa0Var.f26857w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fa0Var.S.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (fa0.V(fa0Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f33880u0.getLayoutParams();
                if (fa0.W(fa0Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = i13;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i14 = 0; i14 < 2; i14++) {
                    if (l5VarArr[i14] != null) {
                        int x10 = org.telegram.ui.b.x(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f10 = 4.0f;
                        } else {
                            f10 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) l5VarArr[i14].getLayoutParams()).topMargin = AndroidUtilities.dp(f10) + x10;
                    }
                    if (k6VarArr[i14] != null) {
                        ((FrameLayout.LayoutParams) k6VarArr[i14].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) fa0Var.f26859y.getLayoutParams()).topMargin = org.telegram.ui.b.x(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f33881v0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f33880u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                vg1 vg1Var = (vg1) this.f33881v0;
                if (vg1Var.f42113b0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.l0) this.f33880u0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                vg1Var.f42113b0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
