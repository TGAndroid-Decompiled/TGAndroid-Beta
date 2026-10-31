package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class l61 extends iq {
    public final boolean[] f39072c1;
    public final u61 f39073d1;
    public final n61 f39074e1;

    public l61(n61 n61Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, u61 u61Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f39074e1 = n61Var;
        this.f39072c1 = zArr;
        this.f39073d1 = u61Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f39072c1[0]) {
            u61 u61Var = this.f39073d1;
            if (org.telegram.ui.Components.cc.a(u61Var)) {
                org.telegram.ui.Components.cc.C(this.f39074e1.f39841a.first_name, u61Var).j();
            }
        }
    }
}
