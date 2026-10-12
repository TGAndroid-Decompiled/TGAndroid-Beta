package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class oz0 implements nq {
    public final TLRPC.Chat f40818a;
    public final qq f40819b;
    public final ProfileActivity f40820c;

    public oz0(ProfileActivity profileActivity, TLRPC.Chat chat, qq qqVar) {
        this.f40820c = profileActivity;
        this.f40818a = chat;
        this.f40819b = qqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f40820c;
        UndoView undoView = profileActivity.M;
        long j3 = -profileActivity.f34088f1;
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
        ProfileActivity profileActivity = this.f40820c;
        profileActivity.removeSelfFromStack();
        TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34080e1));
        if (user != null && (chat = this.f40818a) != null && profileActivity.f34080e1 != 0) {
            qq qqVar = this.f40819b;
            if (qqVar.Q && qqVar.getParentLayout() != null) {
                for (org.telegram.ui.ActionBar.m2 m2Var : qqVar.getParentLayout().getFragmentStack()) {
                    if (m2Var instanceof yb) {
                        yb ybVar = (yb) m2Var;
                        ybVar.V0();
                        AndroidUtilities.runOnUIThread(new pf0(ybVar, user, chat, 25));
                        return;
                    }
                }
            }
        }
    }
}
