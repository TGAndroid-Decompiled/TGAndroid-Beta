package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class wn0 extends LinearLayout {
    public final int f32220a;
    public final int f32221b;

    public wn0(Context context, int i10, int i11) {
        super(context);
        this.f32220a = i10;
        this.f32221b = i11;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return org.telegram.messenger.i0.L(260.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f32220a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), this.f32221b), View.MeasureSpec.getMode(i11)));
    }
}
