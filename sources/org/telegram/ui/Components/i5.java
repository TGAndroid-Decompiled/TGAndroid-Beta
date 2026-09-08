package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i5 implements n5 {
    public final int f26997a;
    public final q5 f26998b;

    public i5(q5 q5Var, int i10) {
        this.f26997a = i10;
        this.f26998b = q5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f26997a) {
            case 0:
                q5 q5Var = this.f26998b;
                q5Var.f29606e = document;
                q5Var.j(false);
                return;
            default:
                q5 q5Var2 = this.f26998b;
                q5Var2.f29606e = document;
                q5Var2.j(false);
                return;
        }
    }
}
