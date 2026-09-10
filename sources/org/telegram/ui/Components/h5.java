package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h5 implements m5 {
    public final int f23517a;
    public final p5 f23518b;

    public h5(p5 p5Var, int i10) {
        this.f23517a = i10;
        this.f23518b = p5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f23517a) {
            case 0:
                p5 p5Var = this.f23518b;
                p5Var.e = document;
                p5Var.j(false);
                return;
            default:
                p5 p5Var2 = this.f23518b;
                p5Var2.e = document;
                p5Var2.j(false);
                return;
        }
    }
}
