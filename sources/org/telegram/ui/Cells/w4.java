package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.gb1;
public final class w4 extends FrameLayout {
    public final int f25631a;

    public w4(Context context) {
        this(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(54.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25631a, 1073741824));
    }

    public w4(Context context, int i10, int i11) {
        super(context);
        this.f25631a = i11;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i10);
        addView(radialProgressView, gb1.i(-2, -2, 17));
    }
}
