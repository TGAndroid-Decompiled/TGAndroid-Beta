package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rn0 extends rs {
    public final org.telegram.ui.yx f30854f0;

    public rn0(org.telegram.ui.yx yxVar, sl0 sl0Var, Context context, int i10, int i11) {
        super(sl0Var, context, i10, i11, false, null);
        this.f30854f0 = yxVar;
    }

    @Override
    public final void N(boolean z4) {
        boolean z10;
        ArrayList arrayList;
        super.N(z4);
        qn0 qn0Var = this.f30854f0.f26328i0;
        if (!this.W && !this.X && (arrayList = this.Q) != null && arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        qn0Var.e(z10, z4);
        qn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var.f34033e.setVisibility(8);
    }
}
