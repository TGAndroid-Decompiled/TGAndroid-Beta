package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b90 extends j9 {
    public final ai.v7 e;

    public b90(ai.v7 v7Var, Context context) {
        super(context, false);
        this.e = v7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int f7;
        int min = Math.min(3, ((d90) this.e.d).f23539w);
        if (min == 0) {
            f7 = 0;
        } else {
            f7 = hg.k0.f(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824), i11);
    }
}
