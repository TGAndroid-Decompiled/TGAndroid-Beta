package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa1;
public final class g3 implements oa1 {
    public final int f44252a;
    public final int f44253b;
    public final y10 f44254c;
    public final q10 d;
    public final m3 f44255e;
    public final s10 f44256f;
    public final boolean h;
    public final boolean f44257n;
    public final m.b3 f44258r;

    public g3(int i7, y10 y10Var, q10 q10Var, m3 m3Var, s10 s10Var, boolean z10, boolean z11, m.b3 b3Var, int i10) {
        this.f44252a = i10;
        this.f44253b = i7;
        this.f44254c = y10Var;
        this.d = q10Var;
        this.f44255e = m3Var;
        this.f44256f = s10Var;
        this.h = z10;
        this.f44257n = z11;
        this.f44258r = b3Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f44252a) {
            case 0:
                n3.a(this.f44253b, this.f44254c, this.d, tL_inputCheckPasswordSRP, this.f44255e, this.f44256f, this.h, this.f44257n, this.f44258r);
                return;
            default:
                n3.a(this.f44253b, this.f44254c, this.d, tL_inputCheckPasswordSRP, this.f44255e, this.f44256f, this.h, this.f44257n, this.f44258r);
                return;
        }
    }
}
