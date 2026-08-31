package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class et0 extends org.telegram.ui.zn {
    public final zu0 f26642f;

    public et0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context, f5Var, bundle);
        this.f26642f = zu0Var;
    }

    @Override
    public final void b(boolean z4) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f26642f.f33986k0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
    }
}
