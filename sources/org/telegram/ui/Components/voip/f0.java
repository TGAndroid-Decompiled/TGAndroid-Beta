package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.c40;
public final class f0 extends ImageView {
    public final c40 f28924a;

    public f0(c40 c40Var, Context context) {
        super(context);
        this.f28924a = c40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c40 c40Var = this.f28924a;
        c40Var.f29045f0.invalidate();
        c40Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
