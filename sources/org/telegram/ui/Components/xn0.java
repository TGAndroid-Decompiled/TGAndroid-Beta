package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class xn0 extends LinearLayout {
    public final int f32615a;
    public final int f32616b;

    public xn0(Context context, int i10, int i11) {
        super(context);
        this.f32615a = i10;
        this.f32616b = i11;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return org.telegram.messenger.i0.L(260.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f32615a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), this.f32616b), View.MeasureSpec.getMode(i11)));
    }
}
