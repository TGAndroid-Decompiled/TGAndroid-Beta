package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y4 extends View {
    public final int f35140a;
    public final o5 f35141b;

    public y4(o5 o5Var, Context context, int i10) {
        super(context);
        this.f35140a = i10;
        this.f35141b = o5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f35140a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                o5 o5Var = this.f35141b;
                o5Var.Y.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + o5Var.Y.getMeasuredHeight());
                return;
            default:
                o5 o5Var2 = this.f35141b;
                o5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), o5Var2.d.getMeasuredHeight());
                return;
        }
    }
}
