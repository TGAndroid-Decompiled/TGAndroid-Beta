package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class em extends y8 {
    public final fm B;

    public em(fm fmVar, Context context) {
        super(context);
        this.B = fmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fm fmVar = this.B;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(fmVar.v.H0, 1073741824), View.MeasureSpec.makeMeasureSpec(fmVar.v.H0, 1073741824));
    }
}
