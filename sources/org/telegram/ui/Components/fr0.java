package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class fr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f26175a;
    public final float f26176b;
    public final float f26177c;

    public fr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f26175a = t7Var;
        this.f26176b = f7;
        this.f26177c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f26175a.n(this.f26176b, this.f26177c);
    }
}
