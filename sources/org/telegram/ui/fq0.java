package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fq0 extends org.telegram.ui.Components.pv0 {
    public int f36896t0;
    public boolean f36897u0;
    public int f36898v0;
    public final mq0 f36899w0;

    public fq0(mq0 mq0Var, Context context) {
        super(context, null);
        this.f36899w0 = mq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        org.telegram.ui.Components.fu fuVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        mq0 mq0Var = this.f36899w0;
        if (isTablet) {
            mq0Var.f39037d0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                mq0Var.f39037d0 = 4;
            } else {
                mq0Var.f39037d0 = 3;
            }
        }
        this.f36897u0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / mq0Var.f39037d0;
        mq0Var.O = dp;
        if (this.f36898v0 != dp) {
            this.f36898v0 = dp;
            AndroidUtilities.runOnUIThread(new gl0(this, 12));
        }
        if (mq0Var.V) {
            mq0Var.J.y1(1);
        } else {
            mq0Var.J.y1(Math.max(1, ((mq0Var.f39037d0 - 1) * AndroidUtilities.dp(2.0f)) + (mq0Var.O * mq0Var.f39037d0)));
        }
        this.f36897u0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && mq0Var.f39032a0 != null && mq0Var.W.getParent() == this) {
            size4 -= mq0Var.f39032a0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (fuVar = mq0Var.f39032a0) != null) {
            this.f36897u0 = true;
            fuVar.j();
            this.f36897u0 = false;
        }
        org.telegram.ui.Components.fu fuVar2 = mq0Var.f39032a0;
        if (fuVar2 != null && fuVar2.f27000e) {
            mq0Var.fragmentView.setTranslationY(0.0f);
            mq0Var.H.setTranslationY(0.0f);
            mq0Var.K.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.fu fuVar3 = mq0Var.f39032a0;
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
        if (this.f36897u0) {
            return;
        }
        super.requestLayout();
    }
}
