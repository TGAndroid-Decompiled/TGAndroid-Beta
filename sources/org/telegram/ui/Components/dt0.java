package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class dt0 extends org.telegram.ui.fo {
    public final xu0 f25466f;

    public dt0(xu0 xu0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f25466f = xu0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f25466f.f32707n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
