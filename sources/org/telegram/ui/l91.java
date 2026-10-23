package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class l91 extends dq {
    public final boolean[] f39202e1;
    public final u91 f39203f1;
    public final n91 f39204g1;

    public l91(n91 n91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, u91 u91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f39204g1 = n91Var;
        this.f39202e1 = zArr;
        this.f39203f1 = u91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f39202e1[0]) {
            u91 u91Var = this.f39203f1;
            if (org.telegram.ui.Components.xc.a(u91Var)) {
                org.telegram.ui.Components.xc.C(u91Var, this.f39204g1.f39831a.first_name).j();
            }
        }
    }
}
