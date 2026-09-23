package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class et0 extends org.telegram.ui.zn {
    public final yu0 f23749f;

    public et0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context, c5Var, bundle);
        this.f23749f = yu0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f23749f.f30431n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
