package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class bs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f25039a;
    public final float f25040b;
    public final float f25041c;

    public bs0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f25039a = s7Var;
        this.f25040b = f7;
        this.f25041c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25039a.n(this.f25040b, this.f25041c);
    }
}
