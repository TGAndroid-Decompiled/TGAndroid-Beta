package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.w30;
public final class e0 extends ImageView {
    public final w30 f32017a;

    public e0(w30 w30Var, Context context) {
        super(context);
        this.f32017a = w30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        w30 w30Var = this.f32017a;
        w30Var.f32143c0.invalidate();
        w30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
