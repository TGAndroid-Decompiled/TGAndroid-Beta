package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ds0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f25621a;
    public final float f25622b;
    public final float f25623c;

    public ds0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f25621a = s7Var;
        this.f25622b = f7;
        this.f25623c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25621a.n(this.f25622b, this.f25623c);
    }
}
