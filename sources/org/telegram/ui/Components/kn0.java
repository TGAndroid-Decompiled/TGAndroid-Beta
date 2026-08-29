package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kn0 extends c40 {
    public final org.telegram.ui.ox Y;

    public kn0(org.telegram.ui.ox oxVar, jl0 jl0Var, Context context, int i10) {
        super(jl0Var, context, i10);
        this.Y = oxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        gn0 gn0Var = this.Y.f33001o0;
        gn0Var.e(false, z10);
        gn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var.f32122e.setVisibility(8);
    }
}
