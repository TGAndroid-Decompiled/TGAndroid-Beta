package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vm0 extends hs {
    public final org.telegram.ui.mx f33411e0;

    public vm0(org.telegram.ui.mx mxVar, wk0 wk0Var, Context context, int i9, int i10) {
        super(wk0Var, context, i9, i10, false, null);
        this.f33411e0 = mxVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        um0 um0Var = this.f33411e0.f29142h0;
        if (!this.V && !this.W && (arrayList = this.P) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        um0Var.e(z11, z10);
        um0Var.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var.f28885e.setVisibility(8);
    }
}
