package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bh1;
import org.telegram.ui.nb0;
public final class l2 implements bh1 {
    public final int f33424a;
    public final int f33425b;
    public final Utilities.CallbackReturn f33426c;
    public final Utilities.Callback2 d;
    public final p2 e;
    public final Utilities.Callback3 f33427f;
    public final boolean h;
    public final boolean f33428n;
    public final nb0 f33429r;

    public l2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, p2 p2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, nb0 nb0Var, int i11) {
        this.f33424a = i11;
        this.f33425b = i10;
        this.f33426c = callbackReturn;
        this.d = callback2;
        this.e = p2Var;
        this.f33427f = callback3;
        this.h = z10;
        this.f33428n = z11;
        this.f33429r = nb0Var;
    }

    @Override
    public final void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f33424a) {
            case 0:
                q2.a(this.f33425b, this.f33426c, this.d, tL_inputCheckPasswordSRP, this.e, this.f33427f, this.h, this.f33428n, this.f33429r);
                return;
            default:
                q2.a(this.f33425b, this.f33426c, this.d, tL_inputCheckPasswordSRP, this.e, this.f33427f, this.h, this.f33428n, this.f33429r);
                return;
        }
    }
}
