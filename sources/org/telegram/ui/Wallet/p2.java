package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
public final class p2 extends ScrollView {
    public final int f43037a;

    public p2(Context context, int i3) {
        super(context);
        this.f43037a = i3;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(this.f43037a)), Integer.MIN_VALUE));
    }
}
