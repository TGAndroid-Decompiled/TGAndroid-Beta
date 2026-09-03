package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ea1 extends kq {
    public final boolean[] f36421a1;
    public final na1 f36422b1;
    public final ga1 f36423c1;

    public ea1(ga1 ga1Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, boolean[] zArr, na1 na1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z4, null);
        this.f36423c1 = ga1Var;
        this.f36421a1 = zArr;
        this.f36422b1 = na1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.f36421a1[0]) {
            na1 na1Var = this.f36422b1;
            if (org.telegram.ui.Components.qc.a(na1Var)) {
                org.telegram.ui.Components.qc.C(na1Var, this.f36423c1.f37049a.first_name).j();
            }
        }
    }
}
