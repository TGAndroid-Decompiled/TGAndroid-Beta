package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class er extends rq {
    public final boolean[] f32585d1;
    public final long f32586e1;
    public final wr f32587f1;

    public er(wr wrVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f32587f1 = wrVar;
        this.f32585d1 = zArr;
        this.f32586e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f32585d1[0]) {
            wr wrVar = this.f32587f1;
            if (org.telegram.ui.Components.wc.a(wrVar)) {
                long j3 = this.f32586e1;
                if (j3 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        org.telegram.ui.Components.wc.C(wrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    org.telegram.ui.Components.wc.C(wrVar, chat.title).j();
                }
            }
        }
    }
}
