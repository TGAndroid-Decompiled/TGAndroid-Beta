package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v4 extends View {
    public final int f34963a;
    public final l5 f34964b;

    public v4(l5 l5Var, Context context, int i10) {
        super(context);
        this.f34963a = i10;
        this.f34964b = l5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f34963a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                l5 l5Var = this.f34964b;
                l5Var.f34480a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + l5Var.f34480a0.getMeasuredHeight());
                return;
            default:
                l5 l5Var2 = this.f34964b;
                l5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), l5Var2.d.getMeasuredHeight());
                return;
        }
    }
}
