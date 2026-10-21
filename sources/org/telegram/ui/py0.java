package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class py0 implements yp {
    public final TLRPC.Chat f40316a;
    public final bq f40317b;
    public final ProfileActivity f40318c;

    public py0(ProfileActivity profileActivity, TLRPC.Chat chat, bq bqVar) {
        this.f40318c = profileActivity;
        this.f40316a = chat;
        this.f40317b = bqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f40318c;
        UndoView undoView = profileActivity.M;
        long j10 = -profileActivity.f33627g1;
        if (profileActivity.F2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.f40318c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33620f1));
        if (user != null && (chat = this.f40316a) != null && profileActivity.f33620f1 != 0) {
            bq bqVar = this.f40317b;
            if (bqVar.Q && bqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.n2 n2Var : bqVar.getParentLayout().getFragmentStack()) {
                    if (n2Var instanceof vb) {
                        vb vbVar = (vb) n2Var;
                        vbVar.V0();
                        AndroidUtilities.runOnUIThread(new ve0(vbVar, user, chat, 26));
                        return;
                    }
                }
            }
        }
    }
}
