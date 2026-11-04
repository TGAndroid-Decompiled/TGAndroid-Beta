package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ca1;
public final class b3 implements ca1 {
    public final int f42225a;
    public final int f42226b;
    public final v10 f42227c;
    public final n10 d;
    public final f3 f42228e;
    public final p10 f42229f;
    public final boolean h;
    public final boolean f42230n;
    public final cg.u0 f42231r;

    public b3(int i3, v10 v10Var, n10 n10Var, f3 f3Var, p10 p10Var, boolean z10, boolean z11, cg.u0 u0Var, int i10) {
        this.f42225a = i10;
        this.f42226b = i3;
        this.f42227c = v10Var;
        this.d = n10Var;
        this.f42228e = f3Var;
        this.f42229f = p10Var;
        this.h = z10;
        this.f42230n = z11;
        this.f42231r = u0Var;
    }

    @Override
    public final void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f42225a) {
            case 0:
                g3.a(this.f42226b, this.f42227c, this.d, tL_inputCheckPasswordSRP, this.f42228e, this.f42229f, this.h, this.f42230n, this.f42231r);
                return;
            default:
                g3.a(this.f42226b, this.f42227c, this.d, tL_inputCheckPasswordSRP, this.f42228e, this.f42229f, this.h, this.f42230n, this.f42231r);
                return;
        }
    }
}
