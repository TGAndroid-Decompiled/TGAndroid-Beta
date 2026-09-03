package org.telegram.ui;

import android.content.Context;
public final class fm extends org.telegram.ui.Cells.b0 {
    public final lm f34106f;

    public fm(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f34106f = lmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        zn znVar = this.f34106f.N;
        int i10 = zn.Ec;
        return znVar.R8();
    }
}
