package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qn0 extends os {
    public final org.telegram.ui.zx f28219f0;

    public qn0(org.telegram.ui.zx zxVar, rl0 rl0Var, Context context, int i10, int i11) {
        super(rl0Var, context, i10, i11, false, null);
        this.f28219f0 = zxVar;
    }

    @Override
    public final void N(boolean z4) {
        boolean z10;
        ArrayList arrayList;
        super.N(z4);
        pn0 pn0Var = this.f28219f0.f23991i0;
        if (!this.W && !this.X && (arrayList = this.Q) != null && arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        pn0Var.e(z10, z4);
        pn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var.e.setVisibility(8);
    }
}
