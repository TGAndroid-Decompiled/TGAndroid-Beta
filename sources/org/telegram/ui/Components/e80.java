package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class e80 extends e9 {
    public final di.d1 f34699e;

    public e80(di.d1 d1Var, Context context) {
        super(context, false);
        this.f34699e = d1Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int v;
        int min = Math.min(3, ((g80) this.f34699e.d).f35476x);
        if (min == 0) {
            v = 0;
        } else {
            v = com.google.android.gms.internal.vision.e2.v(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(v), 1073741824), i10);
    }
}
