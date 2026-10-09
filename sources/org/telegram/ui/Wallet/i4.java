package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i4 extends View {
    public final int f35009a;
    public final z4 f35010b;

    public i4(z4 z4Var, Context context, int i10) {
        super(context);
        this.f35009a = i10;
        this.f35010b = z4Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f35009a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                z4 z4Var = this.f35010b;
                z4Var.f35713a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + z4Var.f35713a0.getMeasuredHeight());
                return;
            default:
                z4 z4Var2 = this.f35010b;
                z4Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), z4Var2.d.getMeasuredHeight());
                return;
        }
    }
}
