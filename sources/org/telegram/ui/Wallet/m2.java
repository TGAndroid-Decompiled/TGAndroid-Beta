package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nf1;
import org.telegram.ui.ta0;
public final class m2 implements nf1 {
    public final int f34800a;
    public final int f34801b;
    public final Utilities.CallbackReturn f34802c;
    public final Utilities.Callback2 d;
    public final q2 e;
    public final Utilities.Callback3 f34803f;
    public final boolean h;
    public final boolean f34804n;
    public final ta0 f34805r;

    public m2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, q2 q2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ta0 ta0Var, int i11) {
        this.f34800a = i11;
        this.f34801b = i10;
        this.f34802c = callbackReturn;
        this.d = callback2;
        this.e = q2Var;
        this.f34803f = callback3;
        this.h = z10;
        this.f34804n = z11;
        this.f34805r = ta0Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34800a) {
            case 0:
                r2.a(this.f34801b, this.f34802c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34803f, this.h, this.f34804n, this.f34805r);
                return;
            default:
                r2.a(this.f34801b, this.f34802c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34803f, this.h, this.f34804n, this.f34805r);
                return;
        }
    }
}
