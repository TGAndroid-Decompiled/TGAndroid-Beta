package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ds0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f25624a;
    public final float f25625b;
    public final float f25626c;

    public ds0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f25624a = s7Var;
        this.f25625b = f7;
        this.f25626c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25624a.n(this.f25625b, this.f25626c);
    }
}
