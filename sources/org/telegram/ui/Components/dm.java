package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dm extends y8 {
    public final em B;

    public dm(em emVar, Context context) {
        super(context);
        this.B = emVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        em emVar = this.B;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(emVar.v.H0, 1073741824), View.MeasureSpec.makeMeasureSpec(emVar.v.H0, 1073741824));
    }
}
