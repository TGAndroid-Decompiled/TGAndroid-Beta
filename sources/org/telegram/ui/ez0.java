package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ez0 implements hq {
    public final TLRPC.Chat f33488a;
    public final kq f33489b;
    public final ProfileActivity f33490c;

    public ez0(ProfileActivity profileActivity, TLRPC.Chat chat, kq kqVar) {
        this.f33490c = profileActivity;
        this.f33488a = chat;
        this.f33489b = kqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f33490c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f31563f1;
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
        ProfileActivity profileActivity = this.f33490c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31555e1));
        if (user != null && (chat = this.f33488a) != null && profileActivity.f31555e1 != 0) {
            kq kqVar = this.f33489b;
            if (kqVar.Q && kqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.m2 m2Var : kqVar.getParentLayout().getFragmentStack()) {
                    if (m2Var instanceof ub) {
                        ub ubVar = (ub) m2Var;
                        ubVar.V0();
                        AndroidUtilities.runOnUIThread(new jf0(ubVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
