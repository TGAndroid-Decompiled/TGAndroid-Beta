package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class rr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28031a;
    public final float f28032b;
    public final float f28033c;

    public rr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28031a = t7Var;
        this.f28032b = f7;
        this.f28033c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28031a.n(this.f28032b, this.f28033c);
    }
}
