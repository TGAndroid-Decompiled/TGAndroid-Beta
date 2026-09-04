package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dr extends qq {
    public final boolean[] f35844d1;
    public final long f35845e1;
    public final vr f35846f1;

    public dr(vr vrVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f35846f1 = vrVar;
        this.f35844d1 = zArr;
        this.f35845e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f35844d1[0]) {
            vr vrVar = this.f35846f1;
            if (org.telegram.ui.Components.yc.a(vrVar)) {
                long j3 = this.f35845e1;
                if (j3 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        org.telegram.ui.Components.yc.C(vrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    org.telegram.ui.Components.yc.C(vrVar, chat.title).j();
                }
            }
        }
    }
}
