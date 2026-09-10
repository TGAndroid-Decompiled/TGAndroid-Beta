package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class pr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.u7 f26239a;
    public final float f26240b;
    public final float f26241c;

    public pr0(org.telegram.ui.Cells.u7 u7Var, float f7, float f10) {
        this.f26239a = u7Var;
        this.f26240b = f7;
        this.f26241c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f26239a.n(this.f26240b, this.f26241c);
    }
}
