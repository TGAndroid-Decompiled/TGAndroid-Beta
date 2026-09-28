package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28613a;
    public final float f28614b;
    public final float f28615c;

    public tr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28613a = t7Var;
        this.f28614b = f7;
        this.f28615c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28613a.n(this.f28614b, this.f28615c);
    }
}
