package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class oq extends bq {
    public final boolean[] Z0;
    public final long f41229a1;
    public final jr f41230b1;

    public oq(jr jrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i9, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i9, true, false, null);
        this.f41230b1 = jrVar;
        this.Z0 = zArr;
        this.f41229a1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            jr jrVar = this.f41230b1;
            if (org.telegram.ui.Components.oc.a(jrVar)) {
                long j10 = this.f41229a1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.oc.C(jrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.oc.C(jrVar, chat.title).j();
                }
            }
        }
    }
}
