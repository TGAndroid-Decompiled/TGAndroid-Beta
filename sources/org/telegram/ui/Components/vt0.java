package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class vt0 extends org.telegram.ui.ao {
    public final pv0 f32353f;

    public vt0(pv0 pv0Var, Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context, c5Var, bundle);
        this.f32353f = pv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f32353f.f29782n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
