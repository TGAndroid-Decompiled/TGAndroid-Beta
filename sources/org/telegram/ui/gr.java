package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class gr extends tq {
    public final boolean[] f36469d1;
    public final long f36470e1;
    public final yr f36471f1;

    public gr(yr yrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f36471f1 = yrVar;
        this.f36469d1 = zArr;
        this.f36470e1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f36469d1[0]) {
            yr yrVar = this.f36471f1;
            if (org.telegram.ui.Components.zc.a(yrVar)) {
                long j10 = this.f36470e1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.zc.C(yrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.zc.C(yrVar, chat.title).j();
                }
            }
        }
    }
}
