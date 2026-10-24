package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class fs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f26428a;
    public final float f26429b;
    public final float f26430c;

    public fs0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f26428a = s7Var;
        this.f26429b = f7;
        this.f26430c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f26428a.n(this.f26429b, this.f26430c);
    }
}
