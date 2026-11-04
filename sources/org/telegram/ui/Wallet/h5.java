package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class h5 extends View {
    public final int f42615a;
    public final w5 f42616b;

    public h5(w5 w5Var, Context context, int i3) {
        super(context);
        this.f42615a = i3;
        this.f42616b = w5Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f42615a) {
            case 0:
                int size = View.MeasureSpec.getSize(i3);
                w5 w5Var = this.f42616b;
                w5Var.f43319a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + w5Var.f43319a0.getMeasuredHeight());
                return;
            default:
                w5 w5Var2 = this.f42616b;
                w5Var2.f43323e.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i3), w5Var2.f43323e.getMeasuredHeight());
                return;
        }
    }
}
