package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class io0 extends ts {
    public final org.telegram.ui.uy f25161d0;
    public final org.telegram.ui.ey f25162e0;

    public io0(org.telegram.ui.ey eyVar, yl0 yl0Var, Context context, int i10, int i11, org.telegram.ui.uy uyVar) {
        super(yl0Var, context, i10, i11);
        this.f25162e0 = eyVar;
        this.f25161d0 = uyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        ao0 ao0Var = this.f25162e0.f26843h0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ao0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f28529b0)) {
            ao0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ao0Var.e.setVisibility(0);
            ao0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        ao0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var.e.setVisibility(8);
    }
}
