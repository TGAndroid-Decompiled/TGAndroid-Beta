package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.u7 f28525a;
    public final float f28526b;
    public final float f28527c;

    public tr0(org.telegram.ui.Cells.u7 u7Var, float f7, float f10) {
        this.f28525a = u7Var;
        this.f28526b = f7;
        this.f28527c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28525a.n(this.f28526b, this.f28527c);
    }
}
