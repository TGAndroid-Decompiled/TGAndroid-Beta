package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f25337a;
    public final float f25338b;
    public final float f25339c;

    public cs0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f25337a = s7Var;
        this.f25338b = f7;
        this.f25339c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25337a.n(this.f25338b, this.f25339c);
    }
}
