package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hv0 extends np {
    public final boolean[] f48639d1;
    public final TLRPC.User f48640e1;
    public final ProfileActivity f48641f1;

    public hv0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f48641f1 = profileActivity;
        this.f48639d1 = zArr;
        this.f48640e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f48639d1[0]) {
            ProfileActivity profileActivity = this.f48641f1;
            if (org.telegram.ui.Components.kc.a(profileActivity)) {
                org.telegram.ui.Components.kc.C(this.f48640e1.first_name, profileActivity).j();
            }
        }
    }
}
