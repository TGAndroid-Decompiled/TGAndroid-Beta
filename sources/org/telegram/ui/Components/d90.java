package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d90 extends j9 {
    public final bi.w7 e;

    public d90(bi.w7 w7Var, Context context) {
        super(context, false);
        this.e = w7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int B;
        int min = Math.min(3, ((f90) this.e.d).f22954w);
        if (min == 0) {
            B = 0;
        } else {
            B = hc.b.B(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(B), 1073741824), i11);
    }
}
