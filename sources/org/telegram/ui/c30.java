package org.telegram.ui;

import android.view.View;
public final class c30 extends View {
    public c30(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
    }
}
