package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class qr0 extends org.telegram.ui.dn {
    public final jt0 f38983f;

    public qr0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context, r4Var, bundle);
        this.f38983f = jt0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f38983f.f36659q0;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
    }
}
