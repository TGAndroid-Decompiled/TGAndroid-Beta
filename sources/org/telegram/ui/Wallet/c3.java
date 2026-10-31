package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.aa0;
import org.telegram.ui.gc1;
public final class c3 implements gc1 {
    public final int f34313a;
    public final int f34314b;
    public final r20 f34315c;
    public final j20 d;
    public final g3 e;
    public final l20 f34316f;
    public final boolean h;
    public final boolean f34317n;
    public final aa0 f34318r;

    public c3(int i10, r20 r20Var, j20 j20Var, g3 g3Var, l20 l20Var, boolean z10, boolean z11, aa0 aa0Var, int i11) {
        this.f34313a = i11;
        this.f34314b = i10;
        this.f34315c = r20Var;
        this.d = j20Var;
        this.e = g3Var;
        this.f34316f = l20Var;
        this.h = z10;
        this.f34317n = z11;
        this.f34318r = aa0Var;
    }

    @Override
    public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34313a) {
            case 0:
                h3.a(this.f34314b, this.f34315c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34316f, this.h, this.f34317n, this.f34318r);
                return;
            default:
                h3.a(this.f34314b, this.f34315c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34316f, this.h, this.f34317n, this.f34318r);
                return;
        }
    }
}
