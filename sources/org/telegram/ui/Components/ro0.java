package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ro0 extends ct {
    public final org.telegram.ui.jx f32277k0;

    public ro0(org.telegram.ui.jx jxVar, mm0 mm0Var, Context context, int i10, int i11) {
        super(mm0Var, context, i10, i11, false, null);
        this.f32277k0 = jxVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        qo0 qo0Var = this.f32277k0.f27943n0;
        if (!this.f27253b0 && !this.f27254c0 && (arrayList = this.V) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        qo0Var.e(z11, z10);
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.e.setVisibility(8);
    }
}
