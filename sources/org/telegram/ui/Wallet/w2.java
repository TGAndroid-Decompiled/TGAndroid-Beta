package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
public final class w2 extends ScrollView {
    public final int f45331a;

    public w2(Context context, int i7) {
        super(context);
        this.f45331a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(this.f45331a)), Integer.MIN_VALUE));
    }
}
