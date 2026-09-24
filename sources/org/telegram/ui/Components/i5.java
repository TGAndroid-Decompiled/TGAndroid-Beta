package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class i5 implements n5 {
    public final int f24921a;
    public final q5 f24922b;

    public i5(q5 q5Var, int i10) {
        this.f24921a = i10;
        this.f24922b = q5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f24921a) {
            case 0:
                q5 q5Var = this.f24922b;
                q5Var.e = document;
                q5Var.j(false);
                return;
            default:
                q5 q5Var2 = this.f24922b;
                q5Var2.e = document;
                q5Var2.j(false);
                return;
        }
    }
}
