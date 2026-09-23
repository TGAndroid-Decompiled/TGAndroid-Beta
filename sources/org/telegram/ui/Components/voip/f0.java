package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.x30;
public final class f0 extends ImageView {
    public final x30 f28915a;

    public f0(x30 x30Var, Context context) {
        super(context);
        this.f28915a = x30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        x30 x30Var = this.f28915a;
        x30Var.f29036f0.invalidate();
        x30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
