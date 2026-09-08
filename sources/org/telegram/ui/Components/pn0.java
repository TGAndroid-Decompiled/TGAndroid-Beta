package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pn0 extends e40 {
    public final org.telegram.ui.ey f29470c0;

    public pn0(org.telegram.ui.ey eyVar, ll0 ll0Var, Context context, int i10) {
        super(ll0Var, context, i10);
        this.f29470c0 = eyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        ln0 ln0Var = this.f29470c0.f32993s0;
        ln0Var.e(false, z10);
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.f32782e.setVisibility(8);
    }
}
