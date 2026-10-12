package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class qs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f29924a;
    public final float f29925b;
    public final float f29926c;

    public qs0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f29924a = t7Var;
        this.f29925b = f7;
        this.f29926c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f29924a.n(this.f29925b, this.f29926c);
    }
}
