package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class z4 implements e5 {
    public final int f40849a;
    public final h5 f40850b;

    public z4(h5 h5Var, int i7) {
        this.f40849a = i7;
        this.f40850b = h5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f40849a) {
            case 0:
                h5 h5Var = this.f40850b;
                h5Var.f34171e = document;
                h5Var.i(false);
                return;
            default:
                h5 h5Var2 = this.f40850b;
                h5Var2.f34171e = document;
                h5Var2.i(false);
                return;
        }
    }
}
