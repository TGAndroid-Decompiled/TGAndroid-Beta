package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class ks0 extends org.telegram.ui.sn {
    public final eu0 f30238f;

    public ks0(eu0 eu0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f30238f = eu0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f30238f.f28143j0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
