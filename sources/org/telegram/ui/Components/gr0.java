package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f24451a;
    public final float f24452b;
    public final float f24453c;

    public gr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f24451a = t7Var;
        this.f24452b = f7;
        this.f24453c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f24451a.n(this.f24452b, this.f24453c);
    }
}
