package org.telegram.ui.Wallet;

import org.telegram.messenger.d20;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.la1;
public final class d3 implements la1 {
    public final int f42331a;
    public final int f42332b;
    public final d20 f42333c;
    public final v10 d;
    public final h3 f42334e;
    public final x10 f42335f;
    public final boolean h;
    public final boolean f42336n;
    public final bg.v0 f42337r;

    public d3(int i7, d20 d20Var, v10 v10Var, h3 h3Var, x10 x10Var, boolean z9, boolean z10, bg.v0 v0Var, int i10) {
        this.f42331a = i10;
        this.f42332b = i7;
        this.f42333c = d20Var;
        this.d = v10Var;
        this.f42334e = h3Var;
        this.f42335f = x10Var;
        this.h = z9;
        this.f42336n = z10;
        this.f42337r = v0Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f42331a) {
            case 0:
                i3.a(this.f42332b, this.f42333c, this.d, tL_inputCheckPasswordSRP, this.f42334e, this.f42335f, this.h, this.f42336n, this.f42337r);
                return;
            default:
                i3.a(this.f42332b, this.f42333c, this.d, tL_inputCheckPasswordSRP, this.f42334e, this.f42335f, this.h, this.f42336n, this.f42337r);
                return;
        }
    }
}
