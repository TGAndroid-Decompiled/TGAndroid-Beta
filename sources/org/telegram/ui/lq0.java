package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lq0 extends org.telegram.ui.Components.bw0 {
    public int f35399w0;
    public boolean f35400x0;
    public int f35401y0;
    public final tq0 f35402z0;

    public lq0(tq0 tq0Var, Context context) {
        super(context, null);
        this.f35402z0 = tq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.lu luVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        tq0 tq0Var = this.f35402z0;
        if (isTablet) {
            tq0Var.f38197g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                tq0Var.f38197g0 = 4;
            } else {
                tq0Var.f38197g0 = 3;
            }
        }
        this.f35400x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / tq0Var.f38197g0;
        tq0Var.R = dp;
        if (this.f35401y0 != dp) {
            this.f35401y0 = dp;
            AndroidUtilities.runOnUIThread(new il0(this, 12));
        }
        if (tq0Var.Y) {
            tq0Var.M.y1(1);
        } else {
            tq0Var.M.y1(Math.max(1, ((tq0Var.f38197g0 - 1) * AndroidUtilities.dp(2.0f)) + (tq0Var.R * tq0Var.f38197g0)));
        }
        this.f35400x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && tq0Var.f38193d0 != null && tq0Var.Z.getParent() == this) {
            size4 -= tq0Var.f38193d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (luVar = tq0Var.f38193d0) != null) {
            this.f35400x0 = true;
            luVar.j();
            this.f35400x0 = false;
        }
        org.telegram.ui.Components.lu luVar2 = tq0Var.f38193d0;
        if (luVar2 != null && luVar2.e) {
            tq0Var.fragmentView.setTranslationY(0.0f);
            tq0Var.K.setTranslationY(0.0f);
            tq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.lu luVar3 = tq0Var.f38193d0;
                if (luVar3 != null && luVar3.l(childAt)) {
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
        if (this.f35400x0) {
            return;
        }
        super.requestLayout();
    }
}
