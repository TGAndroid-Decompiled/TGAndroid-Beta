package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gz0 extends kq {
    public final boolean[] f37291a1;
    public final TLRPC.User f37292b1;
    public final ProfileActivity f37293c1;

    public gz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f37293c1 = profileActivity;
        this.f37291a1 = zArr;
        this.f37292b1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.f37291a1[0]) {
            ProfileActivity profileActivity = this.f37293c1;
            if (org.telegram.ui.Components.qc.a(profileActivity)) {
                org.telegram.ui.Components.qc.C(profileActivity, this.f37292b1.first_name).j();
            }
        }
    }
}
