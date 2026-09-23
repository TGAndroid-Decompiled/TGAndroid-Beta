package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tn0 extends us {
    public final org.telegram.ui.ry f28271d0;
    public final org.telegram.ui.ay f28272e0;

    public tn0(org.telegram.ui.ay ayVar, ml0 ml0Var, Context context, int i10, int i11, org.telegram.ui.ry ryVar) {
        super(ml0Var, context, i10, i11);
        this.f28272e0 = ayVar;
        this.f28271d0 = ryVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        ln0 ln0Var = this.f28272e0.f30340g0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ln0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f28549b0)) {
            ln0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ln0Var.e.setVisibility(0);
            ln0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
    }
}
