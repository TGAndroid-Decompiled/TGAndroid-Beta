package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sf1;
public final class m2 implements sf1 {
    public final int f36886a;
    public final int f36887b;
    public final Utilities.CallbackReturn f36888c;
    public final Utilities.Callback2 d;
    public final q2 e;
    public final Utilities.Callback3 f36889f;
    public final boolean h;
    public final boolean f36890n;
    public final ag.b1 f36891r;

    public m2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, q2 q2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ag.b1 b1Var, int i11) {
        this.f36886a = i11;
        this.f36887b = i10;
        this.f36888c = callbackReturn;
        this.d = callback2;
        this.e = q2Var;
        this.f36889f = callback3;
        this.h = z10;
        this.f36890n = z11;
        this.f36891r = b1Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f36886a) {
            case 0:
                r2.a(this.f36887b, this.f36888c, this.d, tL_inputCheckPasswordSRP, this.e, this.f36889f, this.h, this.f36890n, this.f36891r);
                return;
            default:
                r2.a(this.f36887b, this.f36888c, this.d, tL_inputCheckPasswordSRP, this.e, this.f36889f, this.h, this.f36890n, this.f36891r);
                return;
        }
    }
}
