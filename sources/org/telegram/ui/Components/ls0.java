package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28611a;
    public final float f28612b;
    public final float f28613c;

    public ls0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28611a = t7Var;
        this.f28612b = f7;
        this.f28613c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28611a.n(this.f28612b, this.f28613c);
    }
}
