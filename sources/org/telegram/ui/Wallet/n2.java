package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hf1;
import org.telegram.ui.na0;
public final class n2 implements hf1 {
    public final int f34552a;
    public final int f34553b;
    public final Utilities.CallbackReturn f34554c;
    public final Utilities.Callback2 d;
    public final r2 e;
    public final Utilities.Callback3 f34555f;
    public final boolean h;
    public final boolean f34556n;
    public final na0 f34557r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, na0 na0Var, int i11) {
        this.f34552a = i11;
        this.f34553b = i10;
        this.f34554c = callbackReturn;
        this.d = callback2;
        this.e = r2Var;
        this.f34555f = callback3;
        this.h = z10;
        this.f34556n = z11;
        this.f34557r = na0Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34552a) {
            case 0:
                s2.a(this.f34553b, this.f34554c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34555f, this.h, this.f34556n, this.f34557r);
                return;
            default:
                s2.a(this.f34553b, this.f34554c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34555f, this.h, this.f34556n, this.f34557r);
                return;
        }
    }
}
