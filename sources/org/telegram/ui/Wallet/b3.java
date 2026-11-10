package org.telegram.ui.Wallet;

import org.telegram.messenger.d20;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pa1;
public final class b3 implements pa1 {
    public final int f42172a;
    public final int f42173b;
    public final d20 f42174c;
    public final v10 d;
    public final f3 f42175e;
    public final x10 f42176f;
    public final boolean h;
    public final boolean f42177n;
    public final bg.v0 f42178r;

    public b3(int i7, d20 d20Var, v10 v10Var, f3 f3Var, x10 x10Var, boolean z9, boolean z10, bg.v0 v0Var, int i10) {
        this.f42172a = i10;
        this.f42173b = i7;
        this.f42174c = d20Var;
        this.d = v10Var;
        this.f42175e = f3Var;
        this.f42176f = x10Var;
        this.h = z9;
        this.f42177n = z10;
        this.f42178r = v0Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f42172a) {
            case 0:
                g3.a(this.f42173b, this.f42174c, this.d, tL_inputCheckPasswordSRP, this.f42175e, this.f42176f, this.h, this.f42177n, this.f42178r);
                return;
            default:
                g3.a(this.f42173b, this.f42174c, this.d, tL_inputCheckPasswordSRP, this.f42175e, this.f42176f, this.h, this.f42177n, this.f42178r);
                return;
        }
    }
}
