package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class gs0 extends org.telegram.ui.wn {
    public final au0 f26543f;

    public gs0(au0 au0Var, Context context, org.telegram.ui.ActionBar.z4 z4Var, Bundle bundle) {
        super(context, z4Var, bundle);
        this.f26543f = au0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.t0 t0Var = this.f26543f.f24544p0;
        if (t0Var != null) {
            t0Var.setShowSearchProgress(z10);
        }
    }
}
