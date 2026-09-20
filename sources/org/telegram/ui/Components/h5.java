package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class h5 implements m5 {
    public final int f24544a;
    public final p5 f24545b;

    public h5(p5 p5Var, int i10) {
        this.f24544a = i10;
        this.f24545b = p5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f24544a) {
            case 0:
                p5 p5Var = this.f24545b;
                p5Var.e = document;
                p5Var.j(false);
                return;
            default:
                p5 p5Var2 = this.f24545b;
                p5Var2.e = document;
                p5Var2.j(false);
                return;
        }
    }
}
