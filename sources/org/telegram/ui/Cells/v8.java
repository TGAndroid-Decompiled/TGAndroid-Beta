package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.s70;
public final class v8 extends s70 {
    public final int M;
    public final w8 N;

    public v8(w8 w8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.M = i3;
        this.N = w8Var;
    }

    @Override
    public final int c() {
        switch (this.M) {
            case 0:
                return this.N.a(super.c());
            default:
                return this.N.a(super.c());
        }
    }

    @Override
    public final int d(int i3) {
        switch (this.M) {
            case 0:
                return this.N.a(i3);
            default:
                return this.N.a(i3);
        }
    }
}
