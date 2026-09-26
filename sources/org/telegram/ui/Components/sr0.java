package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28348a;
    public final float f28349b;
    public final float f28350c;

    public sr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28348a = t7Var;
        this.f28349b = f7;
        this.f28350c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28348a.n(this.f28349b, this.f28350c);
    }
}
