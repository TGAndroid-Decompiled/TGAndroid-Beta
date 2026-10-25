package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.z90;
public final class f9 extends z90 {
    public final int L;
    public final g9 M;

    public f9(g9 g9Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.L = i10;
        this.M = g9Var;
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
