package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z90 extends m9 {
    public final ai.x7 f33304e;

    public z90(ai.x7 x7Var, Context context) {
        super(context, false);
        this.f33304e = x7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int g10;
        int min = Math.min(3, ((ba0) this.f33304e.d).f24600w);
        if (min == 0) {
            g10 = 0;
        } else {
            g10 = hg.c.g(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(g10), 1073741824), i11);
    }
}
