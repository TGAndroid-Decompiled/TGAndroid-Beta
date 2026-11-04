package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class y0 extends FrameLayout {
    public int f39722a;
    public int f39723b;
    public int f39724c;
    public int d;
    public boolean f39725e;

    public y0(Context context) {
        super(context);
        this.d = 68;
        this.f39725e = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        if (this.f39725e) {
            int childCount = (int) (((getChildCount() - this.f39722a) / 2.0f) * ((this.f39724c * 2) + this.f39723b));
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    int i15 = this.f39724c;
                    childAt.layout(childCount + i15, 0, childAt.getMeasuredWidth() + i15 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.f39724c * 2) + childCount;
                }
            }
            return;
        }
        if (this.f39722a > 0) {
            i13 = (getMeasuredWidth() - this.f39723b) / (this.f39722a - 1);
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
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        this.f39722a = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11).getVisibility() != 8) {
                this.f39722a++;
            }
        }
        this.f39723b = org.telegram.messenger.g0.L(this.d);
        this.f39724c = ((size / getChildCount()) - this.f39723b) / 2;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13).getVisibility() != 8) {
                getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(this.f39723b, 1073741824), i10);
                if (getChildAt(i13).getMeasuredHeight() > i12) {
                    i12 = getChildAt(i13).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(i12, org.telegram.messenger.g0.L(80.0f)));
    }

    public void setChildSize(int i3) {
        this.d = i3;
    }

    public void setUseStartPadding(boolean z10) {
        this.f39725e = z10;
    }
}
