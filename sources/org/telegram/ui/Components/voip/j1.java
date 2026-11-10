package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class j1 extends FrameLayout {
    public int f39284a;
    public int f39285b;
    public int f39286c;
    public int d;
    public boolean f39287e;

    public j1(Context context) {
        super(context);
        this.d = 68;
        this.f39287e = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        if (this.f39287e) {
            int childCount = (int) (((getChildCount() - this.f39284a) / 2.0f) * ((this.f39286c * 2) + this.f39285b));
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    int i15 = this.f39286c;
                    childAt.layout(childCount + i15, 0, childAt.getMeasuredWidth() + i15 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.f39286c * 2) + childCount;
                }
            }
            return;
        }
        if (this.f39284a > 0) {
            i13 = (getMeasuredWidth() - this.f39285b) / (this.f39284a - 1);
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f39284a = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11).getVisibility() != 8) {
                this.f39284a++;
            }
        }
        this.f39285b = org.telegram.messenger.g0.L(this.d);
        this.f39286c = ((size / getChildCount()) - this.f39285b) / 2;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13).getVisibility() != 8) {
                getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(this.f39285b, 1073741824), i10);
                if (getChildAt(i13).getMeasuredHeight() > i12) {
                    i12 = getChildAt(i13).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(i12, org.telegram.messenger.g0.L(80.0f)));
    }

    public void setChildSize(int i7) {
        this.d = i7;
    }

    public void setUseStartPadding(boolean z9) {
        this.f39287e = z9;
    }
}
