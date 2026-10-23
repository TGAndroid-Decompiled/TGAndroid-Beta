package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hf1;
import org.telegram.ui.na0;
public final class n2 implements hf1 {
    public final int f34553a;
    public final int f34554b;
    public final Utilities.CallbackReturn f34555c;
    public final Utilities.Callback2 d;
    public final r2 e;
    public final Utilities.Callback3 f34556f;
    public final boolean h;
    public final boolean f34557n;
    public final na0 f34558r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, na0 na0Var, int i11) {
        this.f34553a = i11;
        this.f34554b = i10;
        this.f34555c = callbackReturn;
        this.d = callback2;
        this.e = r2Var;
        this.f34556f = callback3;
        this.h = z10;
        this.f34557n = z11;
        this.f34558r = na0Var;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34553a) {
            case 0:
                s2.a(this.f34554b, this.f34555c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34556f, this.h, this.f34557n, this.f34558r);
                return;
            default:
                s2.a(this.f34554b, this.f34555c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34556f, this.h, this.f34557n, this.f34558r);
                return;
        }
    }
}
