package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sn0 extends rs {
    public final org.telegram.ui.yx f31134f0;

    public sn0(org.telegram.ui.yx yxVar, tl0 tl0Var, Context context, int i10, int i11) {
        super(tl0Var, context, i10, i11, false, null);
        this.f31134f0 = yxVar;
    }

    @Override
    public final void N(boolean z4) {
        boolean z10;
        ArrayList arrayList;
        super.N(z4);
        rn0 rn0Var = this.f31134f0.f26605i0;
        if (!this.W && !this.X && (arrayList = this.Q) != null && arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        rn0Var.e(z10, z4);
        rn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        rn0Var.f25364e.setVisibility(8);
    }
}
