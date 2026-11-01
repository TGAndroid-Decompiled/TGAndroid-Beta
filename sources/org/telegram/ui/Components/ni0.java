package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class ni0 implements Runnable {
    public final int f28855a;
    public final wi0 f28856b;
    public final TLObject f28857c;

    public ni0(wi0 wi0Var, TLObject tLObject, int i10) {
        this.f28855a = i10;
        this.f28856b = wi0Var;
        this.f28857c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28855a) {
            case 0:
                wi0 wi0Var = this.f28856b;
                org.telegram.messenger.at.f(wi0Var.f32252b).d(new ni0(wi0Var, this.f28857c, 1));
                return;
            default:
                wi0.a(this.f28856b, this.f28857c);
                return;
        }
    }
}
