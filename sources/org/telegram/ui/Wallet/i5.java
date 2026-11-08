package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class i5 extends View {
    public final int f42627a;
    public final x5 f42628b;

    public i5(x5 x5Var, Context context, int i7) {
        super(context);
        this.f42627a = i7;
        this.f42628b = x5Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f42627a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                x5 x5Var = this.f42628b;
                x5Var.Z.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.g0.L(36.0f) + x5Var.Z.getMeasuredHeight());
                return;
            default:
                x5 x5Var2 = this.f42628b;
                x5Var2.f43335e.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i7), x5Var2.f43335e.getMeasuredHeight());
                return;
        }
    }
}
