package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
public final class o2 extends ScrollView {
    public final int f44222a;

    public o2(Context context, int i7) {
        super(context);
        this.f44222a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(this.f44222a)), Integer.MIN_VALUE));
    }
}
