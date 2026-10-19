package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class zt0 extends org.telegram.ui.sn {
    public final tv0 f33041f;

    public zt0(tv0 tv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f33041f = tv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f33041f.f30715n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
