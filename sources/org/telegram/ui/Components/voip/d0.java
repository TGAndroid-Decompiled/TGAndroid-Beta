package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.g30;
public final class d0 extends ImageView {
    public final g30 f33470a;

    public d0(g30 g30Var, Context context) {
        super(context);
        this.f33470a = g30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        g30 g30Var = this.f33470a;
        g30Var.f33599b0.invalidate();
        g30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
