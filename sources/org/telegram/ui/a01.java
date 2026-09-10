package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class a01 extends rq {
    public final boolean[] f30761d1;
    public final TLRPC.User f30762e1;
    public final ProfileActivity f30763f1;

    public a01(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f30763f1 = profileActivity;
        this.f30761d1 = zArr;
        this.f30762e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f30761d1[0]) {
            ProfileActivity profileActivity = this.f30763f1;
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.C(profileActivity, this.f30762e1.first_name).j();
            }
        }
    }
}
