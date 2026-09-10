package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class mm extends f9 {
    public final nm E;

    public mm(nm nmVar, Context context) {
        super(context);
        this.E = nmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        nm nmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(nmVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(nmVar.v.K0, 1073741824));
    }
}
