package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.messenger.m20;
import org.telegram.messenger.s20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ec1;
import org.telegram.ui.z90;
public final class d3 implements ec1 {
    public final int f34376a;
    public final int f34377b;
    public final s20 f34378c;
    public final k20 d;
    public final h3 e;
    public final m20 f34379f;
    public final boolean h;
    public final boolean f34380n;
    public final z90 f34381r;

    public d3(int i10, s20 s20Var, k20 k20Var, h3 h3Var, m20 m20Var, boolean z10, boolean z11, z90 z90Var, int i11) {
        this.f34376a = i11;
        this.f34377b = i10;
        this.f34378c = s20Var;
        this.d = k20Var;
        this.e = h3Var;
        this.f34379f = m20Var;
        this.h = z10;
        this.f34380n = z11;
        this.f34381r = z90Var;
    }

    @Override
    public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f34376a) {
            case 0:
                i3.a(this.f34377b, this.f34378c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34379f, this.h, this.f34380n, this.f34381r);
                return;
            default:
                i3.a(this.f34377b, this.f34378c, this.d, tL_inputCheckPasswordSRP, this.e, this.f34379f, this.h, this.f34380n, this.f34381r);
                return;
        }
    }
}
