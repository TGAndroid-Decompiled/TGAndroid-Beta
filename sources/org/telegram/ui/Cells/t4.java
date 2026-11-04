package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.ui.Components.RadialProgressView;
public final class t4 extends FrameLayout {
    public final int f30597a;

    public t4(Context context) {
        this(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(54.0f));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30597a, 1073741824));
    }

    public t4(Context context, int i3, int i10) {
        super(context);
        this.f30597a = i10;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setSize(i3);
        addView(radialProgressView, mf.e(-2, -2, 17));
    }
}
