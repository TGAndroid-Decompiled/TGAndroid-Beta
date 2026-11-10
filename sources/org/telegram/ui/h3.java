package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h3 extends hi.b4 {
    public boolean f46215c0;
    public final k3 f46216d0;

    public h3(k3 k3Var, Context context) {
        super(context);
        this.f46216d0 = k3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f46215c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i10) * 0.4f);
        this.f46215c0 = false;
        int size = View.MeasureSpec.getSize(i10);
        t3 t3Var = this.f46216d0.L.K;
        if (t3Var != null) {
            t3Var.getClass();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.f22561m, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.f46215c0) {
            super.requestLayout();
        }
    }
}
