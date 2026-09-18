package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class nz0 implements kq {
    public final TLRPC.Chat f36080a;
    public final nq f36081b;
    public final ProfileActivity f36082c;

    public nz0(ProfileActivity profileActivity, TLRPC.Chat chat, nq nqVar) {
        this.f36082c = profileActivity;
        this.f36080a = chat;
        this.f36081b = nqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f36082c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f31521f1;
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
        ProfileActivity profileActivity = this.f36082c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f31513e1));
        if (user != null && (chat = this.f36080a) != null && profileActivity.f31513e1 != 0) {
            nq nqVar = this.f36081b;
            if (nqVar.Q && nqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : nqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof vb) {
                        vb vbVar = (vb) n2Var;
                        vbVar.V0();
                        AndroidUtilities.runOnUIThread(new qf0(vbVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
