package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i5 implements n5 {
    public final int f27307a;
    public final q5 f27308b;

    public i5(q5 q5Var, int i10) {
        this.f27307a = i10;
        this.f27308b = q5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f27307a) {
            case 0:
                q5 q5Var = this.f27308b;
                q5Var.f29903e = document;
                q5Var.j(false);
                return;
            default:
                q5 q5Var2 = this.f27308b;
                q5Var2.f29903e = document;
                q5Var2.j(false);
                return;
        }
    }
}
