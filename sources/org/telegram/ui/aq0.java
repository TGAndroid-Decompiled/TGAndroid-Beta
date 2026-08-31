package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class aq0 extends org.telegram.ui.Components.qv0 {
    public int f35229t0;
    public boolean f35230u0;
    public int f35231v0;
    public final hq0 f35232w0;

    public aq0(hq0 hq0Var, Context context) {
        super(context, null);
        this.f35232w0 = hq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        org.telegram.ui.Components.fu fuVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        hq0 hq0Var = this.f35232w0;
        if (isTablet) {
            hq0Var.f37577d0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                hq0Var.f37577d0 = 4;
            } else {
                hq0Var.f37577d0 = 3;
            }
        }
        this.f35230u0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / hq0Var.f37577d0;
        hq0Var.O = dp;
        if (this.f35231v0 != dp) {
            this.f35231v0 = dp;
            AndroidUtilities.runOnUIThread(new gl0(this, 13));
        }
        if (hq0Var.V) {
            hq0Var.J.y1(1);
        } else {
            hq0Var.J.y1(Math.max(1, ((hq0Var.f37577d0 - 1) * AndroidUtilities.dp(2.0f)) + (hq0Var.O * hq0Var.f37577d0)));
        }
        this.f35230u0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && hq0Var.f37572a0 != null && hq0Var.W.getParent() == this) {
            size4 -= hq0Var.f37572a0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (fuVar = hq0Var.f37572a0) != null) {
            this.f35230u0 = true;
            fuVar.j();
            this.f35230u0 = false;
        }
        org.telegram.ui.Components.fu fuVar2 = hq0Var.f37572a0;
        if (fuVar2 != null && fuVar2.f27004e) {
            hq0Var.fragmentView.setTranslationY(0.0f);
            hq0Var.H.setTranslationY(0.0f);
            hq0Var.K.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.fu fuVar3 = hq0Var.f37572a0;
                if (fuVar3 != null && fuVar3.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                        if (AndroidUtilities.isTablet()) {
                            f10 = 200.0f;
                        } else {
                            f10 = 320.0f;
                        }
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight)), 1073741824));
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
        if (this.f35230u0) {
            return;
        }
        super.requestLayout();
    }
}
