package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.o30;
public final class e0 extends ImageView {
    public final o30 f33890a;

    public e0(o30 o30Var, Context context) {
        super(context);
        this.f33890a = o30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        o30 o30Var = this.f33890a;
        o30Var.f34015f0.invalidate();
        o30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
