package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class cu0 extends org.telegram.ui.un {
    public final wv0 f25473f;

    public cu0(wv0 wv0Var, Context context, org.telegram.ui.ActionBar.h5 h5Var, Bundle bundle) {
        super(context, h5Var, bundle);
        this.f25473f = wv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f25473f.f32391n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
