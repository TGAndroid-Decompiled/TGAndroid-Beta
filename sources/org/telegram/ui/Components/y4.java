package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class y4 implements d5 {
    public final int f41867a;
    public final g5 f41868b;

    public y4(g5 g5Var, int i7) {
        this.f41867a = i7;
        this.f41868b = g5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f41867a) {
            case 0:
                g5 g5Var = this.f41868b;
                g5Var.f34804e = document;
                g5Var.i(false);
                return;
            default:
                g5 g5Var2 = this.f41868b;
                g5Var2.f34804e = document;
                g5Var2.i(false);
                return;
        }
    }
}
