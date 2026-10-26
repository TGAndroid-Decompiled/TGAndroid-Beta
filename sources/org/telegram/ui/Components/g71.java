package org.telegram.ui.Components;

import android.view.View;
public final class g71 extends View {
    public int f28475a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f28475a, 1073741824));
    }

    public void setHeight(int i10) {
        if (this.f28475a == i10) {
            return;
        }
        this.f28475a = i10;
        requestLayout();
    }
}
