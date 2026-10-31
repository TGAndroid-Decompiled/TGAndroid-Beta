package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class x4 implements c5 {
    public final int f32311a;
    public final f5 f32312b;

    public x4(f5 f5Var, int i10) {
        this.f32311a = i10;
        this.f32312b = f5Var;
    }

    @Override
    public final void a(TLRPC.Document document) {
        switch (this.f32311a) {
            case 0:
                f5 f5Var = this.f32312b;
                f5Var.e = document;
                f5Var.i(false);
                return;
            default:
                f5 f5Var2 = this.f32312b;
                f5Var2.e = document;
                f5Var2.i(false);
                return;
        }
    }
}
