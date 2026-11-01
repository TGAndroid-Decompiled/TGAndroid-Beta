package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class g0 extends FrameLayout {
    public TextView f21909a;

    public TextView getTextView() {
        return this.f21909a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), 1073741824));
    }

    public void setText(String str) {
        this.f21909a.setText(str);
    }
}
