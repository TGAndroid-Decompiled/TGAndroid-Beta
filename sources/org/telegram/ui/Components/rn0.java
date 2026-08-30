package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rn0 extends ps {
    public final org.telegram.ui.xx f28500f0;

    public rn0(org.telegram.ui.xx xxVar, sl0 sl0Var, Context context, int i10, int i11) {
        super(sl0Var, context, i10, i11, false, null);
        this.f28500f0 = xxVar;
    }

    @Override
    public final void N(boolean z4) {
        boolean z10;
        ArrayList arrayList;
        super.N(z4);
        qn0 qn0Var = this.f28500f0.f24325i0;
        if (!this.W && !this.X && (arrayList = this.Q) != null && arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        qn0Var.e(z10, z4);
        qn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var.e.setVisibility(8);
    }
}
