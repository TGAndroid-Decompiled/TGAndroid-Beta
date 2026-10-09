package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uo0 extends v40 {
    public final org.telegram.ui.dy f31585c0;

    public uo0(org.telegram.ui.dy dyVar, qm0 qm0Var, Context context, int i10) {
        super(qm0Var, context, i10);
        this.f31585c0 = dyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        qo0 qo0Var = this.f31585c0.f25782s0;
        qo0Var.e(false, z10);
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.f24802e.setVisibility(8);
    }
}
