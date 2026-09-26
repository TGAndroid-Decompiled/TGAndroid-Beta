package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ja1 extends kq {
    public final boolean[] f34734d1;
    public final sa1 f34735e1;
    public final la1 f34736f1;

    public ja1(la1 la1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, sa1 sa1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f34736f1 = la1Var;
        this.f34734d1 = zArr;
        this.f34735e1 = sa1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f34734d1[0]) {
            sa1 sa1Var = this.f34735e1;
            if (org.telegram.ui.Components.xc.a(sa1Var)) {
                org.telegram.ui.Components.xc.C(sa1Var, this.f34736f1.f35286a.first_name).j();
            }
        }
    }
}
