package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class du0 extends org.telegram.ui.un {
    public final xv0 f25735f;

    public du0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.h5 h5Var, Bundle bundle) {
        super(context, h5Var, bundle);
        this.f25735f = xv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f25735f.f32692n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
