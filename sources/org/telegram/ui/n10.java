package org.telegram.ui;

import android.view.View;
public final class n10 extends View {
    public n10(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
    }
}
