package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class pj0 extends wg.h {
    public boolean J;
    public final sj0 K;

    public pj0(sj0 sj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = sj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        sj0 sj0Var = this.K;
        sj0Var.f36705l0 = dp;
        sj0Var.f36704k0.G();
        if (this.J != sj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = sj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.vl0 vl0Var = sj0Var.d;
                ii.o oVar = new ii.o(sj0Var.getContext(), 2, 0.6f);
                oVar.f41760a = 1;
                oVar.f10694p = AndroidUtilities.dp(36.0f);
                vl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
