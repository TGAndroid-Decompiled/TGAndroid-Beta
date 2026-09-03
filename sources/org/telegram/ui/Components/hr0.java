package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class hr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.q7 f25484a;
    public final float f25485b;
    public final float f25486c;

    public hr0(org.telegram.ui.Cells.q7 q7Var, float f10, float f11) {
        this.f25484a = q7Var;
        this.f25485b = f10;
        this.f25486c = f11;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25484a.n(this.f25485b, this.f25486c);
    }
}
