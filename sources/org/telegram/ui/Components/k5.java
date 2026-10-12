package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k5 implements p5 {
    public final int f27761a;
    public final s5 f27762b;

    public k5(s5 s5Var, int i10) {
        this.f27761a = i10;
        this.f27762b = s5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f27761a) {
            case 0:
                s5 s5Var = this.f27762b;
                s5Var.f30397e = document;
                s5Var.j(false);
                return;
            default:
                s5 s5Var2 = this.f27762b;
                s5Var2.f30397e = document;
                s5Var2.j(false);
                return;
        }
    }
}
