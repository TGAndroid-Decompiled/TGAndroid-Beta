package org.telegram.ui.Wallet;

import org.telegram.messenger.d20;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ma1;
public final class c3 implements ma1 {
    public final int f42301a;
    public final int f42302b;
    public final d20 f42303c;
    public final v10 d;
    public final g3 f42304e;
    public final x10 f42305f;
    public final boolean h;
    public final boolean f42306n;
    public final bg.v0 f42307r;

    public c3(int i7, d20 d20Var, v10 v10Var, g3 g3Var, x10 x10Var, boolean z9, boolean z10, bg.v0 v0Var, int i10) {
        this.f42301a = i10;
        this.f42302b = i7;
        this.f42303c = d20Var;
        this.d = v10Var;
        this.f42304e = g3Var;
        this.f42305f = x10Var;
        this.h = z9;
        this.f42306n = z10;
        this.f42307r = v0Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f42301a) {
            case 0:
                h3.a(this.f42302b, this.f42303c, this.d, tL_inputCheckPasswordSRP, this.f42304e, this.f42305f, this.h, this.f42306n, this.f42307r);
                return;
            default:
                h3.a(this.f42302b, this.f42303c, this.d, tL_inputCheckPasswordSRP, this.f42304e, this.f42305f, this.h, this.f42306n, this.f42307r);
                return;
        }
    }
}
