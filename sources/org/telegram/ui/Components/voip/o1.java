package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class o1 extends FrameLayout {

    public int f33779a;

    public int f33780b;

    public int f33781c;
    public int d;

    public boolean f33782e;

    public o1(Context context) {
        super(context);
        this.d = 68;
        this.f33782e = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f33782e) {
            int childCount = (int) (((getChildCount() - this.f33779a) / 2.0f) * ((this.f33781c * 2) + this.f33780b));
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    int i15 = this.f33781c;
                    childAt.layout(childCount + i15, 0, childAt.getMeasuredWidth() + i15 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.f33781c * 2) + childCount;
                }
            }
            return;
        }
        int measuredWidth = this.f33779a > 0 ? (getMeasuredWidth() - this.f33780b) / (this.f33779a - 1) : 0;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                int i18 = i16 * measuredWidth;
                childAt2.layout(i18, 0, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight());
                i16++;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f33779a = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12).getVisibility() != 8) {
                this.f33779a++;
            }
        }
        this.f33780b = AndroidUtilities.dp(this.d);
        this.f33781c = ((size / getChildCount()) - this.f33780b) / 2;
        int measuredHeight = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13).getVisibility() != 8) {
                getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(this.f33780b, 1073741824), i11);
                if (getChildAt(i13).getMeasuredHeight() > measuredHeight) {
                    measuredHeight = getChildAt(i13).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(measuredHeight, AndroidUtilities.dp(80.0f)));
    }

    public void setChildSize(int i10) {
        this.d = i10;
    }

    public void setUseStartPadding(boolean z10) {
        this.f33782e = z10;
    }
}
