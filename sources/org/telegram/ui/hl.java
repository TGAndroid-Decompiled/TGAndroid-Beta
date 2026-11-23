package org.telegram.ui;

import android.content.Context;
public final class hl extends org.telegram.ui.Cells.a0 {
    public final kl f48440f;

    public hl(kl klVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.f48440f = klVar;
    }

    @Override
    public final int getSideMenuWidth() {
        bn bnVar = this.f48440f.R;
        int i7 = bn.f45893md;
        return bnVar.n9();
    }
}
