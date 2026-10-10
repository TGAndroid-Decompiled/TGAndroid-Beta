package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vo0 extends w40 {
    public final org.telegram.ui.dy f31907c0;

    public vo0(org.telegram.ui.dy dyVar, rm0 rm0Var, Context context, int i10) {
        super(rm0Var, context, i10);
        this.f31907c0 = dyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        ro0 ro0Var = this.f31907c0.f26143s0;
        ro0Var.e(false, z10);
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.f25085e.setVisibility(8);
    }
}
