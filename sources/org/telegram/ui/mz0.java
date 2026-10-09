package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class mz0 implements kq {
    public final TLRPC.Chat f40035a;
    public final nq f40036b;
    public final ProfileActivity f40037c;

    public mz0(ProfileActivity profileActivity, TLRPC.Chat chat, nq nqVar) {
        this.f40037c = profileActivity;
        this.f40035a = chat;
        this.f40036b = nqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f40037c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f34251f1;
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
        ProfileActivity profileActivity = this.f40037c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34243e1));
        if (user != null && (chat = this.f40035a) != null && profileActivity.f34243e1 != 0) {
            nq nqVar = this.f40036b;
            if (nqVar.Q && nqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : nqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof vb) {
                        vb vbVar = (vb) n2Var;
                        vbVar.V0();
                        AndroidUtilities.runOnUIThread(new of0(vbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
