package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pn0 extends f40 {
    public final org.telegram.ui.ay f27112c0;

    public pn0(org.telegram.ui.ay ayVar, ml0 ml0Var, Context context, int i10) {
        super(ml0Var, context, i10);
        this.f27112c0 = ayVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        ln0 ln0Var = this.f27112c0.f30351s0;
        ln0Var.e(false, z10);
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
    }
}
