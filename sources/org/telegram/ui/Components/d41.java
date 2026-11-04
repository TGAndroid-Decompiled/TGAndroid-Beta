package org.telegram.ui.Components;

import android.view.View;
public final class d41 extends View {
    public int f32934a;

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32934a, 1073741824));
    }

    public void setHeight(int i3) {
        if (this.f32934a == i3) {
            return;
        }
        this.f32934a = i3;
        requestLayout();
    }
}
