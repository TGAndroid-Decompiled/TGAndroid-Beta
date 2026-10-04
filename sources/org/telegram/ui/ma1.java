package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ma1 extends mq {
    public final boolean[] f38511d1;
    public final va1 f38512e1;
    public final oa1 f38513f1;

    public ma1(oa1 oa1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, va1 va1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f38513f1 = oa1Var;
        this.f38511d1 = zArr;
        this.f38512e1 = va1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f38511d1[0]) {
            va1 va1Var = this.f38512e1;
            if (org.telegram.ui.Components.yc.a(va1Var)) {
                org.telegram.ui.Components.yc.C(va1Var, this.f38513f1.f39150a.first_name).j();
            }
        }
    }
}
