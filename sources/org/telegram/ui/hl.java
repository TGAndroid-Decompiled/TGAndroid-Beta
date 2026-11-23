package org.telegram.ui;

import android.content.Context;
public final class hl extends org.telegram.ui.Cells.a0 {
    public final kl f48572f;

    public hl(kl klVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.f48572f = klVar;
    }

    @Override
    public final int getSideMenuWidth() {
        bn bnVar = this.f48572f.R;
        int i7 = bn.f46108md;
        return bnVar.n9();
    }
}
