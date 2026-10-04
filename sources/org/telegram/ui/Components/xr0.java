package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class xr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f32975a;
    public final float f32976b;
    public final float f32977c;

    public xr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f32975a = t7Var;
        this.f32976b = f7;
        this.f32977c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f32975a.n(this.f32976b, this.f32977c);
    }
}
