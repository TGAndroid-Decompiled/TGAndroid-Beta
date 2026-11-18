package org.telegram.ui;

import android.content.Context;
public final class gl extends org.telegram.ui.Cells.g0 {
    public final kl M;

    public gl(kl klVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.M = klVar;
    }

    @Override
    public final int getSideMenuWidth() {
        bn bnVar = this.M.R;
        int i7 = bn.f45913md;
        return bnVar.n9();
    }
}
