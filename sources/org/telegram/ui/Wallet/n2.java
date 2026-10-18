package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jf1;
import org.telegram.ui.pa0;
public final class n2 implements jf1 {
    public final int f34621a;
    public final int f34622b;
    public final Utilities.CallbackReturn f34623c;
    public final Utilities.Callback2 d;
    public final r2 e;
    public final Utilities.Callback3 f34624f;
    public final boolean h;
    public final boolean f34625n;
    public final pa0 f34626r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, pa0 pa0Var, int i11) {
        this.f34621a = i11;
        this.f34622b = i10;
        this.f34623c = callbackReturn;
        this.d = callback2;
        this.e = r2Var;
        this.f34624f = callback3;
        this.h = z10;
        this.f34625n = z11;
        this.f34626r = pa0Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34621a) {
            case 0:
                s2.a(this.f34622b, this.f34623c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34624f, this.h, this.f34625n, this.f34626r);
                return;
            default:
                s2.a(this.f34622b, this.f34623c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34624f, this.h, this.f34625n, this.f34626r);
                return;
        }
    }
}
