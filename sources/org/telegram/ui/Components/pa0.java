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
public final class pa0 extends nw0 {
    public final int f29533w0;
    public final FrameLayout f29534x0;
    public final org.telegram.ui.ActionBar.o2 f29535y0;

    public pa0(org.telegram.ui.ActionBar.o2 o2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f29533w0 = i10;
        this.f29535y0 = o2Var;
        this.f29534x0 = frameLayout;
    }

    @Override
    public void K(Canvas canvas, ArrayList arrayList) {
        switch (this.f29533w0) {
            case 0:
                ((va0) this.f29535y0).V.R(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pu0[] pu0VarArr;
        pu0 pu0Var;
        switch (this.f29533w0) {
            case 0:
                va0 va0Var = (va0) this.f29535y0;
                sa0 sa0Var = va0Var.V;
                if (sa0Var != null && (pu0Var = (pu0VarArr = sa0Var.f32386k0)[0]) != null && pu0Var.h.getFastScroll() != null && pu0VarArr[0].h.getFastScroll().f30557n) {
                    return va0Var.V.P(motionEvent);
                }
                sa0 sa0Var2 = va0Var.V;
                if (sa0Var2 != null && sa0Var2.I(motionEvent)) {
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
        switch (this.f29533w0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f29535y0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f29534x0;
                if (visibility != 8 && Q() >= AndroidUtilities.dp(20.0f)) {
                    if (passcodeActivity.f0()) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = Q() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
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
                R();
                return;
            case 2:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f29534x0;
                ag1 ag1Var = (ag1) this.f29535y0;
                if (ag1Var.f35765e0.getVisibility() != 8 && Q() >= AndroidUtilities.dp(20.0f)) {
                    if (ag1Var.v0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = Q() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        l0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        l0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (ag1Var.f35765e0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    l0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    l0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                ag1Var.f35765e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
        switch (this.f29533w0) {
            case 0:
                va0 va0Var = (va0) this.f29535y0;
                o6[] o6VarArr = va0Var.f31408x;
                org.telegram.ui.ActionBar.n5[] n5VarArr = va0Var.f31407w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) va0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (va0.V(va0Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f29534x0.getLayoutParams();
                if (va0.W(va0Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = i13;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i14 = 0; i14 < 2; i14++) {
                    if (n5VarArr[i14] != null) {
                        int A = org.telegram.messenger.tl.A(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f7 = 4.0f;
                        } else {
                            f7 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) n5VarArr[i14].getLayoutParams()).topMargin = AndroidUtilities.dp(f7) + A;
                    }
                    if (o6VarArr[i14] != null) {
                        ((FrameLayout.LayoutParams) o6VarArr[i14].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) va0Var.f31409y.getLayoutParams()).topMargin = org.telegram.messenger.tl.A(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f29535y0;
                if (passcodeActivity.v.getVisibility() != 8 && Q() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f29534x0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                ag1 ag1Var = (ag1) this.f29535y0;
                if (ag1Var.f35765e0.getVisibility() != 8 && Q() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.l0) this.f29534x0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                ag1Var.f35765e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
