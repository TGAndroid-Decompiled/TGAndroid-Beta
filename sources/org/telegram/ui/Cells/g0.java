package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class g0 extends FrameLayout {
    public TextView f29253a;

    public TextView getTextView() {
        return this.f29253a;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    public void setText(String str) {
        this.f29253a.setText(str);
    }
}
