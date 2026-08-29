package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cg1;
public final class s90 extends hv0 {
    public final int f32593s0;
    public final FrameLayout f32594t0;
    public final org.telegram.ui.ActionBar.o2 f32595u0;

    public s90(org.telegram.ui.ActionBar.o2 o2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f32593s0 = i10;
        this.f32595u0 = o2Var;
        this.f32594t0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f32593s0) {
            case 0:
                ((y90) this.f32595u0).R.Q(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        it0[] it0VarArr;
        it0 it0Var;
        switch (this.f32593s0) {
            case 0:
                y90 y90Var = (y90) this.f32595u0;
                v90 v90Var = y90Var.R;
                if (v90Var != null && (it0Var = (it0VarArr = v90Var.f32070g0)[0]) != null && it0Var.h.getFastScroll() != null && it0VarArr[0].h.getFastScroll().f32680n) {
                    return y90Var.R.O(motionEvent);
                }
                v90 v90Var2 = y90Var.R;
                if (v90Var2 != null && v90Var2.H(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int measuredHeight2;
        switch (this.f32593s0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32595u0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f32594t0;
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
                org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) this.f32594t0;
                cg1 cg1Var = (cg1) this.f32595u0;
                if (cg1Var.f37105a0.getVisibility() != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (cg1Var.v0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        n0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        n0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (cg1Var.f37105a0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    n0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    n0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                cg1Var.f37105a0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f9;
        switch (this.f32593s0) {
            case 0:
                y90 y90Var = (y90) this.f32595u0;
                o6[] o6VarArr = y90Var.f35003x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = y90Var.f35002w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y90Var.R.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (y90.V(y90Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f32594t0.getLayoutParams();
                if (y90.W(y90Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = i13;
                layoutParams2.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                for (int i14 = 0; i14 < 2; i14++) {
                    if (h5VarArr[i14] != null) {
                        int x4 = org.telegram.ui.b.x(22.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f9 = 4.0f;
                        } else {
                            f9 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) h5VarArr[i14].getLayoutParams()).topMargin = AndroidUtilities.dp(f9) + x4;
                    }
                    if (o6VarArr[i14] != null) {
                        ((FrameLayout.LayoutParams) o6VarArr[i14].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) y90Var.f35004y.getLayoutParams()).topMargin = org.telegram.ui.b.x(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f32595u0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f32594t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                cg1 cg1Var = (cg1) this.f32595u0;
                if (cg1Var.f37105a0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.n0) this.f32594t0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                cg1Var.f37105a0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
