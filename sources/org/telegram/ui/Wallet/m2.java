package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ib0;
import org.telegram.ui.vg1;
public final class m2 implements vg1 {
    public final int f35281a;
    public final int f35282b;
    public final Utilities.CallbackReturn f35283c;
    public final Utilities.Callback2 d;
    public final q2 f35284e;
    public final Utilities.Callback3 f35285f;
    public final boolean h;
    public final boolean f35286n;
    public final ib0 f35287r;

    public m2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, q2 q2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ib0 ib0Var, int i11) {
        this.f35281a = i11;
        this.f35282b = i10;
        this.f35283c = callbackReturn;
        this.d = callback2;
        this.f35284e = q2Var;
        this.f35285f = callback3;
        this.h = z10;
        this.f35286n = z11;
        this.f35287r = ib0Var;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f35281a) {
            case 0:
                r2.a(this.f35282b, this.f35283c, this.d, tL_inputCheckPasswordSRP, this.f35284e, this.f35285f, this.h, this.f35286n, this.f35287r);
                return;
            default:
                r2.a(this.f35282b, this.f35283c, this.d, tL_inputCheckPasswordSRP, this.f35284e, this.f35285f, this.h, this.f35286n, this.f35287r);
                return;
        }
    }
}
