package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class s1 extends FrameLayout {
    public int f32130a;
    public int f32131b;
    public int f32132c;
    public int d;
    public boolean f32133e;

    public s1(Context context) {
        super(context);
        this.d = 68;
        this.f32133e = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.f32133e) {
            int childCount = (int) (((getChildCount() - this.f32130a) / 2.0f) * ((this.f32132c * 2) + this.f32131b));
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() != 8) {
                    int i16 = this.f32132c;
                    childAt.layout(childCount + i16, 0, childAt.getMeasuredWidth() + i16 + childCount, childAt.getMeasuredHeight());
                    childCount = childAt.getMeasuredWidth() + (this.f32132c * 2) + childCount;
                }
            }
            return;
        }
        if (this.f32130a > 0) {
            i14 = (getMeasuredWidth() - this.f32131b) / (this.f32130a - 1);
        } else {
            i14 = 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                int i19 = i17 * i14;
                childAt2.layout(i19, 0, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight());
                i17++;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f32130a = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12).getVisibility() != 8) {
                this.f32130a++;
            }
        }
        this.f32131b = AndroidUtilities.dp(this.d);
        this.f32132c = ((size / getChildCount()) - this.f32131b) / 2;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            if (getChildAt(i14).getVisibility() != 8) {
                getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(this.f32131b, 1073741824), i11);
                if (getChildAt(i14).getMeasuredHeight() > i13) {
                    i13 = getChildAt(i14).getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, Math.max(i13, AndroidUtilities.dp(80.0f)));
    }

    public void setChildSize(int i10) {
        this.d = i10;
    }

    public void setUseStartPadding(boolean z10) {
        this.f32133e = z10;
    }
}
