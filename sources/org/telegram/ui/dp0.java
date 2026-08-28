package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dp0 extends org.telegram.ui.Components.xu0 {
    public int f37577s0;
    public boolean f37578t0;
    public final ip0 f37579u0;

    public dp0(ip0 ip0Var, Context context) {
        super(context, null);
        this.f37579u0 = ip0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dp0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        float f10;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int dp = AndroidUtilities.dp(20.0f);
        int i12 = 0;
        ip0 ip0Var = this.f37579u0;
        if (dp >= 0) {
            if (!AndroidUtilities.isInMultiwindow) {
                size2 -= ip0Var.I.getEmojiPadding();
                i10 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
        } else {
            this.f37578t0 = true;
            ip0Var.I.j();
            this.f37578t0 = false;
        }
        int i13 = i10;
        int childCount = getChildCount();
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.ut utVar = ip0Var.I;
                if (utVar != null && utVar.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        if (AndroidUtilities.isTablet()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else {
                    i11 = i9;
                    measureChildWithMargins(childAt, i11, 0, i13, 0);
                    i12++;
                    i9 = i11;
                }
            }
            i11 = i9;
            i12++;
            i9 = i11;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f37578t0) {
            return;
        }
        super.requestLayout();
    }
}
