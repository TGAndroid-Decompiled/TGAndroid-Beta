package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g5 implements l5 {
    public final int f35314a;
    public final o5 f35315b;

    public g5(o5 o5Var, int i7) {
        this.f35314a = i7;
        this.f35315b = o5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f35314a) {
            case 0:
                o5 o5Var = this.f35315b;
                o5Var.f38023e = document;
                o5Var.i(false);
                return;
            default:
                o5 o5Var2 = this.f35315b;
                o5Var2.f38023e = document;
                o5Var2.i(false);
                return;
        }
    }
}
