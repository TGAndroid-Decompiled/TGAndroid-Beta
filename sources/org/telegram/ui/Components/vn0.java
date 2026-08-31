package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vn0 extends i40 {
    public final org.telegram.ui.yx Z;

    public vn0(org.telegram.ui.yx yxVar, tl0 tl0Var, Context context, int i10) {
        super(tl0Var, context, i10);
        this.Z = yxVar;
    }

    @Override
    public final void N(boolean z4) {
        super.N(z4);
        rn0 rn0Var = this.Z.f26611p0;
        rn0Var.e(false, z4);
        rn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        rn0Var.f25364e.setVisibility(8);
    }
}
