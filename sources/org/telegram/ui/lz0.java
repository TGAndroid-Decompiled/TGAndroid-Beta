package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class lz0 implements kq {
    public final TLRPC.Chat f39777a;
    public final nq f39778b;
    public final ProfileActivity f39779c;

    public lz0(ProfileActivity profileActivity, TLRPC.Chat chat, nq nqVar) {
        this.f39779c = profileActivity;
        this.f39777a = chat;
        this.f39778b = nqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f39779c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f34279f1;
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
        ProfileActivity profileActivity = this.f39779c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34271e1));
        if (user != null && (chat = this.f39777a) != null && profileActivity.f34271e1 != 0) {
            nq nqVar = this.f39778b;
            if (nqVar.Q && nqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.m2 m2Var : nqVar.getParentLayout().getFragmentStack()) {
                    if (m2Var instanceof ub) {
                        ub ubVar = (ub) m2Var;
                        ubVar.V0();
                        AndroidUtilities.runOnUIThread(new nf0(ubVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
