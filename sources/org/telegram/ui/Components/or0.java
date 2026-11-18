package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class or0 extends org.telegram.ui.dn {
    public final gt0 f38164f;

    public or0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.s4 s4Var, Bundle bundle) {
        super(context, s4Var, bundle);
        this.f38164f = gt0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f38164f.f35617q0;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z10);
        }
    }
}
