package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h5 implements m5 {
    public final int f29062a;
    public final p5 f29063b;

    public h5(p5 p5Var, int i10) {
        this.f29062a = i10;
        this.f29063b = p5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f29062a) {
            case 0:
                p5 p5Var = this.f29063b;
                p5Var.f31588e = document;
                p5Var.j(false);
                return;
            default:
                p5 p5Var2 = this.f29063b;
                p5Var2.f31588e = document;
                p5Var2.j(false);
                return;
        }
    }
}
