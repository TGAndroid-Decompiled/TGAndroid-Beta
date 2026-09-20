package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zn0 extends rs {
    public final org.telegram.ui.ey f30886i0;

    public zn0(org.telegram.ui.ey eyVar, vl0 vl0Var, Context context, int i10, int i11) {
        super(vl0Var, context, i10, i11, false, null);
        this.f30886i0 = eyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        yn0 yn0Var = this.f30886i0.m0;
        if (!this.Z && !this.f27947a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        yn0Var.e(z11, z10);
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
    }
}
