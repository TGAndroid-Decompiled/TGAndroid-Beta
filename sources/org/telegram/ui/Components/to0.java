package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class to0 extends jt {
    public final org.telegram.ui.cy f31126i0;

    public to0(org.telegram.ui.cy cyVar, sm0 sm0Var, Context context, int i10, int i11) {
        super(sm0Var, context, i10, i11, false, null);
        this.f31126i0 = cyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        so0 so0Var = this.f31126i0.f26447l0;
        if (!this.Z && !this.f27744a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        so0Var.e(z11, z10);
        so0Var.d.setText(LocaleController.getString(R.string.NoResult));
        so0Var.f25351e.setVisibility(8);
    }
}
