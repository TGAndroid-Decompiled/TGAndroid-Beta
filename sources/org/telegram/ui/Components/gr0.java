package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f24396a;
    public final float f24397b;
    public final float f24398c;

    public gr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f24396a = t7Var;
        this.f24397b = f7;
        this.f24398c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f24396a.n(this.f24397b, this.f24398c);
    }
}
