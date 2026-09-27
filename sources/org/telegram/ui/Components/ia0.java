package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.zg1;
public final class ia0 extends cw0 {
    public final int f25070w0;
    public final FrameLayout f25071x0;
    public final org.telegram.ui.ActionBar.o2 f25072y0;

    public ia0(org.telegram.ui.ActionBar.o2 o2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f25070w0 = i10;
        this.f25072y0 = o2Var;
        this.f25071x0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f25070w0) {
            case 0:
                ((oa0) this.f25072y0).V.Q(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eu0[] eu0VarArr;
        eu0 eu0Var;
        switch (this.f25070w0) {
            case 0:
                oa0 oa0Var = (oa0) this.f25072y0;
                la0 la0Var = oa0Var.V;
                if (la0Var != null && (eu0Var = (eu0VarArr = la0Var.f26188k0)[0]) != null && eu0Var.h.getFastScroll() != null && eu0VarArr[0].h.getFastScroll().f24324n) {
                    return oa0Var.V.O(motionEvent);
                }
                la0 la0Var2 = oa0Var.V;
                if (la0Var2 != null && la0Var2.H(motionEvent)) {
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
        switch (this.f25070w0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f25072y0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f25071x0;
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
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f25071x0;
                zg1 zg1Var = (zg1) this.f25072y0;
                if (zg1Var.f40511e0.getVisibility() != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (zg1Var.v0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        l0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        l0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (zg1Var.f40511e0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    l0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    l0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                zg1Var.f40511e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
        float f7;
        switch (this.f25070w0) {
            case 0:
                oa0 oa0Var = (oa0) this.f25072y0;
                p6[] p6VarArr = oa0Var.f27061x;
                org.telegram.ui.ActionBar.j5[] j5VarArr = oa0Var.f27060w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oa0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (oa0.V(oa0Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f25071x0.getLayoutParams();
                if (oa0.W(oa0Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = i13;
                layoutParams2.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                for (int i14 = 0; i14 < 2; i14++) {
                    if (j5VarArr[i14] != null) {
                        int z10 = org.telegram.messenger.qk.z(22.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f7 = 4.0f;
                        } else {
                            f7 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) j5VarArr[i14].getLayoutParams()).topMargin = AndroidUtilities.dp(f7) + z10;
                    }
                    if (p6VarArr[i14] != null) {
                        ((FrameLayout.LayoutParams) p6VarArr[i14].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) oa0Var.f27062y.getLayoutParams()).topMargin = org.telegram.messenger.qk.z(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f25072y0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f25071x0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                zg1 zg1Var = (zg1) this.f25072y0;
                if (zg1Var.f40511e0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.l0) this.f25071x0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                zg1Var.f40511e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
