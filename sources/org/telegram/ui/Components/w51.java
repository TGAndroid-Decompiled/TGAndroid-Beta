package org.telegram.ui.Components;

import android.view.View;
public final class w51 extends View {
    public int f32648a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32648a, 1073741824));
    }

    public void setHeight(int i10) {
        if (this.f32648a == i10) {
            return;
        }
        this.f32648a = i10;
        requestLayout();
    }
}
