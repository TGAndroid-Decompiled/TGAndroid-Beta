package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d5 implements i5 {
    public final int f26183a;
    public final l5 f26184b;

    public d5(l5 l5Var, int i10) {
        this.f26183a = i10;
        this.f26184b = l5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f26183a) {
            case 0:
                l5 l5Var = this.f26184b;
                l5Var.f28632e = document;
                l5Var.j(false);
                return;
            default:
                l5 l5Var2 = this.f26184b;
                l5Var2.f28632e = document;
                l5Var2.j(false);
                return;
        }
    }
}
