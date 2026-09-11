package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class oz0 implements nq {
    public final TLRPC.Chat f39363a;
    public final qq f39364b;
    public final ProfileActivity f39365c;

    public oz0(ProfileActivity profileActivity, TLRPC.Chat chat, qq qqVar) {
        this.f39365c = profileActivity;
        this.f39363a = chat;
        this.f39364b = qqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f39365c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f33896f1;
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
        ProfileActivity profileActivity = this.f39365c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33888e1));
        if (user != null && (chat = this.f39363a) != null && profileActivity.f33888e1 != 0) {
            qq qqVar = this.f39364b;
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
