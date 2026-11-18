package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class m1 extends FrameLayout {
    public int f41041a;
    public int f41042b;
    public int f41043c;
    public int d;
    public boolean f41044e;

    public m1(Context context) {
        super(context);
        this.d = 68;
        this.f41044e = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        if (this.f41044e) {
            int childCount = (int) (((getChildCount() - this.f41041a) / 2.0f) * ((this.f41043c * 2) + this.f41042b));
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    int i15 = this.f41043c;
                    childAt.layout(childCount + i15, 0, childAt.getMeasuredWidth() + i15 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.f41043c * 2) + childCount;
                }
            }
            return;
        }
        if (this.f41041a > 0) {
            i13 = (getMeasuredWidth() - this.f41042b) / (this.f41041a - 1);
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
        this.f41041a = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11).getVisibility() != 8) {
                this.f41041a++;
            }
        }
        this.f41042b = org.telegram.messenger.g0.L(this.d);
        this.f41043c = ((size / getChildCount()) - this.f41042b) / 2;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13).getVisibility() != 8) {
                getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(this.f41042b, 1073741824), i10);
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

    public void setUseStartPadding(boolean z10) {
        this.f41044e = z10;
    }
}
