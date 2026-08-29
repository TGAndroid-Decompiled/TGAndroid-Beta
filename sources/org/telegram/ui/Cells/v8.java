package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.y80;
public final class v8 extends y80 {
    public final int H;
    public final w8 I;

    public v8(w8 w8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.H = i10;
        this.I = w8Var;
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
                return this.I.a(i10);
            default:
                return this.I.a(i10);
        }
    }
}
