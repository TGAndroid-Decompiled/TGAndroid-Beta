package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l5 implements q5 {
    public final int f30114a;
    public final t5 f30115b;

    public l5(t5 t5Var, int i10) {
        this.f30114a = i10;
        this.f30115b = t5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f30114a) {
            case 0:
                t5 t5Var = this.f30115b;
                t5Var.e = document;
                t5Var.j(false);
                return;
            default:
                t5 t5Var2 = this.f30115b;
                t5Var2.e = document;
                t5Var2.j(false);
                return;
        }
    }
}
