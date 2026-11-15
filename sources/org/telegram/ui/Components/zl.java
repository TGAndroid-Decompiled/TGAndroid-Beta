package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zl extends s8 {
    public final am F;

    public zl(am amVar, Context context) {
        super(context);
        this.F = amVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        am amVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(amVar.f33023w.L0, 1073741824), View.MeasureSpec.makeMeasureSpec(amVar.f33023w.L0, 1073741824));
    }
}
