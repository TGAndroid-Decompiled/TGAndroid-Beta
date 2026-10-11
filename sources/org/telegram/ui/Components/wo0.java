package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wo0 extends w40 {
    public final org.telegram.ui.cy f32698c0;

    public wo0(org.telegram.ui.cy cyVar, sm0 sm0Var, Context context, int i10) {
        super(sm0Var, context, i10);
        this.f32698c0 = cyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        so0 so0Var = this.f32698c0.f26453s0;
        so0Var.e(false, z10);
        so0Var.d.setText(LocaleController.getString(R.string.NoResult));
        so0Var.f25351e.setVisibility(8);
    }
}
