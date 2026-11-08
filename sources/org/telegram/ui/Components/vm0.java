package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class vm0 extends LinearLayout {
    public final int f39039a;
    public final int f39040b;

    public vm0(Context context, int i7, int i10) {
        super(context);
        this.f39039a = i7;
        this.f39040b = i10;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return org.telegram.messenger.g0.L(260.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), this.f39039a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f39040b), View.MeasureSpec.getMode(i10)));
    }
}
