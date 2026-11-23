package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h3 extends ki.r3 {
    public boolean f48214d0;
    public final k3 f48215e0;

    public h3(k3 k3Var, Context context) {
        super(context);
        this.f48215e0 = k3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f48214d0 = true;
        setOffsetY(View.MeasureSpec.getSize(i10) * 0.4f);
        this.f48214d0 = false;
        int size = View.MeasureSpec.getSize(i10);
        t3 t3Var = this.f48215e0.M.L;
        if (t3Var != null) {
            t3Var.getClass();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.f24040m, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (!this.f48214d0) {
            super.requestLayout();
        }
    }
}
