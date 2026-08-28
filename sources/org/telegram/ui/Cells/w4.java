package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class w4 extends FrameLayout {
    public RadialProgressView f25896a;
    public TextView f25897b;
    public ImageView f25898c;

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.dp(56.0f) * 2.5f), 1073741824));
    }

    public void setLoading(boolean z10) {
        int i9;
        int i10;
        RadialProgressView radialProgressView = this.f25896a;
        int i11 = 4;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        radialProgressView.setVisibility(i9);
        TextView textView = this.f25897b;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        ImageView imageView = this.f25898c;
        if (!z10) {
            i11 = 0;
        }
        imageView.setVisibility(i11);
    }
}
