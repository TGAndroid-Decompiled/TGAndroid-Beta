package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class hr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.r7 f25478a;
    public final float f25479b;
    public final float f25480c;

    public hr0(org.telegram.ui.Cells.r7 r7Var, float f10, float f11) {
        this.f25478a = r7Var;
        this.f25479b = f10;
        this.f25480c = f11;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25478a.n(this.f25479b, this.f25480c);
    }
}
