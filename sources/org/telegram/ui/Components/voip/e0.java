package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.e40;
public final class e0 extends ImageView {
    public final e40 f29829a;

    public e0(e40 e40Var, Context context) {
        super(context);
        this.f29829a = e40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        e40 e40Var = this.f29829a;
        e40Var.f29957f0.invalidate();
        e40Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
