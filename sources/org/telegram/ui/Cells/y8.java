package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.p80;
public final class y8 extends p80 {
    public final int L;
    public final z8 M;

    public y8(z8 z8Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.L = i10;
        this.M = z8Var;
    }

    @Override
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override
    public final int d(int i10) {
        switch (this.L) {
            case 0:
                return this.M.a(i10);
            default:
                return this.M.a(i10);
        }
    }
}
