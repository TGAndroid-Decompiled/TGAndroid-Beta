package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qo0 extends r40 {
    public final org.telegram.ui.iy f28341c0;

    public qo0(org.telegram.ui.iy iyVar, mm0 mm0Var, Context context, int i10) {
        super(mm0Var, context, i10);
        this.f28341c0 = iyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        mo0 mo0Var = this.f28341c0.f31634s0;
        mo0Var.e(false, z10);
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
    }
}
