package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class qs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f29926a;
    public final float f29927b;
    public final float f29928c;

    public qs0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f29926a = t7Var;
        this.f29927b = f7;
        this.f29928c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f29926a.n(this.f29927b, this.f29928c);
    }
}
