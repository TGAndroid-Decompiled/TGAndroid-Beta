package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class oz0 implements mq {
    public final TLRPC.Chat f36376a;
    public final pq f36377b;
    public final ProfileActivity f36378c;

    public oz0(ProfileActivity profileActivity, TLRPC.Chat chat, pq pqVar) {
        this.f36378c = profileActivity;
        this.f36376a = chat;
        this.f36377b = pqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f36378c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f31274f1;
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
        ProfileActivity profileActivity = this.f36378c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31266e1));
        if (user != null && (chat = this.f36376a) != null && profileActivity.f31266e1 != 0) {
            pq pqVar = this.f36377b;
            if (pqVar.Q && pqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : pqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof ub) {
                        ub ubVar = (ub) n2Var;
                        ubVar.V0();
                        AndroidUtilities.runOnUIThread(new pf0(ubVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
