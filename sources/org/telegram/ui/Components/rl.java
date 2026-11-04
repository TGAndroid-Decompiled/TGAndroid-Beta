package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rl extends t8 {
    public final sl F;

    public rl(sl slVar, Context context) {
        super(context);
        this.F = slVar;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        sl slVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(slVar.f38055w.L0, 1073741824), View.MeasureSpec.makeMeasureSpec(slVar.f38055w.L0, 1073741824));
    }
}
