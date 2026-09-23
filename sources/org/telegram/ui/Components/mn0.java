package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mn0 extends ss {
    public final org.telegram.ui.ay f26247i0;

    public mn0(org.telegram.ui.ay ayVar, ml0 ml0Var, Context context, int i10, int i11) {
        super(ml0Var, context, i10, i11, false, null);
        this.f26247i0 = ayVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        ln0 ln0Var = this.f26247i0.f30345l0;
        if (!this.Z && !this.f27977a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ln0Var.e(z11, z10);
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
    }
}
