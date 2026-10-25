package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gz0 extends gq {
    public final boolean[] f39803c1;
    public final TLRPC.User f39804d1;
    public final ProfileActivity f39805e1;

    public gz0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f39805e1 = profileActivity;
        this.f39803c1 = zArr;
        this.f39804d1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f39803c1[0]) {
            ProfileActivity profileActivity = this.f39805e1;
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.C(profileActivity, this.f39804d1.first_name).j();
            }
        }
    }
}
