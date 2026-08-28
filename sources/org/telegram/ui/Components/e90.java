package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ag1;
public final class e90 extends xu0 {
    public final int f27986s0;
    public final FrameLayout f27987t0;
    public final org.telegram.ui.ActionBar.o2 f27988u0;

    public e90(org.telegram.ui.ActionBar.o2 o2Var, Context context, FrameLayout frameLayout, int i9) {
        super(context, null);
        this.f27986s0 = i9;
        this.f27988u0 = o2Var;
        this.f27987t0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f27986s0) {
            case 0:
                ((k90) this.f27988u0).R.Q(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xs0[] xs0VarArr;
        xs0 xs0Var;
        switch (this.f27986s0) {
            case 0:
                k90 k90Var = (k90) this.f27988u0;
                h90 h90Var = k90Var.R;
                if (h90Var != null && (xs0Var = (xs0VarArr = h90Var.f28137g0)[0]) != null && xs0Var.h.getFastScroll() != null && xs0VarArr[0].h.getFastScroll().f28480n) {
                    return k90Var.R.O(motionEvent);
                }
                h90 h90Var2 = k90Var.R;
                if (h90Var2 != null && h90Var2.H(motionEvent)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredHeight;
        int measuredHeight2;
        switch (this.f27986s0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f27988u0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f27987t0;
                if (visibility != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (passcodeActivity.b0()) {
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
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.f27987t0;
                ag1 ag1Var = (ag1) this.f27988u0;
                if (ag1Var.f36482a0.getVisibility() != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (ag1Var.u0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        m0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        m0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (ag1Var.f36482a0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    m0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    m0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                ag1Var.f36482a0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        float f10;
        switch (this.f27986s0) {
            case 0:
                k90 k90Var = (k90) this.f27988u0;
                j6[] j6VarArr = k90Var.f30041x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = k90Var.f30040w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k90Var.R.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (k90.U(k90Var).getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i11;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f27987t0.getLayoutParams();
                if (k90.V(k90Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams2.topMargin = i12;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i13 = 0; i13 < 2; i13++) {
                    if (h5VarArr[i13] != null) {
                        int y10 = org.telegram.messenger.ll.y(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f10 = 4.0f;
                        } else {
                            f10 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) h5VarArr[i13].getLayoutParams()).topMargin = AndroidUtilities.dp(f10) + y10;
                    }
                    if (j6VarArr[i13] != null) {
                        ((FrameLayout.LayoutParams) j6VarArr[i13].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) k90Var.f30042y.getLayoutParams()).topMargin = org.telegram.messenger.ll.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i9, i10);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f27988u0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f27987t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                ag1 ag1Var = (ag1) this.f27988u0;
                if (ag1Var.f36482a0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.m0) this.f27987t0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                ag1Var.f36482a0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
