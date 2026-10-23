package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.k30;
public final class e0 extends ImageView {
    public final k30 f31580a;

    public e0(k30 k30Var, Context context) {
        super(context);
        this.f31580a = k30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        k30 k30Var = this.f31580a;
        k30Var.f31707f0.invalidate();
        k30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
