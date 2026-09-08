package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class fr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f26201a;
    public final float f26202b;
    public final float f26203c;

    public fr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f26201a = t7Var;
        this.f26202b = f7;
        this.f26203c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f26201a.n(this.f26202b, this.f26203c);
    }
}
