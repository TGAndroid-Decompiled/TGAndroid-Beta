package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zo0 extends et {
    public final org.telegram.ui.ey f35405f0;
    public final org.telegram.ui.mx f35406g0;

    public zo0(org.telegram.ui.mx mxVar, nm0 nm0Var, Context context, int i10, int i11, org.telegram.ui.ey eyVar) {
        super(nm0Var, context, i10, i11);
        this.f35406g0 = mxVar;
        this.f35405f0 = eyVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        ro0 ro0Var = this.f35406g0.f28249i0;
        if (!this.Y && !this.Z && (arrayList = this.R) != null && arrayList.isEmpty() && (arrayList2 = this.S) != null && arrayList2.isEmpty() && (arrayList3 = this.U) != null && arrayList3.isEmpty() && (arrayList4 = this.T) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ro0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f27925d0)) {
            ro0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ro0Var.e.setVisibility(0);
            ro0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.e.setVisibility(8);
    }
}
