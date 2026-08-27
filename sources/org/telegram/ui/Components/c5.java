package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class c5 implements h5 {

    public final int f27321a;

    public final k5 f27322b;

    public c5(k5 k5Var, int i10) {
        this.f27321a = i10;
        this.f27322b = k5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f27321a) {
            case 0:
                k5 k5Var = this.f27322b;
                k5Var.f29956e = document;
                k5Var.j(false);
                break;
            default:
                k5 k5Var2 = this.f27322b;
                k5Var2.f29956e = document;
                k5Var2.j(false);
                break;
        }
    }
}
