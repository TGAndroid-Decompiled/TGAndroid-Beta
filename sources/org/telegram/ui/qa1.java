package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qa1 extends nq {
    public final boolean[] f36774d1;
    public final za1 f36775e1;
    public final sa1 f36776f1;

    public qa1(sa1 sa1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, za1 za1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f36776f1 = sa1Var;
        this.f36774d1 = zArr;
        this.f36775e1 = za1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f36774d1[0]) {
            za1 za1Var = this.f36775e1;
            if (org.telegram.ui.Components.xc.a(za1Var)) {
                org.telegram.ui.Components.xc.C(za1Var, this.f36776f1.f37238a.first_name).j();
            }
        }
    }
}
