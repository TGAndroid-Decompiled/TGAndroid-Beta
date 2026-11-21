package org.telegram.ui.Components;

import android.view.View;
public final class a51 extends View {
    public int f33309a;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f33309a, 1073741824));
    }

    public void setHeight(int i7) {
        if (this.f33309a == i7) {
            return;
        }
        this.f33309a = i7;
        requestLayout();
    }
}
