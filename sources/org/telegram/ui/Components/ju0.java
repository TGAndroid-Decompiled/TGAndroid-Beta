package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class ju0 extends org.telegram.ui.bo {
    public final dw0 f27756f;

    public ju0(dw0 dw0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f27756f = dw0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f27756f.f25716n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
