package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ks0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.t7 f28159a;
    public final float f28160b;
    public final float f28161c;

    public ks0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.f28159a = t7Var;
        this.f28160b = f7;
        this.f28161c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f28159a.n(this.f28160b, this.f28161c);
    }
}
