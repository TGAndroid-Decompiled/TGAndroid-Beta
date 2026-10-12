package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jb0;
import org.telegram.ui.xg1;
public final class n2 implements xg1 {
    public final int f35112a;
    public final int f35113b;
    public final Utilities.CallbackReturn f35114c;
    public final Utilities.Callback2 d;
    public final r2 f35115e;
    public final Utilities.Callback3 f35116f;
    public final boolean h;
    public final boolean f35117n;
    public final jb0 f35118r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, jb0 jb0Var, int i11) {
        this.f35112a = i11;
        this.f35113b = i10;
        this.f35114c = callbackReturn;
        this.d = callback2;
        this.f35115e = r2Var;
        this.f35116f = callback3;
        this.h = z10;
        this.f35117n = z11;
        this.f35118r = jb0Var;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f35112a) {
            case 0:
                s2.a(this.f35113b, this.f35114c, this.d, tL_inputCheckPasswordSRP, this.f35115e, this.f35116f, this.h, this.f35117n, this.f35118r);
                return;
            default:
                s2.a(this.f35113b, this.f35114c, this.d, tL_inputCheckPasswordSRP, this.f35115e, this.f35116f, this.h, this.f35117n, this.f35118r);
                return;
        }
    }
}
