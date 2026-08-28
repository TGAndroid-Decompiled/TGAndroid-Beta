package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class w41 extends FrameLayout {
    public int f34109a;
    public boolean f34110b;

    @Override
    public final void onMeasure(int i9, int i10) {
        View view;
        int i11 = this.f34109a;
        if (getParent() instanceof View) {
            view = (View) getParent();
        } else {
            view = null;
        }
        if (this.f34110b && view != null) {
            i11 = view.getPaddingBottom() + view.getPaddingTop() + i11;
        }
        if (view != null && view.getMeasuredHeight() > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - i11, 1073741824));
        } else if (View.MeasureSpec.getMode(i10) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - i11, 1073741824));
        } else {
            int size = View.MeasureSpec.getSize(i10);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
            measureChildren(makeMeasureSpec, i10);
            int i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                i12 = Math.max(i12, getChildAt(i13).getMeasuredHeight());
            }
            if (size > 0) {
                i12 = Math.min(i12, size - i11);
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        }
    }
}
