package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class oq0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.r7 f31427a;
    public final float f31428b;
    public final float f31429c;

    public oq0(org.telegram.ui.Cells.r7 r7Var, float f10, float f11) {
        this.f31427a = r7Var;
        this.f31428b = f10;
        this.f31429c = f11;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f31427a.n(this.f31428b, this.f31429c);
    }
}
