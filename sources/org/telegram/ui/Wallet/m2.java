package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qf1;
public final class m2 implements qf1 {
    public final int f36881a;
    public final int f36882b;
    public final Utilities.CallbackReturn f36883c;
    public final Utilities.Callback2 d;
    public final q2 e;
    public final Utilities.Callback3 f36884f;
    public final boolean h;
    public final boolean f36885n;
    public final ag.b1 f36886r;

    public m2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, q2 q2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ag.b1 b1Var, int i11) {
        this.f36881a = i11;
        this.f36882b = i10;
        this.f36883c = callbackReturn;
        this.d = callback2;
        this.e = q2Var;
        this.f36884f = callback3;
        this.h = z10;
        this.f36885n = z11;
        this.f36886r = b1Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f36881a) {
            case 0:
                r2.a(this.f36882b, this.f36883c, this.d, tL_inputCheckPasswordSRP, this.e, this.f36884f, this.h, this.f36885n, this.f36886r);
                return;
            default:
                r2.a(this.f36882b, this.f36883c, this.d, tL_inputCheckPasswordSRP, this.e, this.f36884f, this.h, this.f36885n, this.f36886r);
                return;
        }
    }
}
