package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vo0 extends p40 {
    public final org.telegram.ui.mx f33812e0;

    public vo0(org.telegram.ui.mx mxVar, nm0 nm0Var, Context context, int i10) {
        super(nm0Var, context, i10);
        this.f33812e0 = mxVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        ro0 ro0Var = this.f33812e0.f28260u0;
        ro0Var.e(false, z10);
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.e.setVisibility(8);
    }
}
