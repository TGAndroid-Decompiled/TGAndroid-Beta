package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rl extends u8 {
    public final sl E;

    public rl(sl slVar, Context context) {
        super(context);
        this.E = slVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        sl slVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(slVar.f38024w.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(slVar.f38024w.K0, 1073741824));
    }
}
