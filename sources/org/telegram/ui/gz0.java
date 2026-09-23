package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gz0 implements iq {
    public final TLRPC.Chat f33681a;
    public final lq f33682b;
    public final ProfileActivity f33683c;

    public gz0(ProfileActivity profileActivity, TLRPC.Chat chat, lq lqVar) {
        this.f33683c = profileActivity;
        this.f33681a = chat;
        this.f33682b = lqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f33683c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f31248f1;
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
        ProfileActivity profileActivity = this.f33683c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31240e1));
        if (user != null && (chat = this.f33681a) != null && profileActivity.f31240e1 != 0) {
            lq lqVar = this.f33682b;
            if (lqVar.Q && lqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : lqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof ub) {
                        ub ubVar = (ub) n2Var;
                        ubVar.V0();
                        AndroidUtilities.runOnUIThread(new kf0(ubVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
