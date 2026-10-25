package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p90 extends m9 {
    public final bi.t1 e;

    public p90(bi.t1 t1Var, Context context) {
        super(context, false);
        this.e = t1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int w10;
        int min = Math.min(3, ((r90) this.e.d).f32175w);
        if (min == 0) {
            w10 = 0;
        } else {
            w10 = c3.h0.w(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w10), 1073741824), i11);
    }
}
