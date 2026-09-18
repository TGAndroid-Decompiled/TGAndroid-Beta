package org.telegram.ui.Components;

import android.view.View;
public final class k61 extends View {
    public int f25597a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25597a, 1073741824));
    }

    public void setHeight(int i10) {
        if (this.f25597a == i10) {
            return;
        }
        this.f25597a = i10;
        requestLayout();
    }
}
