package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.d90;
public final class b9 extends d90 {
    public final int L;
    public final c9 M;

    public b9(c9 c9Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.L = i10;
        this.M = c9Var;
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
