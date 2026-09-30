package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i5 implements n5 {
    public final int f24987a;
    public final q5 f24988b;

    public i5(q5 q5Var, int i10) {
        this.f24987a = i10;
        this.f24988b = q5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f24987a) {
            case 0:
                q5 q5Var = this.f24988b;
                q5Var.e = document;
                q5Var.j(false);
                return;
            default:
                q5 q5Var2 = this.f24988b;
                q5Var2.e = document;
                q5Var2.j(false);
                return;
        }
    }
}
