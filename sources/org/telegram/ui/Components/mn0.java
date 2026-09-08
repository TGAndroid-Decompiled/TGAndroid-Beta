package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mn0 extends qs {
    public final org.telegram.ui.ey f28501i0;

    public mn0(org.telegram.ui.ey eyVar, ll0 ll0Var, Context context, int i10, int i11) {
        super(ll0Var, context, i10, i11, false, null);
        this.f28501i0 = eyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        ln0 ln0Var = this.f28501i0.f32987l0;
        if (!this.Z && !this.f29832a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ln0Var.e(z11, z10);
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.f32782e.setVisibility(8);
    }
}
