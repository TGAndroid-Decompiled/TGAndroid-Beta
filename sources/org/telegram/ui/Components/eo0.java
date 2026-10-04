package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eo0 extends us {
    public final org.telegram.ui.dy f26101i0;

    public eo0(org.telegram.ui.dy dyVar, zl0 zl0Var, Context context, int i10, int i11) {
        super(zl0Var, context, i10, i11, false, null);
        this.f26101i0 = dyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        do0 do0Var = this.f26101i0.f30134n0;
        if (!this.Z && !this.f31437a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        do0Var.e(z11, z10);
        do0Var.d.setText(LocaleController.getString(R.string.NoResult));
        do0Var.f31201e.setVisibility(8);
    }
}
