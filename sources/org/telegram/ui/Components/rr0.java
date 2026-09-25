package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28040a;
    public final float f28041b;
    public final float f28042c;

    public rr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28040a = t7Var;
        this.f28041b = f7;
        this.f28042c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28040a.n(this.f28041b, this.f28042c);
    }
}
