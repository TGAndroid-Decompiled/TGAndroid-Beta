package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class au0 extends org.telegram.ui.sn {
    public final uv0 f24727f;

    public au0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f24727f = uv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f24727f.f31056n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
