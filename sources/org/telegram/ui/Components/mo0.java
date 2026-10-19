package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mo0 extends n40 {
    public final org.telegram.ui.lx f28578c0;

    public mo0(org.telegram.ui.lx lxVar, im0 im0Var, Context context, int i10) {
        super(im0Var, context, i10);
        this.f28578c0 = lxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        io0 io0Var = this.f28578c0.f31367s0;
        io0Var.e(false, z10);
        io0Var.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var.e.setVisibility(8);
    }
}
