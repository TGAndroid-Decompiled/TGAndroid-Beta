package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class h80 extends u8 {
    public final jg.a3 e;

    public h80(jg.a3 a3Var, Context context) {
        super(context, false);
        this.e = a3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int e;
        int min = Math.min(3, ((j80) this.e.f9891b).f27309x);
        if (min == 0) {
            e = 0;
        } else {
            e = i0.a.e(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(e), 1073741824), i11);
    }
}
