package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class g80 extends b9 {

    public final hh.h1 f28548e;

    public g80(hh.h1 h1Var, Context context) {
        super(context, false);
        this.f28548e = h1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMin = Math.min(3, ((i80) this.f28548e.d).f29277w);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(iMin == 0 ? 0 : i0.a.e(iMin, 1, 20, 32)), 1073741824), i11);
    }
}
