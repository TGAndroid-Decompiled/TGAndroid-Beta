package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class un0 extends xs {
    public final org.telegram.ui.gy f27723i0;

    public un0(org.telegram.ui.gy gyVar, vl0 vl0Var, Context context, int i10, int i11) {
        super(vl0Var, context, i10, i11, false, null);
        this.f27723i0 = gyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        tn0 tn0Var = this.f27723i0.f23723l0;
        if (!this.Z && !this.f29141a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        tn0Var.e(z11, z10);
        tn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var.e.setVisibility(8);
    }
}
