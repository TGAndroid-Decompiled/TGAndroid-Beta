package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class fr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f26174a;
    public final float f26175b;
    public final float f26176c;

    public fr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f26174a = t7Var;
        this.f26175b = f7;
        this.f26176c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f26174a.n(this.f26175b, this.f26176c);
    }
}
