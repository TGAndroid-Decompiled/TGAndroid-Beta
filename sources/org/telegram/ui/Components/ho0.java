package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ho0 extends i40 {
    public final org.telegram.ui.dy f27205c0;

    public ho0(org.telegram.ui.dy dyVar, zl0 zl0Var, Context context, int i10) {
        super(zl0Var, context, i10);
        this.f27205c0 = dyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        do0 do0Var = this.f27205c0.f30134t0;
        do0Var.e(false, z10);
        do0Var.d.setText(LocaleController.getString(R.string.NoResult));
        do0Var.f31195e.setVisibility(8);
    }
}
