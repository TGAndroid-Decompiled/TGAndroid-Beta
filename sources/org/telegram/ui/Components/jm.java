package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jm extends g9 {
    public final km E;

    public jm(km kmVar, Context context) {
        super(context);
        this.E = kmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        km kmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(kmVar.v.K0, 1073741824), View.MeasureSpec.makeMeasureSpec(kmVar.v.K0, 1073741824));
    }
}
