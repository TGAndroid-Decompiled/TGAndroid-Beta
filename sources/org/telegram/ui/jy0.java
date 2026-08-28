package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class jy0 implements yp {
    public final TLRPC.Chat f39649a;
    public final bq f39650b;
    public final ProfileActivity f39651c;

    public jy0(ProfileActivity profileActivity, TLRPC.Chat chat, bq bqVar) {
        this.f39651c = profileActivity;
        this.f39649a = chat;
        this.f39650b = bqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i9;
        ProfileActivity profileActivity = this.f39651c;
        UndoView undoView = profileActivity.I;
        long j10 = -profileActivity.f35926b1;
        if (profileActivity.A2.megagroup) {
            i9 = 10;
        } else {
            i9 = 9;
        }
        undoView.m(j10, user, i9);
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f39651c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35920a1));
        if (user != null && (chat = this.f39649a) != null && profileActivity.f35920a1 != 0) {
            bq bqVar = this.f39650b;
            if (bqVar.M && bqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.o2 o2Var : bqVar.getParentLayout().getFragmentStack()) {
                    if (o2Var instanceof pb) {
                        pb pbVar = (pb) o2Var;
                        pbVar.W0();
                        AndroidUtilities.runOnUIThread(new ye0(pbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
