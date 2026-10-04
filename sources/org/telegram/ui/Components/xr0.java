package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class xr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f32974a;
    public final float f32975b;
    public final float f32976c;

    public xr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f32974a = t7Var;
        this.f32975b = f7;
        this.f32976c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f32974a.n(this.f32975b, this.f32976c);
    }
}
