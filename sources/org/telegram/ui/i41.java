package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class i41 extends ip {
    public final boolean[] f46107d1;
    public final r41 f46108e1;
    public final k41 f46109f1;

    public i41(k41 k41Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, r41 r41Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f46109f1 = k41Var;
        this.f46107d1 = zArr;
        this.f46108e1 = r41Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f46107d1[0]) {
            r41 r41Var = this.f46108e1;
            if (org.telegram.ui.Components.fc.a(r41Var)) {
                org.telegram.ui.Components.fc.C(this.f46109f1.f46766a.first_name, r41Var).j();
            }
        }
    }
}
