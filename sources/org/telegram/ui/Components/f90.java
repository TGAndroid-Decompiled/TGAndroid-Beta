package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f90 extends k9 {
    public final ai.w7 e;

    public f90(ai.w7 w7Var, Context context) {
        super(context, false);
        this.e = w7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int f7;
        int min = Math.min(3, ((h90) this.e.d).f24733w);
        if (min == 0) {
            f7 = 0;
        } else {
            f7 = hg.c.f(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824), i11);
    }
}
