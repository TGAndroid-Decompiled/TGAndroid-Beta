package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class hr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f24725a;
    public final float f24726b;
    public final float f24727c;

    public hr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f24725a = t7Var;
        this.f24726b = f7;
        this.f24727c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f24725a.n(this.f24726b, this.f24727c);
    }
}
