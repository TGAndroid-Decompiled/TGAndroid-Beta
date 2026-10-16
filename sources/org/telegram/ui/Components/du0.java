package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class du0 extends org.telegram.ui.ho {
    public final xv0 f24188f;

    public du0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f24188f = xv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f24188f.f31050n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
