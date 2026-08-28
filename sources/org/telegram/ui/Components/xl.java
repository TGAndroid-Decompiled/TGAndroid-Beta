package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xl extends y8 {
    public final yl A;

    public xl(yl ylVar, Context context) {
        super(context);
        this.A = ylVar;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        yl ylVar = this.A;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ylVar.v.G0, 1073741824), View.MeasureSpec.makeMeasureSpec(ylVar.v.G0, 1073741824));
    }
}
