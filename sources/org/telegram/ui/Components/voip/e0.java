package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.a40;
public final class e0 extends ImageView {
    public final a40 f31494a;

    public e0(a40 a40Var, Context context) {
        super(context);
        this.f31494a = a40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a40 a40Var = this.f31494a;
        a40Var.f31632f0.invalidate();
        a40Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
