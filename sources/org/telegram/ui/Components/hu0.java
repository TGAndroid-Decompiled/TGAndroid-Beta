package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class hu0 extends org.telegram.ui.bo {
    public final bw0 f27143f;

    public hu0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f27143f = bw0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f27143f.f25147n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
