package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class i91 extends dq {
    public final boolean[] f37833d1;
    public final r91 f37834e1;
    public final k91 f37835f1;

    public i91(k91 k91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, r91 r91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f37835f1 = k91Var;
        this.f37833d1 = zArr;
        this.f37834e1 = r91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f37833d1[0]) {
            r91 r91Var = this.f37834e1;
            if (org.telegram.ui.Components.xc.a(r91Var)) {
                org.telegram.ui.Components.xc.C(r91Var, this.f37835f1.f38449a.first_name).j();
            }
        }
    }
}
