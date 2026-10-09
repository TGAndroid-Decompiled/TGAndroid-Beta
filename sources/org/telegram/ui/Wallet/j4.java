package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j4 extends View {
    public final int f35080a;
    public final a5 f35081b;

    public j4(a5 a5Var, Context context, int i10) {
        super(context);
        this.f35080a = i10;
        this.f35081b = a5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f35080a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                a5 a5Var = this.f35081b;
                a5Var.f34617a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + a5Var.f34617a0.getMeasuredHeight());
                return;
            default:
                a5 a5Var2 = this.f35081b;
                a5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), a5Var2.d.getMeasuredHeight());
                return;
        }
    }
}
