package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class sr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28225a;
    public final float f28226b;
    public final float f28227c;

    public sr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28225a = t7Var;
        this.f28226b = f7;
        this.f28227c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28225a.n(this.f28226b, this.f28227c);
    }
}
