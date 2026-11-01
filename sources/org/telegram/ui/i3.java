package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i3 extends xh.i3 {
    public boolean f37931c0;
    public final l3 f37932d0;

    public i3(l3 l3Var, Context context) {
        super(context);
        this.f37932d0 = l3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f37931c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.f37931c0 = false;
        int size = View.MeasureSpec.getSize(i11);
        u3 u3Var = this.f37932d0.L.K;
        if (u3Var != null) {
            u3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.i0.L(56.0f)) - org.telegram.messenger.i0.f16166m, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.f37931c0) {
            super.requestLayout();
        }
    }
}
