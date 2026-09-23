package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u80 extends k9 {
    public final ai.w7 e;

    public u80(ai.w7 w7Var, Context context) {
        super(context, false);
        this.e = w7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int g10;
        int min = Math.min(3, ((w80) this.e.d).f29574w);
        if (min == 0) {
            g10 = 0;
        } else {
            g10 = hg.c.g(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(g10), 1073741824), i11);
    }
}
