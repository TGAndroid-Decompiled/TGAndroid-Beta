package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class fr0 extends org.telegram.ui.en {
    public final ys0 f33638f;

    public fr0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context, r4Var, bundle);
        this.f33638f = ys0Var;
    }

    @Override
    public final void b(boolean z9) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f33638f.f40695p0;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z9);
        }
    }
}
