package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class do0 extends h40 {
    public final org.telegram.ui.ay f23705c0;

    public do0(org.telegram.ui.ay ayVar, yl0 yl0Var, Context context, int i10) {
        super(yl0Var, context, i10);
        this.f23705c0 = ayVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        zn0 zn0Var = this.f23705c0.f26512t0;
        zn0Var.e(false, z10);
        zn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        zn0Var.e.setVisibility(8);
    }
}
