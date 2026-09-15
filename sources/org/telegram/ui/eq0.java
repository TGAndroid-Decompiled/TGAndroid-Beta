package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class eq0 extends org.telegram.ui.Components.pv0 {
    public int f33384w0;
    public boolean f33385x0;
    public final jq0 f33386y0;

    public eq0(jq0 jq0Var, Context context) {
        super(context, null);
        this.f33386y0 = jq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int dp = AndroidUtilities.dp(20.0f);
        int i13 = 0;
        jq0 jq0Var = this.f33386y0;
        if (dp >= 0) {
            if (!AndroidUtilities.isInMultiwindow) {
                size2 -= jq0Var.M.getEmojiPadding();
                i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.f33385x0 = true;
            jq0Var.M.j();
            this.f33385x0 = false;
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.ju juVar = jq0Var.M;
                if (juVar != null && juVar.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        if (AndroidUtilities.isTablet()) {
                            f7 = 200.0f;
                        } else {
                            f7 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f7), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, i14, 0);
                    i13++;
                    i10 = i12;
                }
            }
            i12 = i10;
            i13++;
            i10 = i12;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f33385x0) {
            return;
        }
        super.requestLayout();
    }
}
