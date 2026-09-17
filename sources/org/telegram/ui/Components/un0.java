package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class un0 extends ts {
    public final org.telegram.ui.wy f28453d0;
    public final org.telegram.ui.gy f28454e0;

    public un0(org.telegram.ui.gy gyVar, ml0 ml0Var, Context context, int i10, int i11, org.telegram.ui.wy wyVar) {
        super(ml0Var, context, i10, i11);
        this.f28454e0 = gyVar;
        this.f28453d0 = wyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        mn0 mn0Var = this.f28454e0.f30553h0;
        if (!this.W && !this.X && (arrayList = this.P) != null && arrayList.isEmpty() && (arrayList2 = this.Q) != null && arrayList2.isEmpty() && (arrayList3 = this.S) != null && arrayList3.isEmpty() && (arrayList4 = this.R) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        mn0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f28197b0)) {
            mn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            mn0Var.e.setVisibility(0);
            mn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
            return;
        }
        mn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var.e.setVisibility(8);
    }
}
