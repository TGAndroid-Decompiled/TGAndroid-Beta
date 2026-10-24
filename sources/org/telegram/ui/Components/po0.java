package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class po0 extends l40 {
    public final org.telegram.ui.nx f29634e0;

    public po0(org.telegram.ui.nx nxVar, lm0 lm0Var, Context context, int i10) {
        super(lm0Var, context, i10);
        this.f29634e0 = nxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        lo0 lo0Var = this.f29634e0.f33319s0;
        lo0Var.e(false, z10);
        lo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        lo0Var.e.setVisibility(8);
    }
}
