package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.h30;
public final class e0 extends ImageView {
    public final h30 f31445a;

    public e0(h30 h30Var, Context context) {
        super(context);
        this.f31445a = h30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        h30 h30Var = this.f31445a;
        h30Var.f31572f0.invalidate();
        h30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
