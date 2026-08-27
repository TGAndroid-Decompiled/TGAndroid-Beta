package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class kr0 implements Utilities.Callback {

    public final int f39846a;

    public final qr0 f39847b;

    public final boolean f39848c;

    public kr0(qr0 qr0Var, boolean z10, int i10) {
        this.f39846a = i10;
        this.f39847b = qr0Var;
        this.f39848c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39846a) {
            case 0:
                org.telegram.ui.Components.mc.F(this.f39847b.f41739b.f35583a0, this.f39848c).j();
                break;
            default:
                org.telegram.ui.Components.mc.F(this.f39847b.f41739b.f35583a0, this.f39848c).j();
                break;
        }
    }
}
