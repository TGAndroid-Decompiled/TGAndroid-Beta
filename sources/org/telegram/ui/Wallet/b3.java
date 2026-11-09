package org.telegram.ui.Wallet;

import org.telegram.messenger.d20;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa1;
public final class b3 implements oa1 {
    public final int f42215a;
    public final int f42216b;
    public final d20 f42217c;
    public final v10 d;
    public final f3 f42218e;
    public final x10 f42219f;
    public final boolean h;
    public final boolean f42220n;
    public final bg.v0 f42221r;

    public b3(int i7, d20 d20Var, v10 v10Var, f3 f3Var, x10 x10Var, boolean z9, boolean z10, bg.v0 v0Var, int i10) {
        this.f42215a = i10;
        this.f42216b = i7;
        this.f42217c = d20Var;
        this.d = v10Var;
        this.f42218e = f3Var;
        this.f42219f = x10Var;
        this.h = z9;
        this.f42220n = z10;
        this.f42221r = v0Var;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f42215a) {
            case 0:
                g3.a(this.f42216b, this.f42217c, this.d, tL_inputCheckPasswordSRP, this.f42218e, this.f42219f, this.h, this.f42220n, this.f42221r);
                return;
            default:
                g3.a(this.f42216b, this.f42217c, this.d, tL_inputCheckPasswordSRP, this.f42218e, this.f42219f, this.h, this.f42220n, this.f42221r);
                return;
        }
    }
}
