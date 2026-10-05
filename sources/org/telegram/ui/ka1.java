package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ka1 extends mq {
    public final boolean[] f37941d1;
    public final ta1 f37942e1;
    public final ma1 f37943f1;

    public ka1(ma1 ma1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, ta1 ta1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f37943f1 = ma1Var;
        this.f37941d1 = zArr;
        this.f37942e1 = ta1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f37941d1[0]) {
            ta1 ta1Var = this.f37942e1;
            if (org.telegram.ui.Components.yc.a(ta1Var)) {
                org.telegram.ui.Components.yc.C(ta1Var, this.f37943f1.f38555a.first_name).j();
            }
        }
    }
}
