package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class h91 extends dq {
    public final boolean[] Z0;

    public final q91 f38759a1;

    public final j91 f38760b1;

    public h91(j91 j91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, q91 q91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f38760b1 = j91Var;
        this.Z0 = zArr;
        this.f38759a1 = q91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            q91 q91Var = this.f38759a1;
            if (org.telegram.ui.Components.mc.a(q91Var)) {
                org.telegram.ui.Components.mc.C(q91Var, this.f38760b1.f39311a.first_name).j();
            }
        }
    }
}
