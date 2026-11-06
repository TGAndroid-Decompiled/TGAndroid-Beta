package org.telegram.ui.Wallet;

import org.telegram.messenger.d20;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.la1;
public final class d3 implements la1 {
    public final int f42306a;
    public final int f42307b;
    public final d20 f42308c;
    public final v10 d;
    public final h3 f42309e;
    public final x10 f42310f;
    public final boolean h;
    public final boolean f42311n;
    public final bg.v0 f42312r;

    public d3(int i7, d20 d20Var, v10 v10Var, h3 h3Var, x10 x10Var, boolean z9, boolean z10, bg.v0 v0Var, int i10) {
        this.f42306a = i10;
        this.f42307b = i7;
        this.f42308c = d20Var;
        this.d = v10Var;
        this.f42309e = h3Var;
        this.f42310f = x10Var;
        this.h = z9;
        this.f42311n = z10;
        this.f42312r = v0Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f42306a) {
            case 0:
                i3.a(this.f42307b, this.f42308c, this.d, tL_inputCheckPasswordSRP, this.f42309e, this.f42310f, this.h, this.f42311n, this.f42312r);
                return;
            default:
                i3.a(this.f42307b, this.f42308c, this.d, tL_inputCheckPasswordSRP, this.f42309e, this.f42310f, this.h, this.f42311n, this.f42312r);
                return;
        }
    }
}
