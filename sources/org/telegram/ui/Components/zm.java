package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zm extends i9 {
    public final an E;

    public zm(an anVar, Context context) {
        super(context);
        this.E = anVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        an anVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(anVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(anVar.v.K0, 1073741824));
    }
}
