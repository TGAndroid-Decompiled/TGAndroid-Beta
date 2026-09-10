package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xn0 extends o40 {
    public final org.telegram.ui.gy f29108c0;

    public xn0(org.telegram.ui.gy gyVar, vl0 vl0Var, Context context, int i10) {
        super(vl0Var, context, i10);
        this.f29108c0 = gyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        tn0 tn0Var = this.f29108c0.f23729s0;
        tn0Var.e(false, z10);
        tn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var.e.setVisibility(8);
    }
}
