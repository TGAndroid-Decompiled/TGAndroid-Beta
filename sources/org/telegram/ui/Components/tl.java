package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

public final class tl extends x8 {
    public final ul A;

    public tl(ul ulVar, Context context) {
        super(context);
        this.A = ulVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ul ulVar = this.A;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ulVar.v.G0, 1073741824), View.MeasureSpec.makeMeasureSpec(ulVar.v.G0, 1073741824));
    }
}
