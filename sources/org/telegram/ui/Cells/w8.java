package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.x70;
public final class w8 extends x70 {
    public final int L;
    public final x8 M;

    public w8(x8 x8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.L = i7;
        this.M = x8Var;
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
    public final int d(int i7) {
        switch (this.L) {
            case 0:
                return this.M.a(i7);
            default:
                return this.M.a(i7);
        }
    }
}
