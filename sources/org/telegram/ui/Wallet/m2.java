package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qf1;
public final class m2 implements qf1 {
    public final int f36878a;
    public final int f36879b;
    public final Utilities.CallbackReturn f36880c;
    public final Utilities.Callback2 d;
    public final q2 e;
    public final Utilities.Callback3 f36881f;
    public final boolean h;
    public final boolean f36882n;
    public final ag.b1 f36883r;

    public m2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, q2 q2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ag.b1 b1Var, int i11) {
        this.f36878a = i11;
        this.f36879b = i10;
        this.f36880c = callbackReturn;
        this.d = callback2;
        this.e = q2Var;
        this.f36881f = callback3;
        this.h = z10;
        this.f36882n = z11;
        this.f36883r = b1Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f36878a) {
            case 0:
                r2.a(this.f36879b, this.f36880c, this.d, tL_inputCheckPasswordSRP, this.e, this.f36881f, this.h, this.f36882n, this.f36883r);
                return;
            default:
                r2.a(this.f36879b, this.f36880c, this.d, tL_inputCheckPasswordSRP, this.e, this.f36881f, this.h, this.f36882n, this.f36883r);
                return;
        }
    }
}
