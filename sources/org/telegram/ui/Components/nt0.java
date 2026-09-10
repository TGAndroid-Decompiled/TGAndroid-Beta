package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class nt0 extends org.telegram.ui.go {
    public final iv0 f25594f;

    public nt0(iv0 iv0Var, Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context, f5Var, bundle);
        this.f25594f = iv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f25594f.f24112n0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
