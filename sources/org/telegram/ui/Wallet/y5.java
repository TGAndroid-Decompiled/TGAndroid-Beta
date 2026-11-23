package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class y5 extends View {
    public final int f45354a;
    public final n6 f45355b;

    public y5(n6 n6Var, Context context, int i7) {
        super(context);
        this.f45354a = i7;
        this.f45355b = n6Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f45354a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                n6 n6Var = this.f45355b;
                n6Var.f44665a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + n6Var.f44665a0.getMeasuredHeight());
                return;
            default:
                n6 n6Var2 = this.f45355b;
                n6Var2.f44669e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), n6Var2.f44669e.getMeasuredHeight());
                return;
        }
    }
}
