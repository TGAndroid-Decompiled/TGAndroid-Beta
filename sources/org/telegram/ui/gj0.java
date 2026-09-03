package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class gj0 extends kg.k {
    public boolean G;
    public final jj0 H;

    public gj0(jj0 jj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = jj0Var;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        jj0 jj0Var = this.H;
        jj0Var.f35306i0 = dp;
        jj0Var.f35305h0.G();
        if (this.G != jj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = jj0Var.isKeyboardVisible();
            this.G = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.rl0 rl0Var = jj0Var.d;
                wh.o oVar = new wh.o(jj0Var.getContext(), 2, 0.6f);
                oVar.f5712a = 1;
                oVar.f46707p = AndroidUtilities.dp(36.0f);
                rl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
