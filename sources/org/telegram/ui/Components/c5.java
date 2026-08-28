package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c5 implements h5 {
    public final int f27366a;
    public final k5 f27367b;

    public c5(k5 k5Var, int i9) {
        this.f27366a = i9;
        this.f27367b = k5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f27366a) {
            case 0:
                k5 k5Var = this.f27367b;
                k5Var.f29946e = document;
                k5Var.j(false);
                return;
            default:
                k5 k5Var2 = this.f27367b;
                k5Var2.f29946e = document;
                k5Var2.j(false);
                return;
        }
    }
}
