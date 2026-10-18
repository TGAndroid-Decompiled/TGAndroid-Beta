package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class bs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f25046a;
    public final float f25047b;
    public final float f25048c;

    public bs0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f25046a = s7Var;
        this.f25047b = f7;
        this.f25048c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25046a.n(this.f25047b, this.f25048c);
    }
}
