package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ap0 extends y40 {
    public final org.telegram.ui.fy f24453c0;

    public ap0(org.telegram.ui.fy fyVar, wm0 wm0Var, Context context, int i10) {
        super(wm0Var, context, i10);
        this.f24453c0 = fyVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        wo0 wo0Var = this.f24453c0.f27614s0;
        wo0Var.e(false, z10);
        wo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wo0Var.f26561e.setVisibility(8);
    }
}
