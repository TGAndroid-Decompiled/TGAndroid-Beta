package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.m30;
public final class e0 extends ImageView {
    public final m30 f33785a;

    public e0(m30 m30Var, Context context) {
        super(context);
        this.f33785a = m30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        m30 m30Var = this.f33785a;
        m30Var.f33910f0.invalidate();
        m30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
