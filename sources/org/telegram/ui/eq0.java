package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class eq0 extends org.telegram.ui.Components.ow0 {
    public int f37012w0;
    public boolean f37013x0;
    public int f37014y0;
    public final mq0 f37015z0;

    public eq0(mq0 mq0Var, Context context) {
        super(context, null);
        this.f37015z0 = mq0Var;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        org.telegram.ui.Components.qu quVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        mq0 mq0Var = this.f37015z0;
        if (isTablet) {
            mq0Var.f39653g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                mq0Var.f39653g0 = 4;
            } else {
                mq0Var.f39653g0 = 3;
            }
        }
        this.f37013x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / mq0Var.f39653g0;
        mq0Var.R = dp;
        if (this.f37014y0 != dp) {
            this.f37014y0 = dp;
            AndroidUtilities.runOnUIThread(new oj0(this, 14));
        }
        if (mq0Var.Y) {
            mq0Var.M.y1(1);
        } else {
            mq0Var.M.y1(Math.max(1, ((mq0Var.f39653g0 - 1) * AndroidUtilities.dp(2.0f)) + (mq0Var.R * mq0Var.f39653g0)));
        }
        this.f37013x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && mq0Var.f39649d0 != null && mq0Var.Z.getParent() == this) {
            size4 -= mq0Var.f39649d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (Q > AndroidUtilities.dp(20.0f) && (quVar = mq0Var.f39649d0) != null) {
            this.f37013x0 = true;
            quVar.j();
            this.f37013x0 = false;
        }
        org.telegram.ui.Components.qu quVar2 = mq0Var.f39649d0;
        if (quVar2 != null && quVar2.e) {
            mq0Var.fragmentView.setTranslationY(0.0f);
            mq0Var.K.setTranslationY(0.0f);
            mq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.qu quVar3 = mq0Var.f39649d0;
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
        if (this.f37013x0) {
            return;
        }
        super.requestLayout();
    }
}
