package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.y30;
public final class f0 extends ImageView {
    public final y30 f29285a;

    public f0(y30 y30Var, Context context) {
        super(context);
        this.f29285a = y30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y30 y30Var = this.f29285a;
        y30Var.f29411f0.invalidate();
        y30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
    }
}
