package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mq0 extends org.telegram.ui.Components.pv0 {
    public int f35375w0;
    public boolean f35376x0;
    public int f35377y0;
    public final uq0 f35378z0;

    public mq0(uq0 uq0Var, Context context) {
        super(context, null);
        this.f35378z0 = uq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.ku kuVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        uq0 uq0Var = this.f35378z0;
        if (isTablet) {
            uq0Var.f38177g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                uq0Var.f38177g0 = 4;
            } else {
                uq0Var.f38177g0 = 3;
            }
        }
        this.f35376x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / uq0Var.f38177g0;
        uq0Var.R = dp;
        if (this.f35377y0 != dp) {
            this.f35377y0 = dp;
            AndroidUtilities.runOnUIThread(new jl0(this, 12));
        }
        if (uq0Var.Y) {
            uq0Var.M.y1(1);
        } else {
            uq0Var.M.y1(Math.max(1, ((uq0Var.f38177g0 - 1) * AndroidUtilities.dp(2.0f)) + (uq0Var.R * uq0Var.f38177g0)));
        }
        this.f35376x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && uq0Var.f38173d0 != null && uq0Var.Z.getParent() == this) {
            size4 -= uq0Var.f38173d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (kuVar = uq0Var.f38173d0) != null) {
            this.f35376x0 = true;
            kuVar.j();
            this.f35376x0 = false;
        }
        org.telegram.ui.Components.ku kuVar2 = uq0Var.f38173d0;
        if (kuVar2 != null && kuVar2.e) {
            uq0Var.fragmentView.setTranslationY(0.0f);
            uq0Var.K.setTranslationY(0.0f);
            uq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.ku kuVar3 = uq0Var.f38173d0;
                if (kuVar3 != null && kuVar3.l(childAt)) {
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
        if (this.f35376x0) {
            return;
        }
        super.requestLayout();
    }
}
