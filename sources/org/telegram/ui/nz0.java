package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nz0 extends kq {
    public final boolean[] f35994d1;
    public final TLRPC.User f35995e1;
    public final ProfileActivity f35996f1;

    public nz0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f35996f1 = profileActivity;
        this.f35994d1 = zArr;
        this.f35995e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f35994d1[0]) {
            ProfileActivity profileActivity = this.f35996f1;
            if (org.telegram.ui.Components.yc.a(profileActivity)) {
                org.telegram.ui.Components.yc.C(profileActivity, this.f35995e1.first_name).j();
            }
        }
    }
}
