package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class VoIPButtonsLayout extends FrameLayout {
    public int childPadding;
    public int childSize;
    public int childWidth;
    public boolean startPadding;
    public int visibleChildCount;

    public VoIPButtonsLayout(Context context) {
        super(context);
        this.childSize = 68;
        this.startPadding = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.startPadding) {
            int childCount = (int) (((getChildCount() - this.visibleChildCount) / 2.0f) * ((this.childPadding * 2) + this.childWidth));
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    int i6 = this.childPadding + childCount;
                    childAt.layout(i6, 0, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.childPadding * 2) + childCount;
                }
            }
            return;
        }
        int measuredWidth = this.visibleChildCount > 0 ? (getMeasuredWidth() - this.childWidth) / (this.visibleChildCount - 1) : 0;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                int i9 = i7 * measuredWidth;
                childAt2.layout(i9, 0, childAt2.getMeasuredWidth() + i9, childAt2.getMeasuredHeight());
                i7++;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.visibleChildCount = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3).getVisibility() != 8) {
                this.visibleChildCount++;
            }
        }
        this.childWidth = AndroidUtilities.dp(this.childSize);
        this.childPadding = ((size / getChildCount()) - this.childWidth) / 2;
        int measuredHeight = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4).getVisibility() != 8) {
                getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(this.childWidth, 1073741824), i2);
                if (getChildAt(i4).getMeasuredHeight() > measuredHeight) {
                    measuredHeight = getChildAt(i4).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(measuredHeight, AndroidUtilities.dp(80.0f)));
    }

    public void setChildSize(int i) {
        this.childSize = i;
    }

    public void setUseStartPadding(boolean z) {
        this.startPadding = z;
    }
}
