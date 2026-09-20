package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class nz0 implements kq {
    public final TLRPC.Chat f36157a;
    public final nq f36158b;
    public final ProfileActivity f36159c;

    public nz0(ProfileActivity profileActivity, TLRPC.Chat chat, nq nqVar) {
        this.f36159c = profileActivity;
        this.f36157a = chat;
        this.f36158b = nqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f36159c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f31561f1;
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
        ProfileActivity profileActivity = this.f36159c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31553e1));
        if (user != null && (chat = this.f36157a) != null && profileActivity.f31553e1 != 0) {
            nq nqVar = this.f36158b;
            if (nqVar.Q && nqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : nqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof vb) {
                        vb vbVar = (vb) n2Var;
                        vbVar.V0();
                        AndroidUtilities.runOnUIThread(new rf0(vbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
