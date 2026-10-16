package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class c01 extends tq {
    public final boolean[] f34408d1;
    public final TLRPC.User f34409e1;
    public final ProfileActivity f34410f1;

    public c01(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f34410f1 = profileActivity;
        this.f34408d1 = zArr;
        this.f34409e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f34408d1[0]) {
            ProfileActivity profileActivity = this.f34410f1;
            if (org.telegram.ui.Components.zc.a(profileActivity)) {
                org.telegram.ui.Components.zc.C(profileActivity, this.f34409e1.first_name).j();
            }
        }
    }
}
