package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d5 implements i5 {
    public final int f24166a;
    public final l5 f24167b;

    public d5(l5 l5Var, int i10) {
        this.f24166a = i10;
        this.f24167b = l5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f24166a) {
            case 0:
                l5 l5Var = this.f24167b;
                l5Var.e = document;
                l5Var.j(false);
                return;
            default:
                l5 l5Var2 = this.f24167b;
                l5Var2.e = document;
                l5Var2.j(false);
                return;
        }
    }
}
