package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class do0 extends g40 {
    public final org.telegram.ui.zx f23725c0;

    public do0(org.telegram.ui.zx zxVar, xl0 xl0Var, Context context, int i10) {
        super(xl0Var, context, i10);
        this.f23725c0 = zxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        zn0 zn0Var = this.f23725c0.f26479s0;
        zn0Var.e(false, z10);
        zn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        zn0Var.e.setVisibility(8);
    }
}
