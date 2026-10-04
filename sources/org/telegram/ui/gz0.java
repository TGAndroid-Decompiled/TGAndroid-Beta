package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gz0 implements jq {
    public final TLRPC.Chat f36787a;
    public final mq f36788b;
    public final ProfileActivity f36789c;

    public gz0(ProfileActivity profileActivity, TLRPC.Chat chat, mq mqVar) {
        this.f36789c = profileActivity;
        this.f36787a = chat;
        this.f36788b = mqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f36789c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f34241f1;
        if (profileActivity.E2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j3, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f36789c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34233e1));
        if (user != null && (chat = this.f36787a) != null && profileActivity.f34233e1 != 0) {
            mq mqVar = this.f36788b;
            if (mqVar.Q && mqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : mqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof wb) {
                        wb wbVar = (wb) n2Var;
                        wbVar.V0();
                        AndroidUtilities.runOnUIThread(new nf0(wbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
