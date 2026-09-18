package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class qt0 extends org.telegram.ui.bo {
    public final kv0 f27740f;

    public qt0(kv0 kv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f27740f = kv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f27740f.f25829n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
