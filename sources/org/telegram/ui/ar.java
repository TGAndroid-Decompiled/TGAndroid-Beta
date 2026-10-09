package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ar extends nq {
    public final boolean[] f36001d1;
    public final long f36002e1;
    public final tr f36003f1;

    public ar(tr trVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f36003f1 = trVar;
        this.f36001d1 = zArr;
        this.f36002e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f36001d1[0]) {
            tr trVar = this.f36003f1;
            if (org.telegram.ui.Components.ad.a(trVar)) {
                long j3 = this.f36002e1;
                if (j3 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        org.telegram.ui.Components.ad.C(trVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    org.telegram.ui.Components.ad.C(trVar, chat.title).j();
                }
            }
        }
    }
}
