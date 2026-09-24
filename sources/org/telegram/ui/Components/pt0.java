package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class pt0 extends org.telegram.ui.yn {
    public final jv0 f27419f;

    public pt0(jv0 jv0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f27419f = jv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f27419f.f25524n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
