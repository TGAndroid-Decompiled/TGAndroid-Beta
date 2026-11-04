package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i3 extends ii.c4 {
    public boolean f46042d0;
    public final l3 f46043e0;

    public i3(l3 l3Var, Context context) {
        super(context);
        this.f46043e0 = l3Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.f46042d0 = true;
        setOffsetY(View.MeasureSpec.getSize(i10) * 0.4f);
        this.f46042d0 = false;
        int size = View.MeasureSpec.getSize(i10);
        u3 u3Var = this.f46043e0.M.L;
        if (u3Var != null) {
            u3Var.getClass();
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.f22602m, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.f46042d0) {
            super.requestLayout();
        }
    }
}
