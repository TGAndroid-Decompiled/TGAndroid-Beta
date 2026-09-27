package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ao0 extends ts {
    public final org.telegram.ui.ay f22727i0;

    public ao0(org.telegram.ui.ay ayVar, yl0 yl0Var, Context context, int i10, int i11) {
        super(yl0Var, context, i10, i11, false, null);
        this.f22727i0 = ayVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        zn0 zn0Var = this.f22727i0.m0;
        if (!this.Z && !this.f28680a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        zn0Var.e(z11, z10);
        zn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        zn0Var.e.setVisibility(8);
    }
}
