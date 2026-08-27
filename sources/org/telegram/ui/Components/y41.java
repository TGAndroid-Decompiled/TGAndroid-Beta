package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

public final class y41 extends FrameLayout {

    public int f34808a;

    public boolean f34809b;

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingBottom = this.f34808a;
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (this.f34809b && view != null) {
            paddingBottom = view.getPaddingBottom() + view.getPaddingTop() + paddingBottom;
        }
        if (view != null && view.getMeasuredHeight() > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() - paddingBottom, 1073741824));
            return;
        }
        if (View.MeasureSpec.getMode(i11) != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - paddingBottom, 1073741824));
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        measureChildren(iMakeMeasureSpec, i11);
        int iMin = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            iMin = Math.max(iMin, getChildAt(i12).getMeasuredHeight());
        }
        if (size > 0) {
            iMin = Math.min(iMin, size - paddingBottom);
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }
}
