package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class iz0 extends iq {
    public final boolean[] f40295c1;
    public final TLRPC.User f40296d1;
    public final ProfileActivity f40297e1;

    public iz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f40297e1 = profileActivity;
        this.f40295c1 = zArr;
        this.f40296d1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f40295c1[0]) {
            ProfileActivity profileActivity = this.f40297e1;
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.C(profileActivity, this.f40296d1.first_name).j();
            }
        }
    }
}
