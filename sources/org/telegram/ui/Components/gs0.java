package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f25415a;
    public final float f25416b;
    public final float f25417c;

    public gs0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f25415a = t7Var;
        this.f25416b = f7;
        this.f25417c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25415a.n(this.f25416b, this.f25417c);
    }
}
