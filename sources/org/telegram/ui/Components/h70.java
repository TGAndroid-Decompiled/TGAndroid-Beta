package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h70 extends sm0 {
    public int V2;
    public final u70 W2;

    public h70(u70 u70Var, Context context) {
        super(context, null);
        this.W2 = u70Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        u70 u70Var = this.W2;
        h70 h70Var = u70Var.V;
        if (this.V2 != View.MeasureSpec.getSize(i11)) {
            this.V2 = View.MeasureSpec.getSize(i11);
            u70Var.f31310a0 = true;
            h70Var.setPadding(0, 0, 0, 0);
            u70Var.f31310a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.V2;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.V2 - measuredHeight;
            }
            u70Var.f31310a0 = true;
            h70Var.setPadding(0, i13, 0, 0);
            u70Var.f31310a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.W2.f31310a0) {
            return;
        }
        super.requestLayout();
    }
}
