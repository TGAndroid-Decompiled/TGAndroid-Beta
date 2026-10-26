package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jq0 extends org.telegram.ui.Components.vw0 {
    public int f40719l0;
    public boolean m0;
    public int f40720n0;
    public final rq0 f40721o0;

    public jq0(rq0 rq0Var, Context context) {
        super(context, null);
        this.f40721o0 = rq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.ru ruVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        rq0 rq0Var = this.f40721o0;
        if (isTablet) {
            rq0Var.f43252g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                rq0Var.f43252g0 = 4;
            } else {
                rq0Var.f43252g0 = 3;
            }
        }
        this.m0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / rq0Var.f43252g0;
        rq0Var.R = dp;
        if (this.f40720n0 != dp) {
            this.f40720n0 = dp;
            AndroidUtilities.runOnUIThread(new lj0(this, 15));
        }
        if (rq0Var.Y) {
            rq0Var.M.z1(1);
        } else {
            rq0Var.M.z1(Math.max(1, ((rq0Var.f43252g0 - 1) * AndroidUtilities.dp(2.0f)) + (rq0Var.R * rq0Var.f43252g0)));
        }
        this.m0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && rq0Var.f43248d0 != null && rq0Var.Z.getParent() == this) {
            size4 -= rq0Var.f43248d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (Q > AndroidUtilities.dp(20.0f) && (ruVar = rq0Var.f43248d0) != null) {
            this.m0 = true;
            ruVar.j();
            this.m0 = false;
        }
        org.telegram.ui.Components.ru ruVar2 = rq0Var.f43248d0;
        if (ruVar2 != null && ruVar2.e) {
            rq0Var.fragmentView.setTranslationY(0.0f);
            rq0Var.K.setTranslationY(0.0f);
            rq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.ru ruVar3 = rq0Var.f43248d0;
                if (ruVar3 != null && ruVar3.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (AndroidUtilities.isTablet()) {
                            f7 = 200.0f;
                        } else {
                            f7 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f7), getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else {
                    measureChildWithMargins(childAt, i10, 0, i13, 0);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
