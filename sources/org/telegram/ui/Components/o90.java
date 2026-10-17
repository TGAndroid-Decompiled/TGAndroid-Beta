package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o90 extends k9 {
    public final ai.w1 e;

    public o90(ai.w1 w1Var, Context context) {
        super(context, false);
        this.e = w1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int g10;
        int min = Math.min(3, ((q90) this.e.d).f29604w);
        if (min == 0) {
            g10 = 0;
        } else {
            g10 = i0.a.g(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(g10), 1073741824), i11);
    }
}
