package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

public final class ms0 extends org.telegram.ui.tn {

    public final hu0 f30745f;

    public ms0(hu0 hu0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f30745f = hu0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f30745f.f29128j0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
