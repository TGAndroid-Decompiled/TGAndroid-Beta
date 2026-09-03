package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kz0 extends lq {
    public final boolean[] f35610a1;
    public final TLRPC.User f35611b1;
    public final ProfileActivity f35612c1;

    public kz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f35612c1 = profileActivity;
        this.f35610a1 = zArr;
        this.f35611b1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.f35610a1[0]) {
            ProfileActivity profileActivity = this.f35612c1;
            if (org.telegram.ui.Components.qc.a(profileActivity)) {
                org.telegram.ui.Components.qc.C(profileActivity, this.f35611b1.first_name).j();
            }
        }
    }
}
