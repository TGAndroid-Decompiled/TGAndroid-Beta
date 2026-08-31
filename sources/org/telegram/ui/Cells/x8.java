package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.g90;
public final class x8 extends g90 {
    public final int I;
    public final y8 J;

    public x8(y8 y8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.I = i10;
        this.J = y8Var;
    }

    @Override
    public final int c() {
        switch (this.I) {
            case 0:
                return this.J.a(super.c());
            default:
                return this.J.a(super.c());
        }
    }

    @Override
    public final int d(int i10) {
        switch (this.I) {
            case 0:
                return this.J.a(i10);
            default:
                return this.J.a(i10);
        }
    }
}
