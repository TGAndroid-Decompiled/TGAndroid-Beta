package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class yr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f33339a;
    public final float f33340b;
    public final float f33341c;

    public yr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f33339a = t7Var;
        this.f33340b = f7;
        this.f33341c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f33339a.n(this.f33340b, this.f33341c);
    }
}
