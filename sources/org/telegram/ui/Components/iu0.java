package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class iu0 extends org.telegram.ui.bo {
    public final cw0 f27517f;

    public iu0(cw0 cw0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f27517f = cw0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f27517f.f25517n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
