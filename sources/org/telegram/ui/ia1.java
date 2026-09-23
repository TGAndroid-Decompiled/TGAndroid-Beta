package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ia1 extends lq {
    public final boolean[] f34086d1;
    public final ra1 f34087e1;
    public final ka1 f34088f1;

    public ia1(ka1 ka1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, ra1 ra1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f34088f1 = ka1Var;
        this.f34086d1 = zArr;
        this.f34087e1 = ra1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f34086d1[0]) {
            ra1 ra1Var = this.f34087e1;
            if (org.telegram.ui.Components.xc.a(ra1Var)) {
                org.telegram.ui.Components.xc.C(ra1Var, this.f34088f1.f34663a.first_name).j();
            }
        }
    }
}
