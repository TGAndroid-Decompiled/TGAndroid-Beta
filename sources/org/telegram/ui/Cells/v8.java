package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.z70;
public final class v8 extends z70 {
    public final int M;
    public final w8 N;

    public v8(w8 w8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.M = i7;
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
    public final int d(int i7) {
        switch (this.M) {
            case 0:
                return this.N.a(i7);
            default:
                return this.N.a(i7);
        }
    }
}
