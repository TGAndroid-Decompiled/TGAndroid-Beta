package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class g5 implements l5 {
    public final int f24192a;
    public final o5 f24193b;

    public g5(o5 o5Var, int i10) {
        this.f24192a = i10;
        this.f24193b = o5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f24192a) {
            case 0:
                o5 o5Var = this.f24193b;
                o5Var.e = document;
                o5Var.j(false);
                return;
            default:
                o5 o5Var2 = this.f24193b;
                o5Var2.e = document;
                o5Var2.j(false);
                return;
        }
    }
}
