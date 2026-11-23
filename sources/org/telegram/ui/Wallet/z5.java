package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class z5 extends View {
    public final int f45482a;
    public final o6 f45483b;

    public z5(o6 o6Var, Context context, int i7) {
        super(context);
        this.f45482a = i7;
        this.f45483b = o6Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f45482a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                o6 o6Var = this.f45483b;
                o6Var.f44793a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + o6Var.f44793a0.getMeasuredHeight());
                return;
            default:
                o6 o6Var2 = this.f45483b;
                o6Var2.f44797e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), o6Var2.f44797e.getMeasuredHeight());
                return;
        }
    }
}
