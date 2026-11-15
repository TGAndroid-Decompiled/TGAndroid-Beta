package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class mh0 implements Runnable {
    public final int f37249a;
    public final vh0 f37250b;
    public final TLObject f37251c;

    public mh0(vh0 vh0Var, TLObject tLObject, int i7) {
        this.f37249a = i7;
        this.f37250b = vh0Var;
        this.f37251c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37249a) {
            case 0:
                vh0 vh0Var = this.f37250b;
                org.telegram.messenger.ns.f(vh0Var.f40417b).d(new mh0(vh0Var, this.f37251c, 1));
                return;
            default:
                vh0.a(this.f37250b, this.f37251c);
                return;
        }
    }
}
