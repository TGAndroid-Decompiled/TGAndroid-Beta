package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jf1;
import org.telegram.ui.pa0;
public final class n2 implements jf1 {
    public final int f34627a;
    public final int f34628b;
    public final Utilities.CallbackReturn f34629c;
    public final Utilities.Callback2 d;
    public final r2 e;
    public final Utilities.Callback3 f34630f;
    public final boolean h;
    public final boolean f34631n;
    public final pa0 f34632r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, pa0 pa0Var, int i11) {
        this.f34627a = i11;
        this.f34628b = i10;
        this.f34629c = callbackReturn;
        this.d = callback2;
        this.e = r2Var;
        this.f34630f = callback3;
        this.h = z10;
        this.f34631n = z11;
        this.f34632r = pa0Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34627a) {
            case 0:
                s2.a(this.f34628b, this.f34629c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34630f, this.h, this.f34631n, this.f34632r);
                return;
            default:
                s2.a(this.f34628b, this.f34629c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34630f, this.h, this.f34631n, this.f34632r);
                return;
        }
    }
}
