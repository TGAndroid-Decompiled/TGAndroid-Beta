package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ek0 extends FrameLayout {
    public View f33410a;
    public TextView f33411b;

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f33411b.setText(charSequence);
    }
}
