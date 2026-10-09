package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ib0;
import org.telegram.ui.vg1;
public final class l2 implements vg1 {
    public final int f35159a;
    public final int f35160b;
    public final Utilities.CallbackReturn f35161c;
    public final Utilities.Callback2 d;
    public final p2 f35162e;
    public final Utilities.Callback3 f35163f;
    public final boolean h;
    public final boolean f35164n;
    public final ib0 f35165r;

    public l2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, p2 p2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, ib0 ib0Var, int i11) {
        this.f35159a = i11;
        this.f35160b = i10;
        this.f35161c = callbackReturn;
        this.d = callback2;
        this.f35162e = p2Var;
        this.f35163f = callback3;
        this.h = z10;
        this.f35164n = z11;
        this.f35165r = ib0Var;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f35159a) {
            case 0:
                q2.a(this.f35160b, this.f35161c, this.d, tL_inputCheckPasswordSRP, this.f35162e, this.f35163f, this.h, this.f35164n, this.f35165r);
                return;
            default:
                q2.a(this.f35160b, this.f35161c, this.d, tL_inputCheckPasswordSRP, this.f35162e, this.f35163f, this.h, this.f35164n, this.f35165r);
                return;
        }
    }
}
