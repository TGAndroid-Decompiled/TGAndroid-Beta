package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ur0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28914a;
    public final float f28915b;
    public final float f28916c;

    public ur0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28914a = t7Var;
        this.f28915b = f7;
        this.f28916c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28914a.n(this.f28915b, this.f28916c);
    }
}
