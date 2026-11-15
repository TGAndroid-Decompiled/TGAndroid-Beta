package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class q41 extends mp {
    public final boolean[] f50470d1;
    public final z41 f50471e1;
    public final s41 f50472f1;

    public q41(s41 s41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, z41 z41Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f50472f1 = s41Var;
        this.f50470d1 = zArr;
        this.f50471e1 = z41Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f50470d1[0]) {
            z41 z41Var = this.f50471e1;
            if (org.telegram.ui.Components.cc.a(z41Var)) {
                org.telegram.ui.Components.cc.C(this.f50472f1.f51098a.first_name, z41Var).j();
            }
        }
    }
}
