package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hn0 extends ls {
    public final org.telegram.ui.ox f29207e0;

    public hn0(org.telegram.ui.ox oxVar, jl0 jl0Var, Context context, int i10, int i11) {
        super(jl0Var, context, i10, i11, false, null);
        this.f29207e0 = oxVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        gn0 gn0Var = this.f29207e0.f32995h0;
        if (!this.V && !this.W && (arrayList = this.P) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        gn0Var.e(z11, z10);
        gn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var.f32122e.setVisibility(8);
    }
}
