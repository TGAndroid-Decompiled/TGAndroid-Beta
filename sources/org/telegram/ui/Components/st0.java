package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class st0 extends org.telegram.ui.yn {
    public final mv0 f28348f;

    public st0(mv0 mv0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f28348f = mv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f28348f.f26430n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
