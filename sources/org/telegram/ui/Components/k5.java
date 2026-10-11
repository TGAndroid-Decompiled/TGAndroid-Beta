package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k5 implements p5 {
    public final int f27965a;
    public final s5 f27966b;

    public k5(s5 s5Var, int i10) {
        this.f27965a = i10;
        this.f27966b = s5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f27965a) {
            case 0:
                s5 s5Var = this.f27966b;
                s5Var.f30734e = document;
                s5Var.j(false);
                return;
            default:
                s5 s5Var2 = this.f27966b;
                s5Var2.f30734e = document;
                s5Var2.j(false);
                return;
        }
    }
}
