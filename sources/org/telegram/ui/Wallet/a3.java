package org.telegram.ui.Wallet;

import org.telegram.messenger.a20;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ka1;
public final class a3 implements ka1 {
    public final int f43471a;
    public final int f43472b;
    public final a20 f43473c;
    public final s10 d;
    public final e3 f43474e;
    public final u10 f43475f;
    public final boolean h;
    public final boolean f43476n;
    public final bg.u0 f43477r;

    public a3(int i7, a20 a20Var, s10 s10Var, e3 e3Var, u10 u10Var, boolean z10, boolean z11, bg.u0 u0Var, int i10) {
        this.f43471a = i10;
        this.f43472b = i7;
        this.f43473c = a20Var;
        this.d = s10Var;
        this.f43474e = e3Var;
        this.f43475f = u10Var;
        this.h = z10;
        this.f43476n = z11;
        this.f43477r = u0Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f43471a) {
            case 0:
                f3.a(this.f43472b, this.f43473c, this.d, tL_inputCheckPasswordSRP, this.f43474e, this.f43475f, this.h, this.f43476n, this.f43477r);
                return;
            default:
                f3.a(this.f43472b, this.f43473c, this.d, tL_inputCheckPasswordSRP, this.f43474e, this.f43475f, this.h, this.f43476n, this.f43477r);
                return;
        }
    }
}
