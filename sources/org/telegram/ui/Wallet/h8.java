package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
public final class h8 implements c20 {
    public final int f42593a;
    public final p8 f42594b;

    public h8(p8 p8Var, int i7) {
        this.f42593a = i7;
        this.f42594b = p8Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42593a;
        p8 p8Var = this.f42594b;
        switch (i7) {
            case 0:
                p8.h0(p8Var, (c20) obj);
                return;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    gc.a0(p8Var).e0(str, false);
                    return;
                }
                bc I = gc.a0(p8Var).I(2131623989, id.M0(2131743188, null), id.M0(2131743186, null));
                I.f32203j = 5000;
                I.j();
                p8Var.f36518a.f37496f3.O(true);
                return;
            default:
                p8.f0(p8Var, (Boolean) obj);
                return;
        }
    }
}
