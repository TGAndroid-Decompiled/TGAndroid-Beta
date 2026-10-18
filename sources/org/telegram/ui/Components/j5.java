package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class j5 implements o5 {
    public final int f27410a;
    public final r5 f27411b;

    public j5(r5 r5Var, int i10) {
        this.f27410a = i10;
        this.f27411b = r5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f27410a) {
            case 0:
                r5 r5Var = this.f27411b;
                r5Var.e = document;
                r5Var.j(false);
                return;
            default:
                r5 r5Var2 = this.f27411b;
                r5Var2.e = document;
                r5Var2.j(false);
                return;
        }
    }
}
