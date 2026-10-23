package org.telegram.ui;

import android.view.View;
public final class d30 extends View {
    public d30(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
    }
}
