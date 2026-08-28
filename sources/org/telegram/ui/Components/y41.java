package org.telegram.ui.Components;

import android.view.View;
public final class y41 extends View {
    public int f34851a;

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f34851a, 1073741824));
    }

    public void setHeight(int i9) {
        if (this.f34851a == i9) {
            return;
        }
        this.f34851a = i9;
        requestLayout();
    }
}
