package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.x30;
public final class d0 extends ImageView {
    public final x30 f29565a;

    public d0(x30 x30Var, Context context) {
        super(context);
        this.f29565a = x30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        x30 x30Var = this.f29565a;
        x30Var.f29688c0.invalidate();
        x30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
