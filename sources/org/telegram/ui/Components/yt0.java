package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class yt0 extends org.telegram.ui.un {
    public final sv0 f32757f;

    public yt0(sv0 sv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f32757f = sv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f32757f.f30369n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
