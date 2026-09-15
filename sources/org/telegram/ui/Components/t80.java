package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t80 extends i9 {
    public final ai.v7 e;

    public t80(ai.v7 v7Var, Context context) {
        super(context, false);
        this.e = v7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int g10;
        int min = Math.min(3, ((v80) this.e.d).f28661w);
        if (min == 0) {
            g10 = 0;
        } else {
            g10 = hg.k0.g(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(g10), 1073741824), i11);
    }
}
