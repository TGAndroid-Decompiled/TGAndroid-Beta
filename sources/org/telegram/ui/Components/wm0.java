package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class wm0 extends LinearLayout {
    public final int f40103a;
    public final int f40104b;

    public wm0(Context context, int i7, int i10) {
        super(context);
        this.f40103a = i7;
        this.f40104b = i10;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return org.telegram.messenger.g0.L(260.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), this.f40103a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f40104b), View.MeasureSpec.getMode(i10)));
    }
}
