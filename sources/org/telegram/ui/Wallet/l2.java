package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ib0;
import org.telegram.ui.vg1;
public final class l2 implements vg1 {
    public final int f35185a;
    public final int f35186b;
    public final Utilities.CallbackReturn f35187c;
    public final Utilities.Callback2 d;
    public final p2 f35188e;
    public final Utilities.Callback3 f35189f;
    public final boolean h;
    public final boolean f35190n;
    public final ib0 f35191r;

    public l2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, p2 p2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ib0 ib0Var, int i11) {
        this.f35185a = i11;
        this.f35186b = i10;
        this.f35187c = callbackReturn;
        this.d = callback2;
        this.f35188e = p2Var;
        this.f35189f = callback3;
        this.h = z10;
        this.f35190n = z11;
        this.f35191r = ib0Var;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f35185a) {
            case 0:
                q2.a(this.f35186b, this.f35187c, this.d, tL_inputCheckPasswordSRP, this.f35188e, this.f35189f, this.h, this.f35190n, this.f35191r);
                return;
            default:
                q2.a(this.f35186b, this.f35187c, this.d, tL_inputCheckPasswordSRP, this.f35188e, this.f35189f, this.h, this.f35190n, this.f35191r);
                return;
        }
    }
}
