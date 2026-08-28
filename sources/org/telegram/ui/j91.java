package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class j91 extends bq {
    public final boolean[] Z0;
    public final s91 f39412a1;
    public final l91 f39413b1;

    public j91(l91 l91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, s91 s91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f39413b1 = l91Var;
        this.Z0 = zArr;
        this.f39412a1 = s91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            s91 s91Var = this.f39412a1;
            if (org.telegram.ui.Components.oc.a(s91Var)) {
                org.telegram.ui.Components.oc.C(s91Var, this.f39413b1.f40087a.first_name).j();
            }
        }
    }
}
