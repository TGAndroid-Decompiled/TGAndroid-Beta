package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class v4 extends FrameLayout {
    public final int f23305a;

    public v4(Context context) {
        this(context, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(54.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23305a, 1073741824));
    }

    public v4(Context context, int i10, int i11) {
        super(context);
        this.f23305a = i11;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i10);
        addView(radialProgressView, w7.b6.e(-2, -2, 17));
    }
}
