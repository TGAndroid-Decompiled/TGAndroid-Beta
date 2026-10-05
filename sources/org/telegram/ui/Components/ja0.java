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
public final class ja0 extends mw0 {
    public final int f27778w0;
    public final FrameLayout f27779x0;
    public final org.telegram.ui.ActionBar.n2 f27780y0;

    public ja0(org.telegram.ui.ActionBar.n2 n2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f27778w0 = i10;
        this.f27780y0 = n2Var;
        this.f27779x0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f27778w0) {
            case 0:
                ((pa0) this.f27780y0).V.Q(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ju0[] ju0VarArr;
        ju0 ju0Var;
        switch (this.f27778w0) {
            case 0:
                pa0 pa0Var = (pa0) this.f27780y0;
                ma0 ma0Var = pa0Var.V;
                if (ma0Var != null && (ju0Var = (ju0VarArr = ma0Var.f30239k0)[0]) != null && ju0Var.h.getFastScroll() != null && ju0VarArr[0].h.getFastScroll().f26517n) {
                    return pa0Var.V.O(motionEvent);
                }
                ma0 ma0Var2 = pa0Var.V;
                if (ma0Var2 != null && ma0Var2.H(motionEvent)) {
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int measuredHeight2;
        switch (this.f27778w0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f27780y0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f27779x0;
                if (visibility != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (passcodeActivity.i0()) {
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
                kVar = ((org.telegram.ui.ActionBar.n2) passcodeActivity).actionBar;
                if (kVar.getParent() == this) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).actionBar;
                    kVar3 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).actionBar;
                    int measuredWidth5 = kVar3.getMeasuredWidth();
                    kVar4 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).actionBar;
                    kVar2.layout(0, 0, measuredWidth5, kVar4.getMeasuredHeight());
                }
                passcodeActivity.v.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                S();
                return;
            case 2:
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) this.f27779x0;
                zg1 zg1Var = (zg1) this.f27780y0;
                if (zg1Var.f43784e0.getVisibility() != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (zg1Var.v0()) {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        k0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    } else {
                        int measuredWidth7 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        k0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                    }
                } else if (zg1Var.f43784e0.getVisibility() != 8) {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    k0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                } else {
                    int measuredWidth9 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    k0Var.layout(0, 0, measuredWidth9, measuredHeight2);
                }
                zg1Var.f43784e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
        int i14;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f27778w0) {
            case 0:
                pa0 pa0Var = (pa0) this.f27780y0;
                p6[] p6VarArr = pa0Var.f29691x;
                org.telegram.ui.ActionBar.i5[] i5VarArr = pa0Var.f29690w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pa0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (pa0.T(pa0Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f27779x0.getLayoutParams();
                if (pa0.U(pa0Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = i13;
                layoutParams2.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i15 = 0; i15 < 2; i15++) {
                    if (i5VarArr[i15] != null) {
                        int z10 = org.telegram.messenger.bi.z(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f7 = 4.0f;
                        } else {
                            f7 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) i5VarArr[i15].getLayoutParams()).topMargin = AndroidUtilities.dp(f7) + z10;
                    }
                    if (p6VarArr[i15] != null) {
                        ((FrameLayout.LayoutParams) p6VarArr[i15].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) pa0Var.f29692y.getLayoutParams()).topMargin = org.telegram.messenger.bi.z(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f27780y0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    i14 = size2 - AndroidUtilities.dp(230.0f);
                } else {
                    i14 = size2;
                }
                this.f27779x0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                kVar = ((org.telegram.ui.ActionBar.n2) passcodeActivity).actionBar;
                if (kVar.getParent() == this) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).actionBar;
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    return;
                }
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                zg1 zg1Var = (zg1) this.f27780y0;
                if (zg1Var.f43784e0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.k0) this.f27779x0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                zg1Var.f43784e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
