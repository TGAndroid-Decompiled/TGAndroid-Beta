package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lv0 extends mp {
    public final boolean[] f47700c1;
    public final TLRPC.User f47701d1;
    public final ProfileActivity f47702e1;

    public lv0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f47702e1 = profileActivity;
        this.f47700c1 = zArr;
        this.f47701d1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.f47700c1[0]) {
            ProfileActivity profileActivity = this.f47702e1;
            if (org.telegram.ui.Components.gc.a(profileActivity)) {
                org.telegram.ui.Components.gc.C(this.f47701d1.first_name, profileActivity).j();
            }
        }
    }
}
