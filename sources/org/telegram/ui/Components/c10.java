package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class c10 extends FrameLayout {
    public View f32416a;
    public TextView f32417b;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f32417b.setText(charSequence);
    }
}
