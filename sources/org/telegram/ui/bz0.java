package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class bz0 implements hq {
    public final TLRPC.Chat f35640a;
    public final kq f35641b;
    public final ProfileActivity f35642c;

    public bz0(ProfileActivity profileActivity, TLRPC.Chat chat, kq kqVar) {
        this.f35642c = profileActivity;
        this.f35640a = chat;
        this.f35641b = kqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f35642c;
        UndoView undoView = profileActivity.J;
        long j10 = -profileActivity.f34577c1;
        if (profileActivity.B2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f35642c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34569b1));
        if (user != null && (chat = this.f35640a) != null && profileActivity.f34569b1 != 0) {
            kq kqVar = this.f35641b;
            if (kqVar.N && kqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.p2 p2Var : kqVar.getParentLayout().getFragmentStack()) {
                    if (p2Var instanceof sb) {
                        sb sbVar = (sb) p2Var;
                        sbVar.W0();
                        AndroidUtilities.runOnUIThread(new if0(sbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
