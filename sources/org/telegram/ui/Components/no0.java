package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class no0 extends et {
    public final org.telegram.ui.iy f27691i0;

    public no0(org.telegram.ui.iy iyVar, mm0 mm0Var, Context context, int i10, int i11) {
        super(mm0Var, context, i10, i11, false, null);
        this.f27691i0 = iyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        mo0 mo0Var = this.f27691i0.f31925l0;
        if (!this.Z && !this.f24786a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        mo0Var.e(z11, z10);
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
    }
}
