package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class no0 extends n40 {
    public final org.telegram.ui.lx f28858c0;

    public no0(org.telegram.ui.lx lxVar, jm0 jm0Var, Context context, int i10) {
        super(jm0Var, context, i10);
        this.f28858c0 = lxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        jo0 jo0Var = this.f28858c0.f32195s0;
        jo0Var.e(false, z10);
        jo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var.e.setVisibility(8);
    }
}
