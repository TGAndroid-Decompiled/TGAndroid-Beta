package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x4 implements c5 {
    public final int f32374a;
    public final f5 f32375b;

    public x4(f5 f5Var, int i10) {
        this.f32374a = i10;
        this.f32375b = f5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f32374a) {
            case 0:
                f5 f5Var = this.f32375b;
                f5Var.e = document;
                f5Var.i(false);
                return;
            default:
                f5 f5Var2 = this.f32375b;
                f5Var2.e = document;
                f5Var2.i(false);
                return;
        }
    }
}
