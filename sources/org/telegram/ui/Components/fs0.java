package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class fs0 extends org.telegram.ui.wn {
    public final zt0 f26130f;

    public fs0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.z4 z4Var, Bundle bundle) {
        super(context, z4Var, bundle);
        this.f26130f = zt0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.t0 t0Var = this.f26130f.f33216p0;
        if (t0Var != null) {
            t0Var.setShowSearchProgress(z10);
        }
    }
}
