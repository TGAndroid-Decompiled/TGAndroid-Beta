package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gm extends h9 {
    public final hm E;

    public gm(hm hmVar, Context context) {
        super(context);
        this.E = hmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        hm hmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hmVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(hmVar.v.K0, 1073741824));
    }
}
