package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class a5 implements f5 {
    public final int f31704a;
    public final i5 f31705b;

    public a5(i5 i5Var, int i7) {
        this.f31704a = i7;
        this.f31705b = i5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f31704a) {
            case 0:
                i5 i5Var = this.f31705b;
                i5Var.f34536e = document;
                i5Var.i(false);
                return;
            default:
                i5 i5Var2 = this.f31705b;
                i5Var2.f34536e = document;
                i5Var2.i(false);
                return;
        }
    }
}
