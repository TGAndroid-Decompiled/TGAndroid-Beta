package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ej0 extends kg.k {
    public boolean G;
    public final hj0 H;

    public ej0(hj0 hj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = hj0Var;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        hj0 hj0Var = this.H;
        hj0Var.f34899i0 = dp;
        hj0Var.f34898h0.G();
        if (this.G != hj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = hj0Var.isKeyboardVisible();
            this.G = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.sl0 sl0Var = hj0Var.d;
                wh.o oVar = new wh.o(hj0Var.getContext(), 2, 0.6f);
                oVar.f5723a = 1;
                oVar.f46638p = AndroidUtilities.dp(36.0f);
                sl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
