package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class gu0 extends org.telegram.ui.yn {
    public final bw0 f28758f;

    public gu0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context, j5Var, bundle);
        this.f28758f = bw0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f28758f.f26971p0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
