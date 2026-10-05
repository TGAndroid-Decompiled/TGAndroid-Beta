package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class wt0 extends org.telegram.ui.ao {
    public final qv0 f32708f;

    public wt0(qv0 qv0Var, Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context, c5Var, bundle);
        this.f32708f = qv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f32708f.f30244n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
