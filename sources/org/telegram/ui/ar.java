package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ar extends nq {
    public final boolean[] f32164d1;
    public final long f32165e1;
    public final sr f32166f1;

    public ar(sr srVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f32166f1 = srVar;
        this.f32164d1 = zArr;
        this.f32165e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f32164d1[0]) {
            sr srVar = this.f32166f1;
            if (org.telegram.ui.Components.xc.a(srVar)) {
                long j3 = this.f32165e1;
                if (j3 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        org.telegram.ui.Components.xc.C(srVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    org.telegram.ui.Components.xc.C(srVar, chat.title).j();
                }
            }
        }
    }
}
