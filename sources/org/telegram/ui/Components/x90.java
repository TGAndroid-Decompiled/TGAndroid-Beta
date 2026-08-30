package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.og1;
public final class x90 extends qv0 {
    public final int f30636t0;
    public final FrameLayout f30637u0;
    public final org.telegram.ui.ActionBar.p2 f30638v0;

    public x90(org.telegram.ui.ActionBar.p2 p2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f30636t0 = i10;
        this.f30638v0 = p2Var;
        this.f30637u0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f30636t0) {
            case 0:
                ((da0) this.f30638v0).S.Q(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qt0[] qt0VarArr;
        qt0 qt0Var;
        switch (this.f30636t0) {
            case 0:
                da0 da0Var = (da0) this.f30638v0;
                aa0 aa0Var = da0Var.S;
                if (aa0Var != null && (qt0Var = (qt0VarArr = aa0Var.f31120h0)[0]) != null && qt0Var.h.getFastScroll() != null && qt0VarArr[0].h.getFastScroll().f23713n) {
                    return da0Var.S.O(motionEvent);
                }
                aa0 aa0Var2 = da0Var.S;
                if (aa0Var2 != null && aa0Var2.H(motionEvent)) {
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
        switch (this.f30636t0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f30638v0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f30637u0;
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
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f30637u0;
                og1 og1Var = (og1) this.f30638v0;
                if (og1Var.f36896b0.getVisibility() != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (og1Var.v0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        l0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        l0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (og1Var.f36896b0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    l0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    l0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                og1Var.f36896b0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
        switch (this.f30636t0) {
            case 0:
                da0 da0Var = (da0) this.f30638v0;
                k6[] k6VarArr = da0Var.f24223x;
                org.telegram.ui.ActionBar.k5[] k5VarArr = da0Var.f24222w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) da0Var.S.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (da0.V(da0Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f30637u0.getLayoutParams();
                if (da0.W(da0Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = i13;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i14 = 0; i14 < 2; i14++) {
                    if (k5VarArr[i14] != null) {
                        int x10 = org.telegram.ui.b.x(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f10 = 4.0f;
                        } else {
                            f10 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) k5VarArr[i14].getLayoutParams()).topMargin = AndroidUtilities.dp(f10) + x10;
                    }
                    if (k6VarArr[i14] != null) {
                        ((FrameLayout.LayoutParams) k6VarArr[i14].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) da0Var.f24224y.getLayoutParams()).topMargin = org.telegram.ui.b.x(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f30638v0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f30637u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                og1 og1Var = (og1) this.f30638v0;
                if (og1Var.f36896b0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.l0) this.f30637u0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                og1Var.f36896b0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
