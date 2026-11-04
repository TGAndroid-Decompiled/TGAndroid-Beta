package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class ym0 extends LinearLayout {
    public final int f40784a;
    public final int f40785b;

    public ym0(Context context, int i3, int i10) {
        super(context);
        this.f40784a = i3;
        this.f40785b = i10;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return org.telegram.messenger.g0.L(260.0f);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), this.f40784a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f40785b), View.MeasureSpec.getMode(i10)));
    }
}
