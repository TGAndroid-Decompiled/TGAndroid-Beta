package org.telegram.ui.Components;

import android.view.View;
public final class i61 extends View {
    public int f24954a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24954a, 1073741824));
    }

    public void setHeight(int i10) {
        if (this.f24954a == i10) {
            return;
        }
        this.f24954a = i10;
        requestLayout();
    }
}
