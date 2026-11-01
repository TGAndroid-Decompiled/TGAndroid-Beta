package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class j61 extends iq {
    public final boolean[] f38292c1;
    public final s61 f38293d1;
    public final l61 f38294e1;

    public j61(l61 l61Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, s61 s61Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f38294e1 = l61Var;
        this.f38292c1 = zArr;
        this.f38293d1 = s61Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f38292c1[0]) {
            s61 s61Var = this.f38293d1;
            if (org.telegram.ui.Components.cc.a(s61Var)) {
                org.telegram.ui.Components.cc.C(this.f38294e1.f39105a.first_name, s61Var).j();
            }
        }
    }
}
