package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ko0 extends at {
    public final org.telegram.ui.lx f27911i0;

    public ko0(org.telegram.ui.lx lxVar, jm0 jm0Var, Context context, int i10, int i11) {
        super(jm0Var, context, i10, i11, false, null);
        this.f27911i0 = lxVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        jo0 jo0Var = this.f27911i0.f32193l0;
        if (!this.Z && !this.f24715a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        jo0Var.e(z11, z10);
        jo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var.e.setVisibility(8);
    }
}
