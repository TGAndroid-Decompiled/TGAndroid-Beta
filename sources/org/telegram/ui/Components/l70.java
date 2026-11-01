package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class l70 extends FrameLayout {
    public View f28071a;
    public TextView f28072b;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f28072b.setText(charSequence);
    }
}
