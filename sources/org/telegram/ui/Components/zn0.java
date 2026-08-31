package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zn0 extends ts {
    public final org.telegram.ui.py f33930a0;
    public final org.telegram.ui.yx f33931b0;

    public zn0(org.telegram.ui.yx yxVar, tl0 tl0Var, Context context, int i10, int i11, org.telegram.ui.py pyVar) {
        super(tl0Var, context, i10, i11);
        this.f33931b0 = yxVar;
        this.f33930a0 = pyVar;
    }

    @Override
    public final void N(boolean z4) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z4);
        rn0 rn0Var = this.f33931b0.f26600d0;
        if (!this.T && !this.U && (arrayList = this.M) != null && arrayList.isEmpty() && (arrayList2 = this.N) != null && arrayList2.isEmpty() && (arrayList3 = this.P) != null && arrayList3.isEmpty() && (arrayList4 = this.O) != null && arrayList4.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        rn0Var.e(z10, z4);
        if (TextUtils.isEmpty(this.Y)) {
            rn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            rn0Var.f25364e.setVisibility(0);
            rn0Var.f25364e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        rn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        rn0Var.f25364e.setVisibility(8);
    }
}
