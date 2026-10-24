package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dq0 extends org.telegram.ui.Components.nw0 {
    public int f36702w0;
    public boolean f36703x0;
    public int f36704y0;
    public final lq0 f36705z0;

    public dq0(lq0 lq0Var, Context context) {
        super(context, null);
        this.f36705z0 = lq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.ou ouVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        lq0 lq0Var = this.f36705z0;
        if (isTablet) {
            lq0Var.f39343g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                lq0Var.f39343g0 = 4;
            } else {
                lq0Var.f39343g0 = 3;
            }
        }
        this.f36703x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / lq0Var.f39343g0;
        lq0Var.R = dp;
        if (this.f36704y0 != dp) {
            this.f36704y0 = dp;
            AndroidUtilities.runOnUIThread(new nj0(this, 14));
        }
        if (lq0Var.Y) {
            lq0Var.M.y1(1);
        } else {
            lq0Var.M.y1(Math.max(1, ((lq0Var.f39343g0 - 1) * AndroidUtilities.dp(2.0f)) + (lq0Var.R * lq0Var.f39343g0)));
        }
        this.f36703x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && lq0Var.f39339d0 != null && lq0Var.Z.getParent() == this) {
            size4 -= lq0Var.f39339d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (Q > AndroidUtilities.dp(20.0f) && (ouVar = lq0Var.f39339d0) != null) {
            this.f36703x0 = true;
            ouVar.j();
            this.f36703x0 = false;
        }
        org.telegram.ui.Components.ou ouVar2 = lq0Var.f39339d0;
        if (ouVar2 != null && ouVar2.e) {
            lq0Var.fragmentView.setTranslationY(0.0f);
            lq0Var.K.setTranslationY(0.0f);
            lq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.ou ouVar3 = lq0Var.f39339d0;
                if (ouVar3 != null && ouVar3.l(childAt)) {
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
        if (this.f36703x0) {
            return;
        }
        super.requestLayout();
    }
}
