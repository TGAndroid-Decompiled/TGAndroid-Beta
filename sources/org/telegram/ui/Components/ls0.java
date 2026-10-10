package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28535a;
    public final float f28536b;
    public final float f28537c;

    public ls0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28535a = t7Var;
        this.f28536b = f7;
        this.f28537c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28535a.n(this.f28536b, this.f28537c);
    }
}
