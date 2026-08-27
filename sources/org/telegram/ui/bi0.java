package org.telegram.ui;

public final class bi0 extends org.telegram.ui.Components.wj0 {
    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
    }
}
