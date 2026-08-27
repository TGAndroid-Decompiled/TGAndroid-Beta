package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

public final class t4 extends FrameLayout {

    public RadialProgressView f25668a;

    public TextView f25669b;

    public ImageView f25670c;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.dp(56.0f) * 2.5f), 1073741824));
    }

    public void setLoading(boolean z10) {
        this.f25668a.setVisibility(z10 ? 0 : 4);
        this.f25669b.setVisibility(z10 ? 4 : 0);
        this.f25670c.setVisibility(z10 ? 4 : 0);
    }
}
