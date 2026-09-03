package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class v4 extends FrameLayout {
    public RadialProgressView f22465a;
    public TextView f22466b;
    public ImageView f22467c;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.dp(56.0f) * 2.5f), 1073741824));
    }

    public void setLoading(boolean z4) {
        int i10;
        int i11;
        RadialProgressView radialProgressView = this.f22465a;
        int i12 = 4;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        radialProgressView.setVisibility(i10);
        TextView textView = this.f22466b;
        if (z4) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        ImageView imageView = this.f22467c;
        if (!z4) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
    }
}
