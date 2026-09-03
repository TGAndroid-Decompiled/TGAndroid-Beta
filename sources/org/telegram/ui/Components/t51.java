package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class t51 extends FrameLayout {
    public int f31276a;
    public boolean f31277b;

    @Override
    public final void onMeasure(int i10, int i11) {
        View view;
        int i12 = this.f31276a;
        if (getParent() instanceof View) {
            view = (View) getParent();
        } else {
            view = null;
        }
        if (this.f31277b && view != null) {
            i12 = view.getPaddingBottom() + view.getPaddingTop() + i12;
        }
        if (view != null && view.getMeasuredHeight() > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - i12, 1073741824));
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - i12, 1073741824));
        } else {
            int size = View.MeasureSpec.getSize(i11);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
            measureChildren(makeMeasureSpec, i11);
            int i13 = 0;
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                i13 = Math.max(i13, getChildAt(i14).getMeasuredHeight());
            }
            if (size > 0) {
                i13 = Math.min(i13, size - i12);
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        }
    }
}
