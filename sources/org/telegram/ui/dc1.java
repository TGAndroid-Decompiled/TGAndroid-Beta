package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.ui.Components.RadialProgressView;
public final class dc1 extends RadialProgressView {
    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = org.telegram.messenger.i0.f16020m / 2;
    }
}
