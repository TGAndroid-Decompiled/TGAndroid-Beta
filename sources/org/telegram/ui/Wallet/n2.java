package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hb0;
import org.telegram.ui.ug1;
public final class n2 implements ug1 {
    public final int f35311a;
    public final int f35312b;
    public final Utilities.CallbackReturn f35313c;
    public final Utilities.Callback2 d;
    public final r2 f35314e;
    public final Utilities.Callback3 f35315f;
    public final boolean h;
    public final boolean f35316n;
    public final hb0 f35317r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, hb0 hb0Var, int i11) {
        this.f35311a = i11;
        this.f35312b = i10;
        this.f35313c = callbackReturn;
        this.d = callback2;
        this.f35314e = r2Var;
        this.f35315f = callback3;
        this.h = z10;
        this.f35316n = z11;
        this.f35317r = hb0Var;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f35311a) {
            case 0:
                s2.a(this.f35312b, this.f35313c, this.d, tL_inputCheckPasswordSRP, this.f35314e, this.f35315f, this.h, this.f35316n, this.f35317r);
                return;
            default:
                s2.a(this.f35312b, this.f35313c, this.d, tL_inputCheckPasswordSRP, this.f35314e, this.f35315f, this.h, this.f35316n, this.f35317r);
                return;
        }
    }
}
