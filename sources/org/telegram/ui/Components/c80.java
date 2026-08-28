package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c80 extends c9 {
    public final gh.h1 f27413e;

    public c80(gh.h1 h1Var, Context context) {
        super(context, false);
        this.f27413e = h1Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int e10;
        int min = Math.min(3, ((e80) this.f27413e.d).f27975w);
        if (min == 0) {
            e10 = 0;
        } else {
            e10 = e2.c.e(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(e10), 1073741824), i10);
    }
}
