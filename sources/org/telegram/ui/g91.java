package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class g91 extends bq {
    public final boolean[] f37270d1;
    public final p91 f37271e1;
    public final i91 f37272f1;

    public g91(i91 i91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, p91 p91Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f37272f1 = i91Var;
        this.f37270d1 = zArr;
        this.f37271e1 = p91Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f37270d1[0]) {
            p91 p91Var = this.f37271e1;
            if (org.telegram.ui.Components.xc.a(p91Var)) {
                org.telegram.ui.Components.xc.C(p91Var, this.f37272f1.f37905a.first_name).j();
            }
        }
    }
}
