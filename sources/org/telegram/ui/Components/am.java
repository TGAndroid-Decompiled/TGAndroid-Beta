package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class am extends q8 {
    public final bm E;

    public am(bm bmVar, Context context) {
        super(context);
        this.E = bmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bm bmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(bmVar.f24837w.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(bmVar.f24837w.K0, 1073741824));
    }
}
