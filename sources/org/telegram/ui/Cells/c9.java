package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.d90;
public final class c9 extends d90 {
    public final int L;
    public final d9 M;

    public c9(d9 d9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.L = i10;
        this.M = d9Var;
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
