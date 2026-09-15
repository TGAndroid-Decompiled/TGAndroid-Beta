package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pa1 extends pq {
    public final boolean[] f36521d1;
    public final ya1 f36522e1;
    public final ra1 f36523f1;

    public pa1(ra1 ra1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, ya1 ya1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f36523f1 = ra1Var;
        this.f36521d1 = zArr;
        this.f36522e1 = ya1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f36521d1[0]) {
            ya1 ya1Var = this.f36522e1;
            if (org.telegram.ui.Components.vc.a(ya1Var)) {
                org.telegram.ui.Components.vc.C(ya1Var, this.f36523f1.f37064a.first_name).j();
            }
        }
    }
}
