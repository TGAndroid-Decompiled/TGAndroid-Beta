package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nz0 extends kq {
    public final boolean[] f36018d1;
    public final TLRPC.User f36019e1;
    public final ProfileActivity f36020f1;

    public nz0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f36020f1 = profileActivity;
        this.f36018d1 = zArr;
        this.f36019e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f36018d1[0]) {
            ProfileActivity profileActivity = this.f36020f1;
            if (org.telegram.ui.Components.xc.a(profileActivity)) {
                org.telegram.ui.Components.xc.C(profileActivity, this.f36019e1.first_name).j();
            }
        }
    }
}
