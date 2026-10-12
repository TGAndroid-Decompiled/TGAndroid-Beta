package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d01 extends tq {
    public final boolean[] f35103d1;
    public final TLRPC.User f35104e1;
    public final ProfileActivity f35105f1;

    public d01(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f35105f1 = profileActivity;
        this.f35103d1 = zArr;
        this.f35104e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f35103d1[0]) {
            ProfileActivity profileActivity = this.f35105f1;
            if (org.telegram.ui.Components.zc.a(profileActivity)) {
                org.telegram.ui.Components.zc.C(profileActivity, this.f35104e1.first_name).j();
            }
        }
    }
}
