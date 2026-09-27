package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gz0 implements iq {
    public final TLRPC.Chat f34072a;
    public final lq f34073b;
    public final ProfileActivity f34074c;

    public gz0(ProfileActivity profileActivity, TLRPC.Chat chat, lq lqVar) {
        this.f34074c = profileActivity;
        this.f34072a = chat;
        this.f34073b = lqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f34074c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f31565f1;
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
        ProfileActivity profileActivity = this.f34074c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31557e1));
        if (user != null && (chat = this.f34072a) != null && profileActivity.f31557e1 != 0) {
            lq lqVar = this.f34073b;
            if (lqVar.Q && lqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.o2 o2Var : lqVar.getParentLayout().getFragmentStack()) {
                    if (o2Var instanceof wb) {
                        wb wbVar = (wb) o2Var;
                        wbVar.V0();
                        AndroidUtilities.runOnUIThread(new mf0(wbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
