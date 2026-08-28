package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o1 extends FrameLayout {
    public int f33729a;
    public int f33730b;
    public int f33731c;
    public int d;
    public boolean f33732e;

    public o1(Context context) {
        super(context);
        this.d = 68;
        this.f33732e = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        if (this.f33732e) {
            int childCount = (int) (((getChildCount() - this.f33729a) / 2.0f) * ((this.f33731c * 2) + this.f33730b));
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    int i15 = this.f33731c;
                    childAt.layout(childCount + i15, 0, childAt.getMeasuredWidth() + i15 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.f33731c * 2) + childCount;
                }
            }
            return;
        }
        if (this.f33729a > 0) {
            i13 = (getMeasuredWidth() - this.f33730b) / (this.f33729a - 1);
        } else {
            i13 = 0;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                int i18 = i16 * i13;
                childAt2.layout(i18, 0, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight());
                i16++;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        this.f33729a = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11).getVisibility() != 8) {
                this.f33729a++;
            }
        }
        this.f33730b = AndroidUtilities.dp(this.d);
        this.f33731c = ((size / getChildCount()) - this.f33730b) / 2;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13).getVisibility() != 8) {
                getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(this.f33730b, 1073741824), i10);
                if (getChildAt(i13).getMeasuredHeight() > i12) {
                    i12 = getChildAt(i13).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(i12, AndroidUtilities.dp(80.0f)));
    }

    public void setChildSize(int i9) {
        this.d = i9;
    }

    public void setUseStartPadding(boolean z10) {
        this.f33732e = z10;
    }
}
