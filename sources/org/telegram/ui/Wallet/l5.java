package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
public final class l5 extends View {
    public final int f34844a;
    public final b6 f34845b;

    public l5(b6 b6Var, Context context, int i10) {
        super(context);
        this.f34844a = i10;
        this.f34845b = b6Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f34844a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                b6 b6Var = this.f34845b;
                b6Var.Z.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.i0.L(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, org.telegram.messenger.i0.L(36.0f) + b6Var.Z.getMeasuredHeight());
                return;
            default:
                b6 b6Var2 = this.f34845b;
                b6Var2.e.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), b6Var2.e.getMeasuredHeight());
                return;
        }
    }
}
