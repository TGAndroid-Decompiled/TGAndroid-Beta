package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class to0 extends at {
    public final org.telegram.ui.ey f30869f0;
    public final org.telegram.ui.nx f30870g0;

    public to0(org.telegram.ui.nx nxVar, lm0 lm0Var, Context context, int i10, int i11, org.telegram.ui.ey eyVar) {
        super(lm0Var, context, i10, i11);
        this.f30870g0 = nxVar;
        this.f30869f0 = eyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        lo0 lo0Var = this.f30870g0.f33308g0;
        if (!this.Y && !this.Z && (arrayList = this.R) != null && arrayList.isEmpty() && (arrayList2 = this.S) != null && arrayList2.isEmpty() && (arrayList3 = this.U) != null && arrayList3.isEmpty() && (arrayList4 = this.T) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        lo0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f24800d0)) {
            lo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            lo0Var.e.setVisibility(0);
            lo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        lo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        lo0Var.e.setVisibility(8);
    }
}
