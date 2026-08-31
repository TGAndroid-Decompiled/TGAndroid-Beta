package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ir0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.r7 f27895a;
    public final float f27896b;
    public final float f27897c;

    public ir0(org.telegram.ui.Cells.r7 r7Var, float f10, float f11) {
        this.f27895a = r7Var;
        this.f27896b = f10;
        this.f27897c = f11;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f27895a.n(this.f27896b, this.f27897c);
    }
}
