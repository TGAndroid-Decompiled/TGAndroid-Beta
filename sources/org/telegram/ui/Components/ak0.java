package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ak0 extends FrameLayout {
    public View f31873a;
    public TextView f31874b;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f31874b.setText(charSequence);
    }
}
