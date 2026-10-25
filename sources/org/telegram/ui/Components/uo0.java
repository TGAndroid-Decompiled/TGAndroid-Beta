package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uo0 extends p40 {
    public final org.telegram.ui.jx f33467e0;

    public uo0(org.telegram.ui.jx jxVar, mm0 mm0Var, Context context, int i10) {
        super(mm0Var, context, i10);
        this.f33467e0 = jxVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        qo0 qo0Var = this.f33467e0.f27950u0;
        qo0Var.e(false, z10);
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.e.setVisibility(8);
    }
}
