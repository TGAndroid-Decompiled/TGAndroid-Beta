package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eo0 extends h40 {
    public final org.telegram.ui.zx f24037c0;

    public eo0(org.telegram.ui.zx zxVar, yl0 yl0Var, Context context, int i10) {
        super(yl0Var, context, i10);
        this.f24037c0 = zxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        ao0 ao0Var = this.f24037c0.f26836s0;
        ao0Var.e(false, z10);
        ao0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var.e.setVisibility(8);
    }
}
