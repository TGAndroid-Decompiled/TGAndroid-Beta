package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a5 implements f5 {
    public final int f31675a;
    public final i5 f31676b;

    public a5(i5 i5Var, int i7) {
        this.f31675a = i7;
        this.f31676b = i5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f31675a) {
            case 0:
                i5 i5Var = this.f31676b;
                i5Var.f34500e = document;
                i5Var.i(false);
                return;
            default:
                i5 i5Var2 = this.f31676b;
                i5Var2.f34500e = document;
                i5Var2.i(false);
                return;
        }
    }
}
