package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ds0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.s7 f25625a;
    public final float f25626b;
    public final float f25627c;

    public ds0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.f25625a = s7Var;
        this.f25626b = f7;
        this.f25627c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f25625a.n(this.f25626b, this.f25627c);
    }
}
