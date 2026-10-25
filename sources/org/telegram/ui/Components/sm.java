package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sm extends i9 {
    public final tm E;

    public sm(tm tmVar, Context context) {
        super(context);
        this.E = tmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        tm tmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tmVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(tmVar.v.K0, 1073741824));
    }
}
