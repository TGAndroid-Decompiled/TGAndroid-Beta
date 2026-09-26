package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28039a;
    public final float f28040b;
    public final float f28041c;

    public rr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28039a = t7Var;
        this.f28040b = f7;
        this.f28041c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28039a.n(this.f28040b, this.f28041c);
    }
}
