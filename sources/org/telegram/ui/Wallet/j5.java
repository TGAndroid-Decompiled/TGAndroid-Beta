package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class j5 extends View {
    public final int f44015a;
    public final y5 f44016b;

    public j5(y5 y5Var, Context context, int i7) {
        super(context);
        this.f44015a = i7;
        this.f44016b = y5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f44015a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                y5 y5Var = this.f44016b;
                y5Var.f44727a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + y5Var.f44727a0.getMeasuredHeight());
                return;
            default:
                y5 y5Var2 = this.f44016b;
                y5Var2.f44731e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), y5Var2.f44731e.getMeasuredHeight());
                return;
        }
    }
}
