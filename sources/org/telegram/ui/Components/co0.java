package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class co0 extends zs {
    public final org.telegram.ui.wy f22208d0;
    public final org.telegram.ui.gy f22209e0;

    public co0(org.telegram.ui.gy gyVar, vl0 vl0Var, Context context, int i10, int i11, org.telegram.ui.wy wyVar) {
        super(vl0Var, context, i10, i11);
        this.f22209e0 = gyVar;
        this.f22208d0 = wyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        tn0 tn0Var = this.f22209e0.f23718g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        tn0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f29802b0)) {
            tn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            tn0Var.e.setVisibility(0);
            tn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        tn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var.e.setVisibility(8);
    }
}
