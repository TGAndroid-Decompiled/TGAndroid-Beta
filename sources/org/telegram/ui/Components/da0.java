package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ih1;
public final class da0 extends aw0 {
    public final int f23545w0;
    public final FrameLayout f23546x0;
    public final org.telegram.ui.ActionBar.n2 f23547y0;

    public da0(org.telegram.ui.ActionBar.n2 n2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f23545w0 = i10;
        this.f23547y0 = n2Var;
        this.f23546x0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f23545w0) {
            case 0:
                ((ja0) this.f23547y0).V.Q(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cu0[] cu0VarArr;
        cu0 cu0Var;
        switch (this.f23545w0) {
            case 0:
                ja0 ja0Var = (ja0) this.f23547y0;
                ga0 ga0Var = ja0Var.V;
                if (ga0Var != null && (cu0Var = (cu0VarArr = ga0Var.f25504k0)[0]) != null && cu0Var.h.getFastScroll() != null && cu0VarArr[0].h.getFastScroll().f23338n) {
                    return ja0Var.V.O(motionEvent);
                }
                ga0 ga0Var2 = ja0Var.V;
                if (ga0Var2 != null && ga0Var2.H(motionEvent)) {
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
        switch (this.f23545w0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f23547y0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f23546x0;
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
                org.telegram.ui.j0 j0Var = (org.telegram.ui.j0) this.f23546x0;
                ih1 ih1Var = (ih1) this.f23547y0;
                if (ih1Var.f34577e0.getVisibility() != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (ih1Var.v0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        j0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        j0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (ih1Var.f34577e0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    j0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    j0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                ih1Var.f34577e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
        switch (this.f23545w0) {
            case 0:
                ja0 ja0Var = (ja0) this.f23547y0;
                o6[] o6VarArr = ja0Var.f25328x;
                org.telegram.ui.ActionBar.j5[] j5VarArr = ja0Var.f25327w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ja0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (ja0.V(ja0Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f23546x0.getLayoutParams();
                if (ja0.W(ja0Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = i13;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i14 = 0; i14 < 2; i14++) {
                    if (j5VarArr[i14] != null) {
                        int z10 = org.telegram.messenger.rk.z(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f7 = 4.0f;
                        } else {
                            f7 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) j5VarArr[i14].getLayoutParams()).topMargin = AndroidUtilities.dp(f7) + z10;
                    }
                    if (o6VarArr[i14] != null) {
                        ((FrameLayout.LayoutParams) o6VarArr[i14].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) ja0Var.f25329y.getLayoutParams()).topMargin = org.telegram.messenger.rk.z(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f23547y0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f23546x0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                ih1 ih1Var = (ih1) this.f23547y0;
                if (ih1Var.f34577e0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.j0) this.f23546x0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                ih1Var.f34577e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
