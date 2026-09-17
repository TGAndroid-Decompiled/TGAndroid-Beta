package org.telegram.ui.Components;

import android.view.View;
public final class w51 extends View {
    public int f29566a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f29566a, 1073741824));
    }

    public void setHeight(int i10) {
        if (this.f29566a == i10) {
            return;
        }
        this.f29566a = i10;
        requestLayout();
    }
}
