package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h5 implements m5 {
    public final int f35784a;
    public final p5 f35785b;

    public h5(p5 p5Var, int i7) {
        this.f35784a = i7;
        this.f35785b = p5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f35784a) {
            case 0:
                p5 p5Var = this.f35785b;
                p5Var.f38495e = document;
                p5Var.i(false);
                return;
            default:
                p5 p5Var2 = this.f35785b;
                p5Var2.f38495e = document;
                p5Var2.i(false);
                return;
        }
    }
}
