package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class an0 extends t30 {
    public final org.telegram.ui.px Y;

    public an0(org.telegram.ui.px pxVar, zk0 zk0Var, Context context, int i10) {
        super(zk0Var, context, i10);
        this.Y = pxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        wm0 wm0Var = this.Y.f29755o0;
        wm0Var.e(false, z10);
        wm0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wm0Var.f29506e.setVisibility(8);
    }
}
