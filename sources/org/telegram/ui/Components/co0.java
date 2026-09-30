package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class co0 extends us {
    public final org.telegram.ui.zx f23390i0;

    public co0(org.telegram.ui.zx zxVar, zl0 zl0Var, Context context, int i10, int i11) {
        super(zl0Var, context, i10, i11, false, null);
        this.f23390i0 = zxVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        bo0 bo0Var = this.f23390i0.f27146l0;
        if (!this.Z && !this.f28917a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        bo0Var.e(z11, z10);
        bo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        bo0Var.e.setVisibility(8);
    }
}
