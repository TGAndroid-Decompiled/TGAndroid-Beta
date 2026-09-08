package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u80 extends l9 {
    public final bi.e7 f30859e;

    public u80(bi.e7 e7Var, Context context) {
        super(context, false);
        this.f30859e = e7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int w10;
        int min = Math.min(3, ((w80) this.f30859e.d).f32234w);
        if (min == 0) {
            w10 = 0;
        } else {
            w10 = com.google.android.gms.internal.vision.e2.w(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w10), 1073741824), i11);
    }
}
