package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ps0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.w7 f31699a;
    public final float f31700b;
    public final float f31701c;

    public ps0(org.telegram.ui.Cells.w7 w7Var, float f7, float f10) {
        this.f31699a = w7Var;
        this.f31700b = f7;
        this.f31701c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f31699a.n(this.f31700b, this.f31701c);
    }
}
