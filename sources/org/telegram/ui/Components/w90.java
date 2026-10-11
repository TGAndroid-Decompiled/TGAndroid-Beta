package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w90 extends m9 {
    public final ai.x7 f32595e;

    public w90(ai.x7 x7Var, Context context) {
        super(context, false);
        this.f32595e = x7Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int f7;
        int min = Math.min(3, ((y90) this.f32595e.d).f33149w);
        if (min == 0) {
            f7 = 0;
        } else {
            f7 = hg.c.f(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824), i11);
    }
}
