package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.m80;
public final class x8 extends m80 {
    public final int M;
    public final y8 N;

    public x8(y8 y8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.M = i7;
        this.N = y8Var;
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
