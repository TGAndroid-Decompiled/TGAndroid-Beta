package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.of1;
import org.telegram.ui.ta0;
public final class m2 implements of1 {
    public final int f34798a;
    public final int f34799b;
    public final Utilities.CallbackReturn f34800c;
    public final Utilities.Callback2 d;
    public final q2 e;
    public final Utilities.Callback3 f34801f;
    public final boolean h;
    public final boolean f34802n;
    public final ta0 f34803r;

    public m2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, q2 q2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ta0 ta0Var, int i11) {
        this.f34798a = i11;
        this.f34799b = i10;
        this.f34800c = callbackReturn;
        this.d = callback2;
        this.e = q2Var;
        this.f34801f = callback3;
        this.h = z10;
        this.f34802n = z11;
        this.f34803r = ta0Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34798a) {
            case 0:
                r2.a(this.f34799b, this.f34800c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34801f, this.h, this.f34802n, this.f34803r);
                return;
            default:
                r2.a(this.f34799b, this.f34800c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34801f, this.h, this.f34802n, this.f34803r);
                return;
        }
    }
}
