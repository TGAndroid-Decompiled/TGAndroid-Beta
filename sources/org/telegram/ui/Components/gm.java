package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gm extends a9 {
    public final hm F;

    public gm(hm hmVar, Context context) {
        super(context);
        this.F = hmVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        hm hmVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hmVar.f35930w.L0, 1073741824), View.MeasureSpec.makeMeasureSpec(hmVar.f35930w.L0, 1073741824));
    }
}
