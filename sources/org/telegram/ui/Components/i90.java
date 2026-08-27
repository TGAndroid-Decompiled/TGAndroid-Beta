package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.zf1;

public final class i90 extends zu0 {

    public final int f29316s0;

    public final FrameLayout f29317t0;

    public final org.telegram.ui.ActionBar.n2 f29318u0;

    public i90(org.telegram.ui.ActionBar.n2 n2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f29316s0 = i10;
        this.f29318u0 = n2Var;
        this.f29317t0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f29316s0) {
            case 0:
                ((o90) this.f29318u0).R.Q(canvas, arrayList);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zs0[] zs0VarArr;
        zs0 zs0Var;
        switch (this.f29316s0) {
            case 0:
                o90 o90Var = (o90) this.f29318u0;
                l90 l90Var = o90Var.R;
                if (l90Var != null && (zs0Var = (zs0VarArr = l90Var.f29122g0)[0]) != null && zs0Var.h.getFastScroll() != null && zs0VarArr[0].h.getFastScroll().f29396n) {
                    return o90Var.R.O(motionEvent);
                }
                l90 l90Var2 = o90Var.R;
                if (l90Var2 == null || !l90Var2.H(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int measuredHeight2;
        switch (this.f29316s0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f29318u0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f29317t0;
                if (visibility == 8 || R() < AndroidUtilities.dp(20.0f)) {
                    if (passcodeActivity.v.getVisibility() != 8) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.c0()) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                passcodeActivity.v.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                S();
                break;
            case 2:
                org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) this.f29317t0;
                zf1 zf1Var = (zf1) this.f29318u0;
                if (zf1Var.f45162a0.getVisibility() == 8 || R() < AndroidUtilities.dp(20.0f)) {
                    if (zf1Var.f45162a0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        n0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        n0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (zf1Var.v0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    n0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    n0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                zf1Var.f45162a0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f29316s0) {
            case 0:
                o90 o90Var = (o90) this.f29318u0;
                j6[] j6VarArr = o90Var.f31245x;
                org.telegram.ui.ActionBar.h5[] h5VarArr = o90Var.f31244w;
                ((FrameLayout.LayoutParams) o90Var.R.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (((org.telegram.ui.ActionBar.n2) o90Var).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29317t0.getLayoutParams();
                layoutParams.topMargin = ((org.telegram.ui.ActionBar.n2) o90Var).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                for (int i12 = 0; i12 < 2; i12++) {
                    if (h5VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) h5VarArr[i12].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + org.telegram.messenger.rl.x(22.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2, 2);
                    }
                    if (j6VarArr[i12] != null) {
                        ((FrameLayout.LayoutParams) j6VarArr[i12].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) o90Var.f31246y.getLayoutParams()).topMargin = org.telegram.messenger.rl.x(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f29318u0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f29317t0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                zf1 zf1Var = (zf1) this.f29318u0;
                if (zf1Var.f45162a0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.n0) this.f29317t0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                zf1Var.f45162a0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                break;
        }
    }
}
