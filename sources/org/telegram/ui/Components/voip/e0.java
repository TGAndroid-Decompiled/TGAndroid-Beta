package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.j30;
public final class e0 extends ImageView {
    public final j30 f31441a;

    public e0(j30 j30Var, Context context) {
        super(context);
        this.f31441a = j30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        j30 j30Var = this.f31441a;
        j30Var.f31568f0.invalidate();
        j30Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }
}
