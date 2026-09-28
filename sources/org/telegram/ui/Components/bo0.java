package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bo0 extends ts {
    public final org.telegram.ui.zx f23076i0;

    public bo0(org.telegram.ui.zx zxVar, yl0 yl0Var, Context context, int i10, int i11) {
        super(yl0Var, context, i10, i11, false, null);
        this.f23076i0 = zxVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        ao0 ao0Var = this.f23076i0.f26829l0;
        if (!this.Z && !this.f28616a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ao0Var.e(z11, z10);
        ao0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var.e.setVisibility(8);
    }
}
