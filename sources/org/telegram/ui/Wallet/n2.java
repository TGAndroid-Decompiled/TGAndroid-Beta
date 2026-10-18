package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jf1;
import org.telegram.ui.pa0;
public final class n2 implements jf1 {
    public final int f34567a;
    public final int f34568b;
    public final Utilities.CallbackReturn f34569c;
    public final Utilities.Callback2 d;
    public final r2 e;
    public final Utilities.Callback3 f34570f;
    public final boolean h;
    public final boolean f34571n;
    public final pa0 f34572r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, pa0 pa0Var, int i11) {
        this.f34567a = i11;
        this.f34568b = i10;
        this.f34569c = callbackReturn;
        this.d = callback2;
        this.e = r2Var;
        this.f34570f = callback3;
        this.h = z10;
        this.f34571n = z11;
        this.f34572r = pa0Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34567a) {
            case 0:
                s2.a(this.f34568b, this.f34569c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34570f, this.h, this.f34571n, this.f34572r);
                return;
            default:
                s2.a(this.f34568b, this.f34569c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34570f, this.h, this.f34571n, this.f34572r);
                return;
        }
    }
}
