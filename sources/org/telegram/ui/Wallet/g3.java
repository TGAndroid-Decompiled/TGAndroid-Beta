package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa1;
public final class g3 implements oa1 {
    public final int f44296a;
    public final int f44297b;
    public final z10 f44298c;
    public final r10 d;
    public final m3 f44299e;
    public final t10 f44300f;
    public final boolean h;
    public final boolean f44301n;
    public final m.b3 f44302r;

    public g3(int i7, z10 z10Var, r10 r10Var, m3 m3Var, t10 t10Var, boolean z10, boolean z11, m.b3 b3Var, int i10) {
        this.f44296a = i10;
        this.f44297b = i7;
        this.f44298c = z10Var;
        this.d = r10Var;
        this.f44299e = m3Var;
        this.f44300f = t10Var;
        this.h = z10;
        this.f44301n = z11;
        this.f44302r = b3Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f44296a) {
            case 0:
                n3.a(this.f44297b, this.f44298c, this.d, tL_inputCheckPasswordSRP, this.f44299e, this.f44300f, this.h, this.f44301n, this.f44302r);
                return;
            default:
                n3.a(this.f44297b, this.f44298c, this.d, tL_inputCheckPasswordSRP, this.f44299e, this.f44300f, this.h, this.f44301n, this.f44302r);
                return;
        }
    }
}
