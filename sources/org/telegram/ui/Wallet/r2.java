package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
public final class r2 extends ScrollView {
    public final int f43091a;

    public r2(Context context, int i7) {
        super(context);
        this.f43091a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(this.f43091a)), Integer.MIN_VALUE));
    }
}
