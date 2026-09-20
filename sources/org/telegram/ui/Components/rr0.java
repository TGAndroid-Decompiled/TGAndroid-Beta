package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.u7 f27944a;
    public final float f27945b;
    public final float f27946c;

    public rr0(org.telegram.ui.Cells.u7 u7Var, float f7, float f10) {
        this.f27944a = u7Var;
        this.f27945b = f7;
        this.f27946c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f27944a.n(this.f27945b, this.f27946c);
    }
}
