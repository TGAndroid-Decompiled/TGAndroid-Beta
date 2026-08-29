package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class zq0 implements Utilities.Callback {
    public final org.telegram.ui.Cells.p7 f35398a;
    public final float f35399b;
    public final float f35400c;

    public zq0(org.telegram.ui.Cells.p7 p7Var, float f9, float f10) {
        this.f35398a = p7Var;
        this.f35399b = f9;
        this.f35400c = f10;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f35398a.n(this.f35399b, this.f35400c);
    }
}
