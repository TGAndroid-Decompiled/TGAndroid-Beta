package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.y30;
public final class g0 extends ImageView {
    public final y30 f31991a;

    public g0(y30 y30Var, Context context) {
        super(context);
        this.f31991a = y30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y30 y30Var = this.f31991a;
        y30Var.f32122f0.invalidate();
        y30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
