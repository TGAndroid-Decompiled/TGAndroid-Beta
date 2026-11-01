package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
public final class r2 extends ScrollView {
    public final int f35116a;

    public r2(Context context, int i10) {
        super(context);
        this.f35116a = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(this.f35116a)), Integer.MIN_VALUE));
    }
}
