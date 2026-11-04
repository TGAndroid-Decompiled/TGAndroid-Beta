package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y4 implements d5 {
    public final int f40607a;
    public final g5 f40608b;

    public y4(g5 g5Var, int i3) {
        this.f40607a = i3;
        this.f40608b = g5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f40607a) {
            case 0:
                g5 g5Var = this.f40608b;
                g5Var.f33966e = document;
                g5Var.i(false);
                return;
            default:
                g5 g5Var2 = this.f40608b;
                g5Var2.f33966e = document;
                g5Var2.i(false);
                return;
        }
    }
}
