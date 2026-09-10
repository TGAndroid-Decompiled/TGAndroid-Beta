package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.b40;
public final class f0 extends ImageView {
    public final b40 f28119a;

    public f0(b40 b40Var, Context context) {
        super(context);
        this.f28119a = b40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b40 b40Var = this.f28119a;
        b40Var.f28248f0.invalidate();
        b40Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
    }
}
