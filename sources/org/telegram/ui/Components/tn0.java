package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tn0 extends h40 {
    public final org.telegram.ui.zx Z;

    public tn0(org.telegram.ui.zx zxVar, rl0 rl0Var, Context context, int i10) {
        super(rl0Var, context, i10);
        this.Z = zxVar;
    }

    @Override
    public final void N(boolean z4) {
        super.N(z4);
        pn0 pn0Var = this.Z.f23997p0;
        pn0Var.e(false, z4);
        pn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var.e.setVisibility(8);
    }
}
