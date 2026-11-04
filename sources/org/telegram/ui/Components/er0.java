package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class er0 extends org.telegram.ui.ym {
    public final ws0 f33452f;

    public er0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context, q4Var, bundle);
        this.f33452f = ws0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f33452f.f40117q0;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
    }
}
