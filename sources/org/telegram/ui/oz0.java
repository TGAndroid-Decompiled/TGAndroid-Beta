package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class oz0 implements nq {
    public final TLRPC.Chat f39391a;
    public final qq f39392b;
    public final ProfileActivity f39393c;

    public oz0(ProfileActivity profileActivity, TLRPC.Chat chat, qq qqVar) {
        this.f39393c = profileActivity;
        this.f39391a = chat;
        this.f39392b = qqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f39393c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f33924f1;
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
        ProfileActivity profileActivity = this.f39393c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33916e1));
        if (user != null && (chat = this.f39391a) != null && profileActivity.f33916e1 != 0) {
            qq qqVar = this.f39392b;
            if (qqVar.Q && qqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : qqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof ub) {
                        ub ubVar = (ub) n2Var;
                        ubVar.W0();
                        AndroidUtilities.runOnUIThread(new pf0(ubVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
