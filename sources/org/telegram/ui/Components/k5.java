package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class k5 implements p5 {
    public final int f26578a;
    public final s5 f26579b;

    public k5(s5 s5Var, int i10) {
        this.f26578a = i10;
        this.f26579b = s5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f26578a) {
            case 0:
                s5 s5Var = this.f26579b;
                s5Var.e = document;
                s5Var.j(false);
                return;
            default:
                s5 s5Var2 = this.f26579b;
                s5Var2.e = document;
                s5Var2.j(false);
                return;
        }
    }
}
