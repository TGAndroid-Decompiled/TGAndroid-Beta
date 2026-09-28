package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class tr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28614a;
    public final float f28615b;
    public final float f28616c;

    public tr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28614a = t7Var;
        this.f28615b = f7;
        this.f28616c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28614a.n(this.f28615b, this.f28616c);
    }
}
