package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nn0 extends rs {
    public final org.telegram.ui.gy f26508i0;

    public nn0(org.telegram.ui.gy gyVar, ml0 ml0Var, Context context, int i10, int i11) {
        super(ml0Var, context, i10, i11, false, null);
        this.f26508i0 = gyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        mn0 mn0Var = this.f26508i0.m0;
        if (!this.Z && !this.f27681a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        mn0Var.e(z11, z10);
        mn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var.e.setVisibility(8);
    }
}
