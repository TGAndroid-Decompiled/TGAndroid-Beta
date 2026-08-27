package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.p80;

public final class u8 extends p80 {
    public final int H;
    public final v8 I;

    public u8(v8 v8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.H = i10;
        this.I = v8Var;
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
    public final int d(int i10) {
        switch (this.H) {
            case 0:
                break;
        }
        return this.I.a(i10);
    }
}
