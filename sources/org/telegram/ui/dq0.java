package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dq0 extends org.telegram.ui.Components.jw0 {
    public int f36304w0;
    public boolean f36305x0;
    public int f36306y0;
    public final lq0 f36307z0;

    public dq0(lq0 lq0Var, Context context) {
        super(context, null);
        this.f36307z0 = lq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.qu quVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        lq0 lq0Var = this.f36307z0;
        if (isTablet) {
            lq0Var.f38921g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                lq0Var.f38921g0 = 4;
            } else {
                lq0Var.f38921g0 = 3;
            }
        }
        this.f36305x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / lq0Var.f38921g0;
        lq0Var.R = dp;
        if (this.f36306y0 != dp) {
            this.f36306y0 = dp;
            AndroidUtilities.runOnUIThread(new ek0(this, 13));
        }
        if (lq0Var.Y) {
            lq0Var.M.y1(1);
        } else {
            lq0Var.M.y1(Math.max(1, ((lq0Var.f38921g0 - 1) * AndroidUtilities.dp(2.0f)) + (lq0Var.R * lq0Var.f38921g0)));
        }
        this.f36305x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && lq0Var.f38917d0 != null && lq0Var.Z.getParent() == this) {
            size4 -= lq0Var.f38917d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (quVar = lq0Var.f38917d0) != null) {
            this.f36305x0 = true;
            quVar.j();
            this.f36305x0 = false;
        }
        org.telegram.ui.Components.qu quVar2 = lq0Var.f38917d0;
        if (quVar2 != null && quVar2.e) {
            lq0Var.fragmentView.setTranslationY(0.0f);
            lq0Var.K.setTranslationY(0.0f);
            lq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.qu quVar3 = lq0Var.f38917d0;
                if (quVar3 != null && quVar3.l(childAt)) {
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
        if (this.f36305x0) {
            return;
        }
        super.requestLayout();
    }
}
