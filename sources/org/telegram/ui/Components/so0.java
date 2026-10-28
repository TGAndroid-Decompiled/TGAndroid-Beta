package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class so0 extends ct {
    public final org.telegram.ui.mx f32653k0;

    public so0(org.telegram.ui.mx mxVar, nm0 nm0Var, Context context, int i10, int i11) {
        super(nm0Var, context, i10, i11, false, null);
        this.f32653k0 = mxVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        ro0 ro0Var = this.f32653k0.f28253n0;
        if (!this.f27246b0 && !this.f27247c0 && (arrayList = this.V) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ro0Var.e(z11, z10);
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.e.setVisibility(8);
    }
}
