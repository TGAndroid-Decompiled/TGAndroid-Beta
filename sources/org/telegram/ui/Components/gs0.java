package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class gs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f26708a;
    public final float f26709b;
    public final float f26710c;

    public gs0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f26708a = s7Var;
        this.f26709b = f7;
        this.f26710c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f26708a.n(this.f26709b, this.f26710c);
    }
}
