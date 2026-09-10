package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.mh1;
public final class fa0 extends aw0 {
    public final int f22963w0;
    public final FrameLayout f22964x0;
    public final org.telegram.ui.ActionBar.p2 f22965y0;

    public fa0(org.telegram.ui.ActionBar.p2 p2Var, Context context, FrameLayout frameLayout, int i10) {
        super(context, null);
        this.f22963w0 = i10;
        this.f22965y0 = p2Var;
        this.f22964x0 = frameLayout;
    }

    @Override
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.f22963w0) {
            case 0:
                ((la0) this.f22965y0).V.Q(canvas, arrayList);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        au0[] au0VarArr;
        au0 au0Var;
        switch (this.f22963w0) {
            case 0:
                la0 la0Var = (la0) this.f22965y0;
                ia0 ia0Var = la0Var.V;
                if (ia0Var != null && (au0Var = (au0VarArr = ia0Var.f24107k0)[0]) != null && au0Var.h.getFastScroll() != null && au0VarArr[0].h.getFastScroll().f22171n) {
                    return la0Var.V.O(motionEvent);
                }
                ia0 ia0Var2 = la0Var.V;
                if (ia0Var2 != null && ia0Var2.H(motionEvent)) {
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
        switch (this.f22963w0) {
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f22965y0;
                int visibility = passcodeActivity.v.getVisibility();
                FrameLayout frameLayout = this.f22964x0;
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
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) this.f22964x0;
                mh1 mh1Var = (mh1) this.f22965y0;
                if (mh1Var.f34959e0.getVisibility() != 8 && R() >= AndroidUtilities.dp(20.0f)) {
                    if (mh1Var.v0()) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = R() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        k0Var.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        k0Var.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (mh1Var.f34959e0.getVisibility() != 8) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                    k0Var.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    k0Var.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                mh1Var.f34959e0.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
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
        switch (this.f22963w0) {
            case 0:
                la0 la0Var = (la0) this.f22965y0;
                o6[] o6VarArr = la0Var.f24927x;
                org.telegram.ui.ActionBar.l5[] l5VarArr = la0Var.f24926w;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) la0Var.V.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (la0.V(la0Var).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i12;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f22964x0.getLayoutParams();
                if (la0.W(la0Var).getOccupyStatusBar()) {
                    i13 = AndroidUtilities.statusBarHeight;
                } else {
                    i13 = 0;
                }
                layoutParams2.topMargin = i13;
                layoutParams2.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                for (int i14 = 0; i14 < 2; i14++) {
                    if (l5VarArr[i14] != null) {
                        int y3 = org.telegram.messenger.em.y(22.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2, 2);
                        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
                            f7 = 4.0f;
                        } else {
                            f7 = 5.0f;
                        }
                        ((FrameLayout.LayoutParams) l5VarArr[i14].getLayoutParams()).topMargin = AndroidUtilities.dp(f7) + y3;
                    }
                    if (o6VarArr[i14] != null) {
                        ((FrameLayout.LayoutParams) o6VarArr[i14].getLayoutParams()).topMargin = ((((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                    }
                }
                ((FrameLayout.LayoutParams) la0Var.f24928y.getLayoutParams()).topMargin = org.telegram.messenger.em.y(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f22965y0;
                if (passcodeActivity.v.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                this.f22964x0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                passcodeActivity.v.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                mh1 mh1Var = (mh1) this.f22965y0;
                if (mh1Var.f34959e0.getVisibility() != 8 && R() < AndroidUtilities.dp(20.0f)) {
                    size4 -= AndroidUtilities.dp(230.0f);
                }
                ((org.telegram.ui.k0) this.f22964x0).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                mh1Var.f34959e0.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                return;
        }
    }
}
