package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class c20 implements org.telegram.messenger.j20 {
    public final int f36374a;
    public final b50 f36375b;

    public c20(b50 b50Var, int i10) {
        this.f36374a = i10;
        this.f36375b = b50Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f36374a) {
            case 0:
                b50 b50Var = this.f36375b;
                if (updates != null) {
                    org.telegram.messenger.vp.r1(b50Var.f36036k1.f14863a).L3(updates, false);
                }
                org.telegram.messenger.i0.g3(new t10(b50Var, 10));
                return;
            default:
                b50 b50Var2 = this.f36375b;
                if (updates != null) {
                    org.telegram.messenger.vp.r1(b50Var2.f36036k1.f14863a).L3(updates, false);
                    return;
                } else {
                    b50Var2.getClass();
                    return;
                }
        }
    }
}
