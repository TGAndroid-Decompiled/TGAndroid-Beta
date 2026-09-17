package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class hr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f24722a;
    public final float f24723b;
    public final float f24724c;

    public hr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f24722a = t7Var;
        this.f24723b = f7;
        this.f24724c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f24722a.n(this.f24723b, this.f24724c);
    }
}
