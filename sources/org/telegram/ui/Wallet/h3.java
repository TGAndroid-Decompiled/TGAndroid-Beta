package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ma1;
public final class h3 implements ma1 {
    public final int f44424a;
    public final int f44425b;
    public final x10 f44426c;
    public final p10 d;
    public final n3 f44427e;
    public final r10 f44428f;
    public final boolean h;
    public final boolean f44429n;
    public final m.b3 f44430r;

    public h3(int i7, x10 x10Var, p10 p10Var, n3 n3Var, r10 r10Var, boolean z10, boolean z11, m.b3 b3Var, int i10) {
        this.f44424a = i10;
        this.f44425b = i7;
        this.f44426c = x10Var;
        this.d = p10Var;
        this.f44427e = n3Var;
        this.f44428f = r10Var;
        this.h = z10;
        this.f44429n = z11;
        this.f44430r = b3Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f44424a) {
            case 0:
                o3.a(this.f44425b, this.f44426c, this.d, tL_inputCheckPasswordSRP, this.f44427e, this.f44428f, this.h, this.f44429n, this.f44430r);
                return;
            default:
                o3.a(this.f44425b, this.f44426c, this.d, tL_inputCheckPasswordSRP, this.f44427e, this.f44428f, this.h, this.f44429n, this.f44430r);
                return;
        }
    }
}
