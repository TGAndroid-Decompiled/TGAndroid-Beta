package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class xr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f32981a;
    public final float f32982b;
    public final float f32983c;

    public xr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f32981a = t7Var;
        this.f32982b = f7;
        this.f32983c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f32981a.n(this.f32982b, this.f32983c);
    }
}
