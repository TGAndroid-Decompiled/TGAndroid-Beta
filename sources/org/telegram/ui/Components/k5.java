package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k5 implements p5 {
    public final int f27844a;
    public final s5 f27845b;

    public k5(s5 s5Var, int i10) {
        this.f27844a = i10;
        this.f27845b = s5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f27844a) {
            case 0:
                s5 s5Var = this.f27845b;
                s5Var.f30629e = document;
                s5Var.j(false);
                return;
            default:
                s5 s5Var2 = this.f27845b;
                s5Var2.f30629e = document;
                s5Var2.j(false);
                return;
        }
    }
}
