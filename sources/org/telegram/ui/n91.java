package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class n91 extends gq {
    public final boolean[] f41821c1;
    public final w91 f41822d1;
    public final p91 f41823e1;

    public n91(p91 p91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, w91 w91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f41823e1 = p91Var;
        this.f41821c1 = zArr;
        this.f41822d1 = w91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f41821c1[0]) {
            w91 w91Var = this.f41822d1;
            if (org.telegram.ui.Components.wc.a(w91Var)) {
                org.telegram.ui.Components.wc.C(w91Var, this.f41823e1.f42411a.first_name).j();
            }
        }
    }
}
