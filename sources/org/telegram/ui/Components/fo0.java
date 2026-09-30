package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fo0 extends i40 {
    public final org.telegram.ui.zx f24323c0;

    public fo0(org.telegram.ui.zx zxVar, zl0 zl0Var, Context context, int i10) {
        super(zl0Var, context, i10);
        this.f24323c0 = zxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        bo0 bo0Var = this.f24323c0.f27152s0;
        bo0Var.e(false, z10);
        bo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        bo0Var.e.setVisibility(8);
    }
}
