package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class k91 extends dq {
    public final boolean[] Z0;
    public final t91 f39814a1;
    public final m91 f39815b1;

    public k91(m91 m91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, t91 t91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f39815b1 = m91Var;
        this.Z0 = zArr;
        this.f39814a1 = t91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            t91 t91Var = this.f39814a1;
            if (org.telegram.ui.Components.tc.a(t91Var)) {
                org.telegram.ui.Components.tc.C(t91Var, this.f39815b1.f40500a.first_name).j();
            }
        }
    }
}
