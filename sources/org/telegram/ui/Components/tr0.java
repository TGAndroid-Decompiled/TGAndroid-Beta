package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28677a;
    public final float f28678b;
    public final float f28679c;

    public tr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28677a = t7Var;
        this.f28678b = f7;
        this.f28679c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28677a.n(this.f28678b, this.f28679c);
    }
}
