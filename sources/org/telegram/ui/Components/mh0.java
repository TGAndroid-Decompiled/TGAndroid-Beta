package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class mh0 implements Runnable {
    public final int f37250a;
    public final vh0 f37251b;
    public final TLObject f37252c;

    public mh0(vh0 vh0Var, TLObject tLObject, int i7) {
        this.f37250a = i7;
        this.f37251b = vh0Var;
        this.f37252c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37250a) {
            case 0:
                vh0 vh0Var = this.f37251b;
                org.telegram.messenger.ns.f(vh0Var.f40414b).d(new mh0(vh0Var, this.f37252c, 1));
                return;
            default:
                vh0.a(this.f37251b, this.f37252c);
                return;
        }
    }
}
