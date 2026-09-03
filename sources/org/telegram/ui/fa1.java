package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fa1 extends lq {
    public final boolean[] f34016a1;
    public final oa1 f34017b1;
    public final ha1 f34018c1;

    public fa1(ha1 ha1Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, boolean[] zArr, oa1 oa1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z4, null);
        this.f34018c1 = ha1Var;
        this.f34016a1 = zArr;
        this.f34017b1 = oa1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.f34016a1[0]) {
            oa1 oa1Var = this.f34017b1;
            if (org.telegram.ui.Components.qc.a(oa1Var)) {
                org.telegram.ui.Components.qc.C(oa1Var, this.f34018c1.f34624a.first_name).j();
            }
        }
    }
}
