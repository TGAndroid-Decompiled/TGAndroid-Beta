package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class bm extends d9 {
    public final cm A;

    public bm(cm cmVar, Context context) {
        super(context);
        this.A = cmVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        cm cmVar = this.A;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(cmVar.v.G0, 1073741824), View.MeasureSpec.makeMeasureSpec(cmVar.v.G0, 1073741824));
    }
}
