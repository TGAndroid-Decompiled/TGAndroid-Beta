package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jv0 extends np {
    public final boolean[] f49072d1;
    public final TLRPC.User f49073e1;
    public final ProfileActivity f49074f1;

    public jv0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f49074f1 = profileActivity;
        this.f49072d1 = zArr;
        this.f49073e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f49072d1[0]) {
            ProfileActivity profileActivity = this.f49074f1;
            if (org.telegram.ui.Components.lc.a(profileActivity)) {
                org.telegram.ui.Components.lc.C(this.f49073e1.first_name, profileActivity).j();
            }
        }
    }
}
