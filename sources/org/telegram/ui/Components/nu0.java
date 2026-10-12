package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class nu0 extends org.telegram.ui.go {
    public final hw0 f28968f;

    public nu0(hw0 hw0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f28968f = hw0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f28968f.f26953n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
