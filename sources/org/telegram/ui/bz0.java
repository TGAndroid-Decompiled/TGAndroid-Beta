package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bz0 extends dq {
    public final boolean[] f35780d1;
    public final TLRPC.User f35781e1;
    public final ProfileActivity f35782f1;

    public bz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f35782f1 = profileActivity;
        this.f35780d1 = zArr;
        this.f35781e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f35780d1[0]) {
            ProfileActivity profileActivity = this.f35782f1;
            if (org.telegram.ui.Components.xc.a(profileActivity)) {
                org.telegram.ui.Components.xc.C(profileActivity, this.f35781e1.first_name).j();
            }
        }
    }
}
