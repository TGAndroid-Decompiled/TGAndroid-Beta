package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class pt0 extends org.telegram.ui.bo {
    public final jv0 f27446f;

    public pt0(jv0 jv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f27446f = jv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f27446f.f25509n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
