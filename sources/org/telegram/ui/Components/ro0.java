package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ro0 extends ht {
    public final org.telegram.ui.dy f30472i0;

    public ro0(org.telegram.ui.dy dyVar, qm0 qm0Var, Context context, int i10, int i11) {
        super(qm0Var, context, i10, i11, false, null);
        this.f30472i0 = dyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        qo0 qo0Var = this.f30472i0.f25776l0;
        if (!this.Z && !this.f27131a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        qo0Var.e(z11, z10);
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.f24802e.setVisibility(8);
    }
}
