package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gv0 extends mp {
    public final boolean[] f47530d1;
    public final TLRPC.User f47531e1;
    public final ProfileActivity f47532f1;

    public gv0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f47532f1 = profileActivity;
        this.f47530d1 = zArr;
        this.f47531e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f47530d1[0]) {
            ProfileActivity profileActivity = this.f47532f1;
            if (org.telegram.ui.Components.cc.a(profileActivity)) {
                org.telegram.ui.Components.cc.C(this.f47531e1.first_name, profileActivity).j();
            }
        }
    }
}
