package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rm extends g9 {
    public final sm E;

    public rm(sm smVar, Context context) {
        super(context);
        this.E = smVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        sm smVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(smVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(smVar.v.K0, 1073741824));
    }
}
