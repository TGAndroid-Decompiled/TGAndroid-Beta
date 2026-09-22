package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cr extends pq {
    public final boolean[] f32851d1;
    public final long f32852e1;
    public final ur f32853f1;

    public cr(ur urVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f32853f1 = urVar;
        this.f32851d1 = zArr;
        this.f32852e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f32851d1[0]) {
            ur urVar = this.f32853f1;
            if (org.telegram.ui.Components.vc.a(urVar)) {
                long j3 = this.f32852e1;
                if (j3 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        org.telegram.ui.Components.vc.C(urVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    org.telegram.ui.Components.vc.C(urVar, chat.title).j();
                }
            }
        }
    }
}
