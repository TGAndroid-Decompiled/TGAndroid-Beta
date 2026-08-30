package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v80 extends d9 {
    public final dg.v3 e;

    public v80(dg.v3 v3Var, Context context) {
        super(context, false);
        this.e = v3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int e;
        int min = Math.min(3, ((x80) this.e.f4831b).f30610w);
        if (min == 0) {
            e = 0;
        } else {
            e = e2.c.e(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(e), 1073741824), i11);
    }
}
