package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class hr0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.r7 f27606a;
    public final float f27607b;
    public final float f27608c;

    public hr0(org.telegram.ui.Cells.r7 r7Var, float f10, float f11) {
        this.f27606a = r7Var;
        this.f27607b = f10;
        this.f27608c = f11;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f27606a.n(this.f27607b, this.f27608c);
    }
}
