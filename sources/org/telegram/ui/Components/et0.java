package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class et0 extends org.telegram.ui.eo {
    public final yu0 f23752f;

    public et0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f23752f = yu0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f23752f.f30373n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
