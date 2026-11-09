package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
public final class p2 extends ScrollView {
    public final int f42977a;

    public p2(Context context, int i7) {
        super(context);
        this.f42977a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(this.f42977a)), Integer.MIN_VALUE));
    }
}
