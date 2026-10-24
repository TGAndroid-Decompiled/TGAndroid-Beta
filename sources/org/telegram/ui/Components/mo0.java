package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mo0 extends ys {
    public final org.telegram.ui.nx f28664k0;

    public mo0(org.telegram.ui.nx nxVar, lm0 lm0Var, Context context, int i10, int i11) {
        super(lm0Var, context, i10, i11, false, null);
        this.f28664k0 = nxVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        lo0 lo0Var = this.f28664k0.f33313l0;
        if (!this.f33032b0 && !this.f33033c0 && (arrayList = this.V) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        lo0Var.e(z11, z10);
        lo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        lo0Var.e.setVisibility(8);
    }
}
