package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hb0;
import org.telegram.ui.ug1;
public final class n2 implements ug1 {
    public final int f35345a;
    public final int f35346b;
    public final Utilities.CallbackReturn f35347c;
    public final Utilities.Callback2 d;
    public final r2 f35348e;
    public final Utilities.Callback3 f35349f;
    public final boolean h;
    public final boolean f35350n;
    public final hb0 f35351r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, hb0 hb0Var, int i11) {
        this.f35345a = i11;
        this.f35346b = i10;
        this.f35347c = callbackReturn;
        this.d = callback2;
        this.f35348e = r2Var;
        this.f35349f = callback3;
        this.h = z10;
        this.f35350n = z11;
        this.f35351r = hb0Var;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f35345a) {
            case 0:
                s2.a(this.f35346b, this.f35347c, this.d, tL_inputCheckPasswordSRP, this.f35348e, this.f35349f, this.h, this.f35350n, this.f35351r);
                return;
            default:
                s2.a(this.f35346b, this.f35347c, this.d, tL_inputCheckPasswordSRP, this.f35348e, this.f35349f, this.h, this.f35350n, this.f35351r);
                return;
        }
    }
}
