package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ja1 extends kq {
    public final boolean[] f34721d1;
    public final sa1 f34722e1;
    public final la1 f34723f1;

    public ja1(la1 la1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, sa1 sa1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f34723f1 = la1Var;
        this.f34721d1 = zArr;
        this.f34722e1 = sa1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f34721d1[0]) {
            sa1 sa1Var = this.f34722e1;
            if (org.telegram.ui.Components.yc.a(sa1Var)) {
                org.telegram.ui.Components.yc.C(sa1Var, this.f34723f1.f35255a.first_name).j();
            }
        }
    }
}
