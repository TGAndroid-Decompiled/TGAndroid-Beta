package org.telegram.ui;
public final class mf0 extends org.telegram.ui.Components.li0 {
    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
    }
}
