package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
public final class v2 extends ScrollView {
    public final int f45159a;

    public v2(Context context, int i7) {
        super(context);
        this.f45159a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(this.f45159a)), Integer.MIN_VALUE));
    }
}
