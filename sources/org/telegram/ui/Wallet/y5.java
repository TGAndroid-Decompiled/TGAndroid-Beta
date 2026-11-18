package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class y5 extends View {
    public final int f45310a;
    public final n6 f45311b;

    public y5(n6 n6Var, Context context, int i7) {
        super(context);
        this.f45310a = i7;
        this.f45311b = n6Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f45310a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                n6 n6Var = this.f45311b;
                n6Var.f44621a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + n6Var.f44621a0.getMeasuredHeight());
                return;
            default:
                n6 n6Var2 = this.f45311b;
                n6Var2.f44625e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), n6Var2.f44625e.getMeasuredHeight());
                return;
        }
    }
}
