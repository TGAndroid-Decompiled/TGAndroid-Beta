package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uo0 extends ct {
    public final org.telegram.ui.ey f31194f0;
    public final org.telegram.ui.nx f31195g0;

    public uo0(org.telegram.ui.nx nxVar, mm0 mm0Var, Context context, int i10, int i11, org.telegram.ui.ey eyVar) {
        super(mm0Var, context, i10, i11);
        this.f31195g0 = nxVar;
        this.f31194f0 = eyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        mo0 mo0Var = this.f31195g0.f24804g0;
        if (!this.Y && !this.Z && (arrayList = this.R) != null && arrayList.isEmpty() && (arrayList2 = this.S) != null && arrayList2.isEmpty() && (arrayList3 = this.U) != null && arrayList3.isEmpty() && (arrayList4 = this.T) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        mo0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f25421d0)) {
            mo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            mo0Var.e.setVisibility(0);
            mo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
    }
}
