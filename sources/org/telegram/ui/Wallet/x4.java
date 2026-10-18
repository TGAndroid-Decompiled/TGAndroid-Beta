package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends View {
    public final int f35078a;
    public final n5 f35079b;

    public x4(n5 n5Var, Context context, int i10) {
        super(context);
        this.f35078a = i10;
        this.f35079b = n5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f35078a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                n5 n5Var = this.f35079b;
                n5Var.Y.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + n5Var.Y.getMeasuredHeight());
                return;
            default:
                n5 n5Var2 = this.f35079b;
                n5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), n5Var2.d.getMeasuredHeight());
                return;
        }
    }
}
