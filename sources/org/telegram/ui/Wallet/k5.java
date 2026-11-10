package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class k5 extends View {
    public final int f42719a;
    public final z5 f42720b;

    public k5(z5 z5Var, Context context, int i7) {
        super(context);
        this.f42719a = i7;
        this.f42720b = z5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f42719a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                z5 z5Var = this.f42720b;
                z5Var.Z.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + z5Var.Z.getMeasuredHeight());
                return;
            default:
                z5 z5Var2 = this.f42720b;
                z5Var2.f43448e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), z5Var2.f43448e.getMeasuredHeight());
                return;
        }
    }
}
