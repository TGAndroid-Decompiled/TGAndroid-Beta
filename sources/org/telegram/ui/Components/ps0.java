package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ps0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.w7 f31701a;
    public final float f31702b;
    public final float f31703c;

    public ps0(org.telegram.ui.Cells.w7 w7Var, float f7, float f10) {
        this.f31701a = w7Var;
        this.f31702b = f7;
        this.f31703c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f31701a.n(this.f31702b, this.f31703c);
    }
}
