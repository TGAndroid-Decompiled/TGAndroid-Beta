package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k4 extends View {
    public final int f33126a;
    public final a5 f33127b;

    public k4(a5 a5Var, Context context, int i10) {
        super(context);
        this.f33126a = i10;
        this.f33127b = a5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f33126a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                a5 a5Var = this.f33127b;
                a5Var.f32636a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + a5Var.f32636a0.getMeasuredHeight());
                return;
            default:
                a5 a5Var2 = this.f33127b;
                a5Var2.d.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), a5Var2.d.getMeasuredHeight());
                return;
        }
    }
}
