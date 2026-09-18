package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qn0 extends e40 {
    public final org.telegram.ui.gy f27362c0;

    public qn0(org.telegram.ui.gy gyVar, ml0 ml0Var, Context context, int i10) {
        super(ml0Var, context, i10);
        this.f27362c0 = gyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        mn0 mn0Var = this.f27362c0.f30567t0;
        mn0Var.e(false, z10);
        mn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var.e.setVisibility(8);
    }
}
