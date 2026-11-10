package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.ui.Components.RadialProgressView;
public final class ma1 extends RadialProgressView {
    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.g0.f22561m / 2;
    }
}
