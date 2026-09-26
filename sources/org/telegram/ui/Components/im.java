package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class im extends g9 {
    public final jm E;

    public im(jm jmVar, Context context) {
        super(context);
        this.E = jmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jm jmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(jmVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(jmVar.v.K0, 1073741824));
    }
}
