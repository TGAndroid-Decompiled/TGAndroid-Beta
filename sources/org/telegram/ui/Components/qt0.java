package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class qt0 extends org.telegram.ui.yn {
    public final kv0 f27765f;

    public qt0(kv0 kv0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f27765f = kv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f27765f.f25847n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
