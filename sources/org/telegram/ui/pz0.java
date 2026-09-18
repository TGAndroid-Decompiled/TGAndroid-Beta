package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class pz0 implements mq {
    public final TLRPC.Chat f36766a;
    public final pq f36767b;
    public final ProfileActivity f36768c;

    public pz0(ProfileActivity profileActivity, TLRPC.Chat chat, pq pqVar) {
        this.f36768c = profileActivity;
        this.f36766a = chat;
        this.f36767b = pqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f36768c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f31294f1;
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
        ProfileActivity profileActivity = this.f36768c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31286e1));
        if (user != null && (chat = this.f36766a) != null && profileActivity.f31286e1 != 0) {
            pq pqVar = this.f36767b;
            if (pqVar.Q && pqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.o2 o2Var : pqVar.getParentLayout().getFragmentStack()) {
                    if (o2Var instanceof wb) {
                        wb wbVar = (wb) o2Var;
                        wbVar.V0();
                        AndroidUtilities.runOnUIThread(new rf0(wbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
