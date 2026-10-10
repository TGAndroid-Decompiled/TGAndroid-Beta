package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class so0 extends jt {
    public final org.telegram.ui.dy f30822i0;

    public so0(org.telegram.ui.dy dyVar, rm0 rm0Var, Context context, int i10, int i11) {
        super(rm0Var, context, i10, i11, false, null);
        this.f30822i0 = dyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        ro0 ro0Var = this.f30822i0.f26137l0;
        if (!this.Z && !this.f27781a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ro0Var.e(z11, z10);
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.f25085e.setVisibility(8);
    }
}
