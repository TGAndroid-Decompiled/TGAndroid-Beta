package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class zm0 extends LinearLayout {
    public final int f42400a;
    public final int f42401b;

    public zm0(Context context, int i7, int i10) {
        super(context);
        this.f42400a = i7;
        this.f42401b = i10;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return org.telegram.messenger.g0.L(260.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), this.f42400a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f42401b), View.MeasureSpec.getMode(i10)));
    }
}
