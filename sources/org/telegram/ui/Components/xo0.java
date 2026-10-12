package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xo0 extends kt {
    public final org.telegram.ui.fy f32820i0;

    public xo0(org.telegram.ui.fy fyVar, wm0 wm0Var, Context context, int i10, int i11) {
        super(wm0Var, context, i10, i11, false, null);
        this.f32820i0 = fyVar;
    }

    @Override
    public final void N(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.N(z10);
        wo0 wo0Var = this.f32820i0.f27601l0;
        if (!this.Z && !this.f27938a0 && (arrayList = this.T) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        wo0Var.e(z11, z10);
        wo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wo0Var.f26557e.setVisibility(8);
    }
}
