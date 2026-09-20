package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class go0 extends ts {
    public final org.telegram.ui.uy f24433d0;
    public final org.telegram.ui.ey f24434e0;

    public go0(org.telegram.ui.ey eyVar, vl0 vl0Var, Context context, int i10, int i11, org.telegram.ui.uy uyVar) {
        super(vl0Var, context, i10, i11);
        this.f24434e0 = eyVar;
        this.f24433d0 = uyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        yn0 yn0Var = this.f24434e0.f26201h0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        yn0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f28436b0)) {
            yn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            yn0Var.e.setVisibility(0);
            yn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
    }
}
