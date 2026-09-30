package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28612a;
    public final float f28613b;
    public final float f28614c;

    public tr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28612a = t7Var;
        this.f28613b = f7;
        this.f28614c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28612a.n(this.f28613b, this.f28614c);
    }
}
