package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xm extends i9 {
    public final ym E;

    public xm(ym ymVar, Context context) {
        super(context);
        this.E = ymVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ym ymVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ymVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(ymVar.v.K0, 1073741824));
    }
}
