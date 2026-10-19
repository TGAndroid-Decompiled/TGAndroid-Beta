package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jo0 extends at {
    public final org.telegram.ui.lx f27566i0;

    public jo0(org.telegram.ui.lx lxVar, im0 im0Var, Context context, int i10, int i11) {
        super(im0Var, context, i10, i11, false, null);
        this.f27566i0 = lxVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        io0 io0Var = this.f27566i0.f31361l0;
        if (!this.Z && !this.f24698a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        io0Var.e(z11, z10);
        io0Var.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var.e.setVisibility(8);
    }
}
