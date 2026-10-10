package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class iu0 extends org.telegram.ui.bo {
    public final cw0 f27460f;

    public iu0(cw0 cw0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f27460f = cw0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f27460f.f25455n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
