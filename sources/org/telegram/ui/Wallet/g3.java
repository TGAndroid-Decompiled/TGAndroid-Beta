package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa1;
public final class g3 implements oa1 {
    public final int f44292a;
    public final int f44293b;
    public final y10 f44294c;
    public final q10 d;
    public final m3 f44295e;
    public final s10 f44296f;
    public final boolean h;
    public final boolean f44297n;
    public final m.b3 f44298r;

    public g3(int i7, y10 y10Var, q10 q10Var, m3 m3Var, s10 s10Var, boolean z10, boolean z11, m.b3 b3Var, int i10) {
        this.f44292a = i10;
        this.f44293b = i7;
        this.f44294c = y10Var;
        this.d = q10Var;
        this.f44295e = m3Var;
        this.f44296f = s10Var;
        this.h = z10;
        this.f44297n = z11;
        this.f44298r = b3Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f44292a) {
            case 0:
                n3.a(this.f44293b, this.f44294c, this.d, tL_inputCheckPasswordSRP, this.f44295e, this.f44296f, this.h, this.f44297n, this.f44298r);
                return;
            default:
                n3.a(this.f44293b, this.f44294c, this.d, tL_inputCheckPasswordSRP, this.f44295e, this.f44296f, this.h, this.f44297n, this.f44298r);
                return;
        }
    }
}
