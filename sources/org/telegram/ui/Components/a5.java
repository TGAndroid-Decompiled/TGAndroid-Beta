package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a5 implements f5 {
    public final int f31695a;
    public final i5 f31696b;

    public a5(i5 i5Var, int i7) {
        this.f31695a = i7;
        this.f31696b = i5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f31695a) {
            case 0:
                i5 i5Var = this.f31696b;
                i5Var.f34492e = document;
                i5Var.i(false);
                return;
            default:
                i5 i5Var2 = this.f31696b;
                i5Var2.f34492e = document;
                i5Var2.i(false);
                return;
        }
    }
}
