package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class co0 extends f40 {
    public final org.telegram.ui.zx f23367c0;

    public co0(org.telegram.ui.zx zxVar, wl0 wl0Var, Context context, int i10) {
        super(wl0Var, context, i10);
        this.f23367c0 = zxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        yn0 yn0Var = this.f23367c0.f26167s0;
        yn0Var.e(false, z10);
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
    }
}
