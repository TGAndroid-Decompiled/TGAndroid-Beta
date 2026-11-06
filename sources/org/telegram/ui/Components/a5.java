package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a5 implements f5 {
    public final int f31679a;
    public final i5 f31680b;

    public a5(i5 i5Var, int i7) {
        this.f31679a = i7;
        this.f31680b = i5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f31679a) {
            case 0:
                i5 i5Var = this.f31680b;
                i5Var.f34445e = document;
                i5Var.i(false);
                return;
            default:
                i5 i5Var2 = this.f31680b;
                i5Var2.f34445e = document;
                i5Var2.i(false);
                return;
        }
    }
}
