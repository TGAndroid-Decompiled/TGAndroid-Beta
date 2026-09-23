package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hm extends g9 {
    public final im E;

    public hm(im imVar, Context context) {
        super(context);
        this.E = imVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        im imVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(imVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(imVar.v.K0, 1073741824));
    }
}
