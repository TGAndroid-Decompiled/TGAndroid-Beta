package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i0 extends FrameLayout {
    public TextView f21195a;

    public TextView getTextView() {
        return this.f21195a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    public void setText(String str) {
        this.f21195a.setText(str);
    }
}
