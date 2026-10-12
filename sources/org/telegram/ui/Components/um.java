package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class um extends j9 {
    public final vm E;

    public um(vm vmVar, Context context) {
        super(context);
        this.E = vmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        vm vmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(vmVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(vmVar.v.K0, 1073741824));
    }
}
