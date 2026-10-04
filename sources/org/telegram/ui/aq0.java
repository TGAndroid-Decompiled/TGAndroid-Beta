package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class aq0 extends org.telegram.ui.Components.lw0 {
    public int f34886w0;
    public boolean f34887x0;
    public final fq0 f34888y0;

    public aq0(fq0 fq0Var, Context context) {
        super(context, null);
        this.f34888y0 = fq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aq0.onLayout(boolean, int, int, int, int):void");
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
        fq0 fq0Var = this.f34888y0;
        if (dp >= 0) {
            if (!AndroidUtilities.isInMultiwindow) {
                size2 -= fq0Var.M.getEmojiPadding();
                i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.f34887x0 = true;
            fq0Var.M.j();
            this.f34887x0 = false;
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.mu muVar = fq0Var.M;
                if (muVar != null && muVar.l(childAt)) {
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
        if (this.f34887x0) {
            return;
        }
        super.requestLayout();
    }
}
