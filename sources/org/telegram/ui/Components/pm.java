package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class pm extends e9 {
    public final qm E;

    public pm(qm qmVar, Context context) {
        super(context);
        this.E = qmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qm qmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(qmVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(qmVar.v.K0, 1073741824));
    }
}
