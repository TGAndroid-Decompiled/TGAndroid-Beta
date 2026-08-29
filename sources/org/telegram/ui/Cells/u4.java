package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class u4 extends FrameLayout {
    public RadialProgressView f25728a;
    public TextView f25729b;
    public ImageView f25730c;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.dp(56.0f) * 2.5f), 1073741824));
    }

    public void setLoading(boolean z10) {
        int i10;
        int i11;
        RadialProgressView radialProgressView = this.f25728a;
        int i12 = 4;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        radialProgressView.setVisibility(i10);
        TextView textView = this.f25729b;
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        ImageView imageView = this.f25730c;
        if (!z10) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
    }
}
