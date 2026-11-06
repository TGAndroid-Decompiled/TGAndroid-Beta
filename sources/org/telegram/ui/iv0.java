package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class iv0 extends kp {
    public final boolean[] f46750c1;
    public final TLRPC.User f46751d1;
    public final ProfileActivity f46752e1;

    public iv0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f46752e1 = profileActivity;
        this.f46750c1 = zArr;
        this.f46751d1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.f46750c1[0]) {
            ProfileActivity profileActivity = this.f46752e1;
            if (org.telegram.ui.Components.hc.a(profileActivity)) {
                org.telegram.ui.Components.hc.C(this.f46751d1.first_name, profileActivity).j();
            }
        }
    }
}
