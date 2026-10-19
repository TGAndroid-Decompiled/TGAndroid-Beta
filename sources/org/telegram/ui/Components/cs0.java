package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class cs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f25335a;
    public final float f25336b;
    public final float f25337c;

    public cs0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f25335a = s7Var;
        this.f25336b = f7;
        this.f25337c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25335a.n(this.f25336b, this.f25337c);
    }
}
