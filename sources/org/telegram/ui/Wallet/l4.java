package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l4 extends View {
    public final int f35221a;
    public final c5 f35222b;

    public l4(c5 c5Var, Context context, int i10) {
        super(context);
        this.f35221a = i10;
        this.f35222b = c5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f35221a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                c5 c5Var = this.f35222b;
                c5Var.f34739a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + c5Var.f34739a0.getMeasuredHeight());
                return;
            default:
                c5 c5Var2 = this.f35222b;
                c5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), c5Var2.d.getMeasuredHeight());
                return;
        }
    }
}
