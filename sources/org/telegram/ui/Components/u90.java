package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u90 extends n9 {
    public final bi.i7 e;

    public u90(bi.i7 i7Var, Context context) {
        super(context, false);
        this.e = i7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int v;
        int min = Math.min(3, ((w90) this.e.d).f30833w);
        if (min == 0) {
            v = 0;
        } else {
            v = com.google.android.gms.internal.play_billing.k3.v(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(v), 1073741824), i11);
    }
}
