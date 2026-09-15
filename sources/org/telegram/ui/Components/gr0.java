package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f24448a;
    public final float f24449b;
    public final float f24450c;

    public gr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f24448a = t7Var;
        this.f24449b = f7;
        this.f24450c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f24448a.n(this.f24449b, this.f24450c);
    }
}
