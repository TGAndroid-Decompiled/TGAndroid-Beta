package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class jy0 implements aq {

    public final TLRPC.Chat f39539a;

    public final dq f39540b;

    public final ProfileActivity f39541c;

    public jy0(ProfileActivity profileActivity, TLRPC.Chat chat, dq dqVar) {
        this.f39541c = profileActivity;
        this.f39539a = chat;
        this.f39540b = dqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        ProfileActivity profileActivity = this.f39541c;
        profileActivity.I.m(-profileActivity.f35929b1, user, profileActivity.A2.megagroup ? 10 : 9);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f39541c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1));
        if (user == null || (chat = this.f39539a) == null || profileActivity.f35923a1 == 0) {
            return;
        }
        dq dqVar = this.f39540b;
        if (!dqVar.M || dqVar.getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : dqVar.getParentLayout().getFragmentStack()) {
            if (n2Var instanceof qb) {
                qb qbVar = (qb) n2Var;
                qbVar.W0();
                AndroidUtilities.runOnUIThread(new bf0(qbVar, user, chat, 25));
                return;
            }
        }
    }
}
