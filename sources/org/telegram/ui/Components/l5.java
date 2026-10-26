package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l5 implements q5 {
    public final int f30083a;
    public final t5 f30084b;

    public l5(t5 t5Var, int i10) {
        this.f30083a = i10;
        this.f30084b = t5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f30083a) {
            case 0:
                t5 t5Var = this.f30084b;
                t5Var.e = document;
                t5Var.j(false);
                return;
            default:
                t5 t5Var2 = this.f30084b;
                t5Var2.e = document;
                t5Var2.j(false);
                return;
        }
    }
}
