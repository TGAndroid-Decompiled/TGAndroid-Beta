package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class cm extends y8 {
    public final dm B;

    public cm(dm dmVar, Context context) {
        super(context);
        this.B = dmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        dm dmVar = this.B;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dmVar.v.H0, 1073741824), View.MeasureSpec.makeMeasureSpec(dmVar.v.H0, 1073741824));
    }
}
