package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.j30;

public final class d0 extends ImageView {

    public final j30 f33520a;

    public d0(j30 j30Var, Context context) {
        super(context);
        this.f33520a = j30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        j30 j30Var = this.f33520a;
        j30Var.f33649b0.invalidate();
        j30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
