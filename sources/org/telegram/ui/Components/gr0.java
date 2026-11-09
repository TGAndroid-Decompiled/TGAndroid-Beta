package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class gr0 extends org.telegram.ui.en {
    public final zs0 f34044f;

    public gr0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context, q4Var, bundle);
        this.f34044f = zs0Var;
    }

    @Override
    public final void b(boolean z9) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f34044f.f41103p0;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z9);
        }
    }
}
