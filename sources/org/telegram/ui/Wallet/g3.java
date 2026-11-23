package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa1;
public final class g3 implements oa1 {
    public final int f44262a;
    public final int f44263b;
    public final z10 f44264c;
    public final r10 d;
    public final m3 f44265e;
    public final t10 f44266f;
    public final boolean h;
    public final boolean f44267n;
    public final m.b3 f44268r;

    public g3(int i7, z10 z10Var, r10 r10Var, m3 m3Var, t10 t10Var, boolean z10, boolean z11, m.b3 b3Var, int i10) {
        this.f44262a = i10;
        this.f44263b = i7;
        this.f44264c = z10Var;
        this.d = r10Var;
        this.f44265e = m3Var;
        this.f44266f = t10Var;
        this.h = z10;
        this.f44267n = z11;
        this.f44268r = b3Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f44262a) {
            case 0:
                n3.a(this.f44263b, this.f44264c, this.d, tL_inputCheckPasswordSRP, this.f44265e, this.f44266f, this.h, this.f44267n, this.f44268r);
                return;
            default:
                n3.a(this.f44263b, this.f44264c, this.d, tL_inputCheckPasswordSRP, this.f44265e, this.f44266f, this.h, this.f44267n, this.f44268r);
                return;
        }
    }
}
