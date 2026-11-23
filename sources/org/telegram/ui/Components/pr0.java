package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class pr0 extends org.telegram.ui.dn {
    public final it0 f38566f;

    public pr0(it0 it0Var, Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context, r4Var, bundle);
        this.f38566f = it0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f38566f.f36141q0;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
    }
}
