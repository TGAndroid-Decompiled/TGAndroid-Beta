package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v4 extends View {
    public final int f37401a;
    public final m5 f37402b;

    public v4(m5 m5Var, Context context, int i10) {
        super(context);
        this.f37401a = i10;
        this.f37402b = m5Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f37401a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                m5 m5Var = this.f37402b;
                m5Var.Z.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - AndroidUtilities.dp(24.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(size, AndroidUtilities.dp(36.0f) + m5Var.Z.getMeasuredHeight());
                return;
            default:
                m5 m5Var2 = this.f37402b;
                m5Var2.e.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                setMeasuredDimension(View.MeasureSpec.getSize(i10), m5Var2.e.getMeasuredHeight());
                return;
        }
    }
}
