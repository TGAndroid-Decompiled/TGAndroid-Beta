package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class un0 extends g40 {
    public final org.telegram.ui.xx Z;

    public un0(org.telegram.ui.xx xxVar, sl0 sl0Var, Context context, int i10) {
        super(sl0Var, context, i10);
        this.Z = xxVar;
    }

    @Override
    public final void N(boolean z4) {
        super.N(z4);
        qn0 qn0Var = this.Z.f24331p0;
        qn0Var.e(false, z4);
        qn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var.e.setVisibility(8);
    }
}
