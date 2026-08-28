package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ym0 extends o30 {
    public final org.telegram.ui.mx Y;

    public ym0(org.telegram.ui.mx mxVar, wk0 wk0Var, Context context, int i9) {
        super(wk0Var, context, i9);
        this.Y = mxVar;
    }

    @Override
    public final void N(boolean z10) {
        super.N(z10);
        um0 um0Var = this.Y.f29148o0;
        um0Var.e(false, z10);
        um0Var.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var.f28885e.setVisibility(8);
    }
}
