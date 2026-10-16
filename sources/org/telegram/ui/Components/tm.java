package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class tm extends j9 {
    public final um E;

    public tm(um umVar, Context context) {
        super(context);
        this.E = umVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        um umVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(umVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(umVar.v.K0, 1073741824));
    }
}
