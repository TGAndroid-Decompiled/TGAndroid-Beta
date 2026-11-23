package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class im extends a9 {
    public final jm F;

    public im(jm jmVar, Context context) {
        super(context);
        this.F = jmVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        jm jmVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(jmVar.f36561w.L0, 1073741824), View.MeasureSpec.makeMeasureSpec(jmVar.f36561w.L0, 1073741824));
    }
}
