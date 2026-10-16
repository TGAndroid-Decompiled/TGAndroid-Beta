package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bh1;
import org.telegram.ui.mb0;
public final class m2 implements bh1 {
    public final int f33190a;
    public final int f33191b;
    public final Utilities.CallbackReturn f33192c;
    public final Utilities.Callback2 d;
    public final q2 e;
    public final Utilities.Callback3 f33193f;
    public final boolean h;
    public final boolean f33194n;
    public final mb0 f33195r;

    public m2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, q2 q2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, mb0 mb0Var, int i11) {
        this.f33190a = i11;
        this.f33191b = i10;
        this.f33192c = callbackReturn;
        this.d = callback2;
        this.e = q2Var;
        this.f33193f = callback3;
        this.h = z10;
        this.f33194n = z11;
        this.f33195r = mb0Var;
    }

    @Override
    public final void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f33190a) {
            case 0:
                r2.a(this.f33191b, this.f33192c, this.d, tL_inputCheckPasswordSRP, this.e, this.f33193f, this.h, this.f33194n, this.f33195r);
                return;
            default:
                r2.a(this.f33191b, this.f33192c, this.d, tL_inputCheckPasswordSRP, this.e, this.f33193f, this.h, this.f33194n, this.f33195r);
                return;
        }
    }
}
