package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class gr0 extends org.telegram.ui.cn {
    public final ys0 f35046f;

    public gr0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.o4 o4Var, Bundle bundle) {
        super(context, o4Var, bundle);
        this.f35046f = ys0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f35046f.f42127q0;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
    }
}
