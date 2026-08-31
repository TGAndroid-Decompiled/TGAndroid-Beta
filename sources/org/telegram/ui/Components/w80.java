package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w80 extends d9 {
    public final eg.t3 f32681e;

    public w80(eg.t3 t3Var, Context context) {
        super(context, false);
        this.f32681e = t3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int e6;
        int min = Math.min(3, ((y80) this.f32681e.f5496b).f33412w);
        if (min == 0) {
            e6 = 0;
        } else {
            e6 = e2.c.e(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(e6), 1073741824), i11);
    }
}
