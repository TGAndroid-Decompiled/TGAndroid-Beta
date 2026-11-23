package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h5 implements m5 {
    public final int f35736a;
    public final p5 f35737b;

    public h5(p5 p5Var, int i7) {
        this.f35736a = i7;
        this.f35737b = p5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f35736a) {
            case 0:
                p5 p5Var = this.f35737b;
                p5Var.f38452e = document;
                p5Var.i(false);
                return;
            default:
                p5 p5Var2 = this.f35737b;
                p5Var2.f38452e = document;
                p5Var2.i(false);
                return;
        }
    }
}
