package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k4 extends View {
    public final int f35191a;
    public final b5 f35192b;

    public k4(b5 b5Var, Context context, int i10) {
        super(context);
        this.f35191a = i10;
        this.f35192b = b5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f35191a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                b5 b5Var = this.f35192b;
                b5Var.f34708a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + b5Var.f34708a0.getMeasuredHeight());
                return;
            default:
                b5 b5Var2 = this.f35192b;
                b5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), b5Var2.d.getMeasuredHeight());
                return;
        }
    }
}
