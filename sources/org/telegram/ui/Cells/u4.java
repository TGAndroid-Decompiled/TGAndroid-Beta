package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class u4 extends FrameLayout {
    public final int f32051a;

    public u4(Context context) {
        this(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(54.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32051a, 1073741824));
    }

    public u4(Context context, int i7, int i10) {
        super(context);
        this.f32051a = i10;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i7);
        addView(radialProgressView, c8.ma.e(-2, -2, 17));
    }
}
