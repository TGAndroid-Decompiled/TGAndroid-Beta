package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28852a;
    public final float f28853b;
    public final float f28854c;

    public ms0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28852a = t7Var;
        this.f28853b = f7;
        this.f28854c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28852a.n(this.f28853b, this.f28854c);
    }
}
