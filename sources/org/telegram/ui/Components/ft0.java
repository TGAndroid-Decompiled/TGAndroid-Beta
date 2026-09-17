package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class ft0 extends org.telegram.ui.eo {
    public final zu0 f24013f;

    public ft0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.e5 e5Var, Bundle bundle) {
        super(context, e5Var, bundle);
        this.f24013f = zu0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f24013f.f30637n0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
