package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.l80;
public final class y8 extends l80 {
    public final int H;
    public final z8 I;

    public y8(z8 z8Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.H = i9;
        this.I = z8Var;
    }

    @Override
    public final int c() {
        switch (this.H) {
            case 0:
                return this.I.a(super.c());
            default:
                return this.I.a(super.c());
        }
    }

    @Override
    public final int d(int i9) {
        switch (this.H) {
            case 0:
                return this.I.a(i9);
            default:
                return this.I.a(i9);
        }
    }
}
