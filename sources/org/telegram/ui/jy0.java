package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class jy0 implements aq {
    public final TLRPC.Chat f39705a;
    public final dq f39706b;
    public final ProfileActivity f39707c;

    public jy0(ProfileActivity profileActivity, TLRPC.Chat chat, dq dqVar) {
        this.f39707c = profileActivity;
        this.f39705a = chat;
        this.f39706b = dqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f39707c;
        UndoView undoView = profileActivity.I;
        long j10 = -profileActivity.f35993b1;
        if (profileActivity.A2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f39707c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35986a1));
        if (user != null && (chat = this.f39705a) != null && profileActivity.f35986a1 != 0) {
            dq dqVar = this.f39706b;
            if (dqVar.M && dqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.o2 o2Var : dqVar.getParentLayout().getFragmentStack()) {
                    if (o2Var instanceof ob) {
                        ob obVar = (ob) o2Var;
                        obVar.W0();
                        AndroidUtilities.runOnUIThread(new xe0(obVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
