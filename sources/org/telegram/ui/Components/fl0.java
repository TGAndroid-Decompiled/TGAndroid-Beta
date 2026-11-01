package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class fl0 extends FrameLayout {
    public View f26188a;
    public TextView f26189b;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f26189b.setText(charSequence);
    }
}
