package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.v30;
public final class d0 extends ImageView {
    public final v30 f29593a;

    public d0(v30 v30Var, Context context) {
        super(context);
        this.f29593a = v30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        v30 v30Var = this.f29593a;
        v30Var.f29716c0.invalidate();
        v30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
