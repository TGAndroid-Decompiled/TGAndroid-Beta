package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class qs0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.w7 f32017a;
    public final float f32018b;
    public final float f32019c;

    public qs0(org.telegram.ui.Cells.w7 w7Var, float f7, float f10) {
        this.f32017a = w7Var;
        this.f32018b = f7;
        this.f32019c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f32017a.n(this.f32018b, this.f32019c);
    }
}
