package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class h5 extends View {
    public final int f42546a;
    public final w5 f42547b;

    public h5(w5 w5Var, Context context, int i7) {
        super(context);
        this.f42546a = i7;
        this.f42547b = w5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f42546a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                w5 w5Var = this.f42547b;
                w5Var.Z.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + w5Var.Z.getMeasuredHeight());
                return;
            default:
                w5 w5Var2 = this.f42547b;
                w5Var2.f43253e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), w5Var2.f43253e.getMeasuredHeight());
                return;
        }
    }
}
