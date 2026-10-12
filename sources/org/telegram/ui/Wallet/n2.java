package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jb0;
import org.telegram.ui.xg1;
public final class n2 implements xg1 {
    public final int f35114a;
    public final int f35115b;
    public final Utilities.CallbackReturn f35116c;
    public final Utilities.Callback2 d;
    public final r2 f35117e;
    public final Utilities.Callback3 f35118f;
    public final boolean h;
    public final boolean f35119n;
    public final jb0 f35120r;

    public n2(int i10, Utilities.CallbackReturn callbackReturn, Utilities.Callback2 callback2, r2 r2Var, Utilities.Callback3 callback3, boolean z10, boolean z11, jb0 jb0Var, int i11) {
        this.f35114a = i11;
        this.f35115b = i10;
        this.f35116c = callbackReturn;
        this.d = callback2;
        this.f35117e = r2Var;
        this.f35118f = callback3;
        this.h = z10;
        this.f35119n = z11;
        this.f35120r = jb0Var;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f35114a) {
            case 0:
                s2.a(this.f35115b, this.f35116c, this.d, tL_inputCheckPasswordSRP, this.f35117e, this.f35118f, this.h, this.f35119n, this.f35120r);
                return;
            default:
                s2.a(this.f35115b, this.f35116c, this.d, tL_inputCheckPasswordSRP, this.f35117e, this.f35118f, this.h, this.f35119n, this.f35120r);
                return;
        }
    }
}
