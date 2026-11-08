package org.telegram.ui.Components;

import android.view.View;
public final class j41 extends View {
    public int f34893a;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f34893a, 1073741824));
    }

    public void setHeight(int i7) {
        if (this.f34893a == i7) {
            return;
        }
        this.f34893a = i7;
        requestLayout();
    }
}
