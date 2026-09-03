package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;
public final class h5 extends Switch {
    public final i5 V;

    public h5(i5 i5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.V = i5Var;
    }

    @Override
    public final int a(int i10) {
        return this.V.a(i10);
    }
}
