package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h5 implements m5 {
    public final int f24685a;
    public final p5 f24686b;

    public h5(p5 p5Var, int i10) {
        this.f24685a = i10;
        this.f24686b = p5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f24685a) {
            case 0:
                p5 p5Var = this.f24686b;
                p5Var.e = document;
                p5Var.j(false);
                return;
            default:
                p5 p5Var2 = this.f24686b;
                p5Var2.e = document;
                p5Var2.j(false);
                return;
        }
    }
}
