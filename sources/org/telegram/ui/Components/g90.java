package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g90 extends k9 {
    public final ai.w7 e;

    public g90(ai.w7 w7Var, Context context) {
        super(context, false);
        this.e = w7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int f7;
        int min = Math.min(3, ((i90) this.e.d).f25062w);
        if (min == 0) {
            f7 = 0;
        } else {
            f7 = hg.k0.f(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824), i11);
    }
}
