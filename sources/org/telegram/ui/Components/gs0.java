package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f25103a;
    public final float f25104b;
    public final float f25105c;

    public gs0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f25103a = t7Var;
        this.f25104b = f7;
        this.f25105c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25103a.n(this.f25104b, this.f25105c);
    }
}
