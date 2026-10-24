package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cz0 extends dq {
    public final boolean[] f36427e1;
    public final TLRPC.User f36428f1;
    public final ProfileActivity f36429g1;

    public cz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f36429g1 = profileActivity;
        this.f36427e1 = zArr;
        this.f36428f1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f36427e1[0]) {
            ProfileActivity profileActivity = this.f36429g1;
            if (org.telegram.ui.Components.vc.a(profileActivity)) {
                org.telegram.ui.Components.vc.C(profileActivity, this.f36428f1.first_name).j();
            }
        }
    }
}
